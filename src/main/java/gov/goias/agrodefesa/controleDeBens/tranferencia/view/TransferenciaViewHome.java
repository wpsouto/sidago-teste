package gov.goias.agrodefesa.controleDeBens.tranferencia.view;

import gov.goias.agrodefesa.controleDeBens.tranferencia.containers.TransferenciaPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class TransferenciaViewHome {
	private static final TransferenciaPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), TransferenciaPageContainerHome.class);

	public static void isDisplayedCheck(){
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void incluirRegistro(){
        BrowserDriver.waitForElement(container.incluirRegistro);
        container.incluirRegistro.click();
    }

	public static void numeroPatrimonio(String valor){
		container.numeroPatrimonio.clear();
        container.numeroPatrimonio.sendKeys(valor);
        BrowserDriver.waitForElement(container.numeroPatrimonioAutoComplete);
		container.numeroPatrimonioAutoComplete.click();
	}

    public static void pesquisar() {
		container.pesquisar.click();
	}

	public static void isDisplayedGridPesquisar() {
        BrowserDriver.waitForElement(container.gridRow);
        container.gridRow.isDisplayed();
        Assert.assertEquals(container.numeroPatrimonio.getAttribute("value"), container.gridRow.getText());
	}

	public static void confirmar() {
		container.confirmar.click();
        BrowserDriver.waitForElement(container.confirmarMsg);
        container.confirmarMsg.click();
	}

    public static void confirmarMsg() {
        BrowserDriver.closeAlert();
    }
}
