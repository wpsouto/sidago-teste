package gov.goias.agrodefesa.concessaoDeDiarias.assinaturaDeDiarias.view;

import gov.goias.agrodefesa.concessaoDeDiarias.assinaturaDeDiarias.containers.AssinaturaDeDiariasPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class AssinaturaDeDiariasViewHome {
	private static final Logger LOGGER = Logger.getLogger(AssinaturaDeDiariasViewHome.class.getName());
	private static final AssinaturaDeDiariasPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AssinaturaDeDiariasPageContainerHome.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando a página de Assinatura de Diarias é exibida");
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void numeroDaDiaria(String valor) {
        LOGGER.info("Inserindo valor no campo Numero da diaria");
        container.numeroDaDiaria.sendKeys(valor);
    }

    public static void pesquisar() {
        LOGGER.info("Pesquisando");
        container.pesquisar.click();
    }

    public static void isDisplayedGridPesquisar() {
        LOGGER.info("Validando Pesquisa");
        BrowserDriver.waitForElement(container.gridNumero);
        container.gridNumero.isDisplayed();
        Assert.assertEquals(container.numeroDaDiaria.getAttribute("value"), container.gridNumero.getText());
    }

    public static void informacoesDetalhadas() {
        LOGGER.info("Click Informações Detalhadas");
        BrowserDriver.waitForElement(container.gridInformacoesDetalhadas);
        container.gridInformacoesDetalhadas.click();
    }

    public static void assinar(){
        BrowserDriver.waitForElement(container.assinar);
        container.assinar.click();
    }

    public static void confirmar(){
        BrowserDriver.waitForElement(container.confirmar);
        container.confirmar.click();
    }

}

