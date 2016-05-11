package gov.goias.agrodefesa.chamado.abrirChamado.view;

import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.chamado.abrirChamado.containers.AbrirChamadoPageContainerInsert;
import gov.goias.agrodefesa.chamado.abrirChamado.entity.Chamado;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class AbrirChamadoViewInsert extends BaseViewInsertImpl {

    public AbrirChamadoViewInsert(Object entity) {
        super(entity, AbrirChamadoPageContainerInsert.class);
    }

    private Chamado getEntity() {
        return (Chamado) entity;
    }

    private AbrirChamadoPageContainerInsert getContainer() {
        return (AbrirChamadoPageContainerInsert) container;
    }

    @Override
    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        log.debug(Constants.MGS_INSERIDO, "SOLICITANTE", getEntity().getSolicitante());
        getContainer().solicitante.sendKeys(getEntity().getSolicitante());
        BrowserDriver.waitForElement(getContainer().solicitanteAutoComplete);
        getContainer().solicitanteAutoComplete.click();

        log.debug(Constants.MGS_INSERIDO, "TIPO SUPORTE", getEntity().getTipoSuporte());
        BrowserDriver.selectByVisibleText(getContainer().tipoSuporte, getEntity().getTipoSuporte());

        log.debug(Constants.MGS_INSERIDO, "CLASSIFICACAO", getEntity().getClassificacao());
        getContainer().classificacao.click();
        BrowserDriver.waitForElement(getContainer().classificacaoInput);
        getContainer().classificacaoInput.click();

        log.debug(Constants.MGS_INSERIDO, "TIPO CONTATO", getEntity().getTipoContato());
        BrowserDriver.selectByVisibleText(getContainer().tipoContato, getEntity().getTipoContato());

        log.debug(Constants.MGS_INSERIDO, "PROBLEMA", getEntity().getProblema());
        getContainer().problema.sendKeys(getEntity().getProblema());

        log.debug(Constants.MGS_INSERIDO, "ADOTAR CHAMADO", getEntity().getAdotarChamado());
        BrowserDriver.selectByVisibleText(getContainer().adotarChamado, getEntity().getAdotarChamado());

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }
}
