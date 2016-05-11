package gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.view;

import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.containers.DelegacaoDeAtividadesPageContainerInsert;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.entity.DelegacaoAtividade;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

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

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }


    public static void acompanhaAutoridade(String valor) {
        BrowserDriver.selectByVisibleText(container.acompanhaAutoridade, valor);
    }

    public static void tipoRecurso(String valor) {
        BrowserDriver.selectByVisibleText(container.tipoRecurso, valor);
    }

    public static void fonteRecurso(String valor) {
        BrowserDriver.waitForElement(container.fonteDeRecurso).click();
    }

    public static void acao(String valor) {
        BrowserDriver.waitForElement(container.acao).click();
    }

    public static void meta(String valor) {
        BrowserDriver.waitForElement(container.meta).click();
    }

    public static void realizacao(String valor) {
        BrowserDriver.waitForElement(container.realizacao).click();
    }

    public static void empenho(String valor) {
        container.empenho();
    }

    public static void salvar() {
        BrowserDriver.waitForElement(container.salvar);
        container.salvar.click();
    }

    public static void aviso(String valor) {
        BrowserDriver.waitForElement(container.aviso);
        Assert.assertEquals(container.aviso.getText(), valor);
        container.ok.click();
    }

}
