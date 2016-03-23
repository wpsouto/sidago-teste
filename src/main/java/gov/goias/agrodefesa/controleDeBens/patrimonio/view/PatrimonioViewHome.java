package gov.goias.agrodefesa.controleDeBens.patrimonio.view;

import gov.goias.agrodefesa.controleDeBens.patrimonio.containers.PatrimonioPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class PatrimonioViewHome {
	private static final PatrimonioPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PatrimonioPageContainerHome.class);

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

	}

    public static void lotacao(String valor) {
        container.lotacao.sendKeys(valor);
    }

    public static void pesquisar() {
		container.pesquisar.click();
	}

	public static void isDisplayedGridPesquisar() {
		BrowserDriver.waitForElement(container.gridRow);
		container.gridRow.isDisplayed();
        Assert.assertEquals(container.numeroPatrimonio.getAttribute("value"), container.gridRow.getText());
	}

	public static void alterarRegistro() {
		container.alterar.click();
	}


}
