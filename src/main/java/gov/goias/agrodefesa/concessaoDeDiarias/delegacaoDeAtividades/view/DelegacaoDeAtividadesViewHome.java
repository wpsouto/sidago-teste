package gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.view;

import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.containers.DelegacaoDeAtividadesPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class DelegacaoDeAtividadesViewHome {
	private static final Logger LOGGER = Logger.getLogger(DelegacaoDeAtividadesViewHome.class.getName());
	private static final DelegacaoDeAtividadesPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), DelegacaoDeAtividadesPageContainerHome.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando a página de Delegacao de Atividades é exibida");
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void incluirRegistro(){
        LOGGER.info("Exibindo Incluir Registro Delegacao de Atividade");
        BrowserDriver.waitForElement(container.incluirRegistro);
        container.incluirRegistro.click();
    }

	public static void nomeDoServidor(String valor){
		LOGGER.info("Inserindo valor no campo Nome do Servidor");
		container.nomeDoServidor.clear();
        container.nomeDoServidor.sendKeys(valor);
	}

	public static void dataSaida(String valor){
		LOGGER.info("Inserindo valor no campo Data Saida: "+valor);
		container.dataSaida.sendKeys(valor);
		container.dataSaida.clear();
		container.dataSaida.sendKeys(valor);
	}

	public static void dataChegada(String valor){
		LOGGER.info("Inserindo valor no campo Data Chegada: "+valor);
		container.dataChegada.sendKeys(valor);
		container.dataChegada.clear();
		container.dataChegada.sendKeys(valor);
	}

    public static void pesquisar() {
		LOGGER.info("Pesquisando");
		container.pesquisar.click();
	}

	public static void pesquisarCheck() {
		LOGGER.info("Validando Pesquisa "+container.gridNomeServidor.getText());
		BrowserDriver.waitForElement(container.gridNomeServidor);
		container.gridNomeServidor.isDisplayed();
        Assert.assertEquals(container.nomeDoServidor.getAttribute("value"), container.gridNomeServidor.getText());
	}

    public static String getNumeroDiaria() {
        LOGGER.info("Buscando numero da Diaria");
        BrowserDriver.waitForElement(container.gridNumero);
        return container.gridNumero.getText();
    }



}
