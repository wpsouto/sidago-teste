package gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.view;

import gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.containers.PrestacaoDeContasPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class PrestacaoDeContasViewHome {
	private static final Logger LOGGER = Logger.getLogger(PrestacaoDeContasViewHome.class.getName());
	private static final PrestacaoDeContasPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PrestacaoDeContasPageContainerHome.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando a página de Prestar Contas é exibida");
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void numero(String valor){
        LOGGER.info("Inserindo valor no campo Numero");
        container.numeroDaDiaria.sendKeys(valor);
    }

    public static void pesquisar() {
        LOGGER.info("Pesquisando");
        container.pesquisar.click();
    }

    public static void pesquisarCheck() {
        LOGGER.info("Validando Pesquisa "+container.gridNumero.getText());
        BrowserDriver.waitForElement(container.gridNumero);
        container.gridNumero.isDisplayed();
        Assert.assertEquals(container.numeroDaDiaria.getAttribute("value"), container.gridNumero.getText());
    }

    public static void prestarContas() {
        LOGGER.info("Click Prestar Contas");
        container.gridPrestarContas.click();
    }

}
