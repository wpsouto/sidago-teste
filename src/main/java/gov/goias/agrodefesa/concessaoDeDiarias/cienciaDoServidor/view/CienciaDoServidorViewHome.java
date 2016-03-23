package gov.goias.agrodefesa.concessaoDeDiarias.cienciaDoServidor.view;

import gov.goias.agrodefesa.concessaoDeDiarias.cienciaDoServidor.containers.CienciaDoServidorPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CienciaDoServidorViewHome {
    private static final Logger log = LoggerFactory.getLogger(CienciaDoServidorViewHome.class);
	private static final CienciaDoServidorPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), CienciaDoServidorPageContainerHome.class);

	public static void isDisplayedCheck(){
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void numero(String valor){
        log.debug(Constants.MGS_INSERIDO, "NUMERO", valor);
        container.numero.sendKeys(valor);
    }

    public static void pesquisar() {
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        container.pesquisar.click();
    }

    public static void pesquisarCheck() {
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(container.gridNumero);
        container.gridNumero.isDisplayed();
        Assert.assertEquals(container.numero.getAttribute("value"), container.gridNumero.getText());
    }

    public static void darCiencia() {
        log.debug(Constants.MGS_SELECIONADO, "DAR CIENCIA");
        container.ciencia.click();
    }

    public static void concordar(){
        log.debug(Constants.MGS_SELECIONADO, "CONCORDAR");
        BrowserDriver.waitForElement(container.concordo);
        container.concordo.click();

    }

}
