package gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.view;

import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.containers.DelegacaoDeAtividadesPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class DelegacaoDeAtividadesViewInsert {
	private static final Logger LOGGER = Logger.getLogger(DelegacaoDeAtividadesViewInsert.class.getName());
	private static final DelegacaoDeAtividadesPageContainerInsert container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), DelegacaoDeAtividadesPageContainerInsert.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando pagina Delegacao de Atividade - Incluir Registro e exibida");
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void servidorDesignado(String valor){
        LOGGER.info("Inserindo valor no campo Servidor Designado");
        container.servidorDesignado.clear();
        container.servidorDesignado.sendKeys(valor);
        BrowserDriver.waitForElement(container.servidorDesignadoAutoComplete);
        container.servidorDesignadoAutoComplete.click();
    }

    public static void meioDeTransporte(String valor){
        LOGGER.info("Inserindo valor no campo Meio de Transporte");
        BrowserDriver.getDropDownOption(container.meioTransporte, valor).click();
    }

    public static void adicionarDestino() {
        LOGGER.info("Inserindo valor no campo Destino");
        container.adicionarDestino();
    }

    public static void dataSaida(String valor) {
        LOGGER.info("Inserindo valor no campo Data Saida: "+valor);
        container.dataSaida.sendKeys(valor);
        container.dataSaida.clear();
        container.dataSaida.sendKeys(valor);
    }

    public static void dataChegada(String valor) {
        LOGGER.info("Inserindo valor no campo Data Chegada: "+valor);
        container.dataChegada.sendKeys(valor);
        container.dataChegada.clear();
        container.dataChegada.sendKeys(valor);
    }

    public static void descricaoDoServico(String valor) {
        LOGGER.info("Inserindo valor no campo Descricao");
        container.descricaoServico.sendKeys(valor);
    }

    public static void comPernoite(String valor) {
        LOGGER.info("Inserindo valor no campo Descricao");
        BrowserDriver.getDropDownOption(container.comPernoite, valor).click();
    }

    public static void acompanhaAutoridade(String valor) {
        LOGGER.info("Inserindo valor no campo Descricao");
        BrowserDriver.getDropDownOption(container.acompanhaAutoridade, valor).click();
    }

    public static void tipoRecurso(String valor) {
        LOGGER.info("Inserindo valor no campo Descricao");
        BrowserDriver.getDropDownOption(container.tipoRecurso, valor).click();
    }

    public static void fonteRecurso(String valor) {
        LOGGER.info("Inserindo valor no campo Descricao");
        BrowserDriver.waitForElement(container.fonteDeRecurso).click();
    }

    public static void acao(String valor) {
        LOGGER.info("Inserindo valor no campo Descricao");
        BrowserDriver.waitForElement(container.acao).click();
    }

    public static void meta(String valor) {
        LOGGER.info("Inserindo valor no campo Descricao");
        BrowserDriver.waitForElement(container.meta).click();
    }

    public static void realizacao(String valor) {
        LOGGER.info("Inserindo valor no campo Descricao");
        BrowserDriver.waitForElement(container.realizacao).click();
    }

    public static void empenho(String valor) {
        LOGGER.info("Inserindo valor no campo Descricao");
        container.empenho();
    }

    public static void salvar() {
        LOGGER.info("Salvando os dados");
        BrowserDriver.waitForElement(container.salvar);
        container.salvar.click();
    }

    public static void aviso(String valor) {
        LOGGER.info("Mensagem de aviso");
        BrowserDriver.waitForElement(container.aviso);
        Assert.assertEquals(container.aviso.getText(), valor);
        container.ok.click();
    }

}
