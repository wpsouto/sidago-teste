package gov.goias.agrodefesa.concessaoDeDiarias.cienciaDoServidor.view;

import gov.goias.agrodefesa.concessaoDeDiarias.cienciaDoServidor.containers.CienciaDoServidorPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class CienciaDoServidorViewHome {
	private static final Logger LOGGER = Logger.getLogger(CienciaDoServidorViewHome.class.getName());
	private static final CienciaDoServidorPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), CienciaDoServidorPageContainerHome.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando a página de Delegacao de Atividades é exibida");
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void numero(String valor){
        LOGGER.info("Inserindo valor no campo Numero");
        container.numero.sendKeys(valor);
    }

    public static void pesquisar() {
        LOGGER.info("Pesquisando");
        container.pesquisar.click();
    }

    public static void pesquisarCheck() {
        LOGGER.info("Validando Pesquisa "+container.gridNumero.getText());
        BrowserDriver.waitForElement(container.gridNumero);
        container.gridNumero.isDisplayed();
        Assert.assertEquals(container.numero.getAttribute("value"), container.gridNumero.getText());
    }

    public static void darCiencia() {
        LOGGER.info("Click Ciencia");
        container.ciencia.click();
    }

    public static void concordar(){
        BrowserDriver.waitForElement(container.concordo);
        container.concordo.click();

    }

}
