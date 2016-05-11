package gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.view;

import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.containers.DelegacaoDeAtividadesPageContainerInsert;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.entity.DelegacaoAtividade;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class DelegacaoDeAtividadesViewInsert extends BaseViewInsertImpl {

    public DelegacaoDeAtividadesViewInsert(Object entity) {
        super(entity, DelegacaoDeAtividadesPageContainerInsert.class);
    }

    private DelegacaoAtividade getEntity() {
        return (DelegacaoAtividade) entity;
    }

    private DelegacaoDeAtividadesPageContainerInsert getContainer() {
        return (DelegacaoDeAtividadesPageContainerInsert) container;
    }

    @Override
    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        log.debug(Constants.MGS_INSERIDO, "SERVIDOR DESIGNADO", getEntity().getServidorDesignado());
        getContainer().servidorDesignado.sendKeys(getEntity().getServidorDesignado());
        BrowserDriver.waitForElement(getContainer().servidorDesignadoAutoComplete);
        getContainer().servidorDesignadoAutoComplete.click();

        log.debug(Constants.MGS_INSERIDO, "MEIO TRANSPORTE", getEntity().getMeioDeTransporte());
        BrowserDriver.selectByVisibleText(getContainer().meioTransporte, getEntity().getMeioDeTransporte());

        log.debug(Constants.MGS_SELECIONADO, "ADICIONAR DESTINO");
        getContainer().adicionarDestino.click();
        BrowserDriver.waitForElement(getContainer().adicionarDestinoHome);
        getContainer().confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(getContainer().adicionarDestinoHome);

        log.debug(Constants.MGS_INSERIDO, "DATA SAIDA", getEntity().getDataSaida());
        getContainer().dataSaida.clear();
        getContainer().dataSaida.sendKeys(getEntity().getDataSaida());

        log.debug(Constants.MGS_INSERIDO, "DATA CHEGADA", getEntity().getDataChegada());
        getContainer().dataChegada.clear();
        getContainer().dataChegada.sendKeys(getEntity().getDataChegada());

        log.debug(Constants.MGS_INSERIDO, "DESCRICAO SERVICO", getEntity().getDescricaoDoServico());
        getContainer().descricaoServico.sendKeys(getEntity().getDescricaoDoServico());

        log.debug(Constants.MGS_INSERIDO, "COM PERNOITE", getEntity().getComPernoite());
        BrowserDriver.selectByVisibleText(getContainer().acompanhaAutoridade, getEntity().getComPernoite());

        log.debug(Constants.MGS_INSERIDO, "ACOMPANHA AUTORIDADE", getEntity().getAcompanhaAutoridade());
        BrowserDriver.selectByVisibleText(getContainer().acompanhaAutoridade, getEntity().getAcompanhaAutoridade());

        log.debug(Constants.MGS_INSERIDO, "TIPO RECURSO", getEntity().getTipoRecurso());
        BrowserDriver.selectByVisibleText(getContainer().tipoRecurso, getEntity().getTipoRecurso());

        log.debug(Constants.MGS_INSERIDO, "FONTE DE RECURSO", getEntity().getFonteRecurso());
        BrowserDriver.selectByVisibleText(getContainer().fonteDeRecurso, getEntity().getFonteRecurso());

        log.debug(Constants.MGS_INSERIDO, "ACAO", getEntity().getAcao());
        getContainer().acao.click();

        log.debug(Constants.MGS_INSERIDO, "META", getEntity().getMeta());
        getContainer().meta.click();

        log.debug(Constants.MGS_INSERIDO, "REALIZACAO", getEntity().getRealizacao());
        getContainer().realizacao.click();

        log.debug(Constants.MGS_INSERIDO, "EMPENHO", getEntity().getEmpenho());
        //BrowserDriver.selectByIndexWait();

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }

}
