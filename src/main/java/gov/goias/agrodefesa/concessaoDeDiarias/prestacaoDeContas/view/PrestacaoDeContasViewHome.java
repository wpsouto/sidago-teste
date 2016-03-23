package gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.view;

import gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.containers.PrestacaoDeContasPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class PrestacaoDeContasViewHome {
	private static final PrestacaoDeContasPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PrestacaoDeContasPageContainerHome.class);

	public static void isDisplayedCheck(){
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void numero(String valor){
        container.numeroDaDiaria.sendKeys(valor);
    }

    public static void pesquisar() {
        container.pesquisar.click();
    }

    public static void pesquisarCheck() {
        BrowserDriver.waitForElement(container.gridNumero);
        container.gridNumero.isDisplayed();
        Assert.assertEquals(container.numeroDaDiaria.getAttribute("value"), container.gridNumero.getText());
    }

    public static void prestarContas() {
        container.gridPrestarContas.click();
    }

}
