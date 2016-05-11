package gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.view;

import gov.goias.agrodefesa.base.view.BaseView;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.containers.AquisicaoMudasPageContainerAprovar;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.entity.AquisicaoMudas;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class AquisicaoMudasViewAprovacao extends BaseView {

    public AquisicaoMudasViewAprovacao(Object entity) {
        super(entity, AquisicaoMudasPageContainerAprovar.class);
    }

    private AquisicaoMudas getEntity() {
        return (AquisicaoMudas) entity;
    }

    private AquisicaoMudasPageContainerAprovar getContainer() {
        return (AquisicaoMudasPageContainerAprovar) container;
    }

    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        log.debug(Constants.MGS_INSERIDO, "OBSERVACAO", getEntity().getObservacao());
        getContainer().observacao.sendKeys(getEntity().getObservacao());

        log.debug(Constants.MGS_INSERIDO, "SITUACAO", getEntity().getSituacao());
        BrowserDriver.selectByVisibleText(getContainer().situacao, getEntity().getSituacao());

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }

    public void aviso() {
        log.debug(Constants.MGS_MENSAGEM, "Pronto! A situação foi atualizada.");
        BrowserDriver.waitForText(getContainer().aviso, "Pronto! A situação foi atualizada.");
        getContainer().ok.click();
    }

}
