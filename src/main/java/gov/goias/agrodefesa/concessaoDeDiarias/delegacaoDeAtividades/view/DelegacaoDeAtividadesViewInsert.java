package gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.view;

import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.containers.DelegacaoDeAtividadesPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class DelegacaoDeAtividadesViewInsert {
	private static final DelegacaoDeAtividadesPageContainerInsert container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), DelegacaoDeAtividadesPageContainerInsert.class);

	public static void isDisplayedCheck(){
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void servidorDesignado(String valor){
        container.servidorDesignado.clear();
        container.servidorDesignado.sendKeys(valor);
        BrowserDriver.waitForElement(container.servidorDesignadoAutoComplete);
        container.servidorDesignadoAutoComplete.click();
    }

    public static void meioDeTransporte(String valor){
        BrowserDriver.selectByVisibleText(container.meioTransporte, valor);
    }

    public static void adicionarDestino() {
        container.adicionarDestino();
    }

    public static void dataSaida(String valor) {
        container.dataSaida.sendKeys(valor);
        container.dataSaida.clear();
        container.dataSaida.sendKeys(valor);
    }

    public static void dataChegada(String valor) {
        container.dataChegada.sendKeys(valor);
        container.dataChegada.clear();
        container.dataChegada.sendKeys(valor);
    }

    public static void descricaoDoServico(String valor) {
        container.descricaoServico.sendKeys(valor);
    }

    public static void comPernoite(String valor) {
        BrowserDriver.selectByVisibleText(container.comPernoite, valor);
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
