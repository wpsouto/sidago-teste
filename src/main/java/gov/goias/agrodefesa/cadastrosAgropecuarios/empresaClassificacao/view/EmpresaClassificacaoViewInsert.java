package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.view;

import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.containers.EmpresaClassificacaoPageContainerInsert;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.entity.Classificacao;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class EmpresaClassificacaoViewInsert extends BaseViewInsertImpl {

    public EmpresaClassificacaoViewInsert(Object entity) {
        super(entity, EmpresaClassificacaoPageContainerInsert.class);
    }

    private Classificacao getEntity() {
        return (Classificacao) entity;
    }

    private EmpresaClassificacaoPageContainerInsert getContainer() {
        return (EmpresaClassificacaoPageContainerInsert) container;
    }

    @Override
    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        log.debug(Constants.MGS_INSERIDO, "TIPO CLASSIFICACAO", getEntity().getTipo_classificacao());
        BrowserDriver.selectByVisibleText(getContainer().tipoClassificacao, getEntity().getTipo_classificacao());

        log.debug(Constants.MGS_INSERIDO, "CLASSIFICACAO", getEntity().getDescricao());
        getContainer().classificacao.sendKeys(getEntity().getDescricao());

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }
}
