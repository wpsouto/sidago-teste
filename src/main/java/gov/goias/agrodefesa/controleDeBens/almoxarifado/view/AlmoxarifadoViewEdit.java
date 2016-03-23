package gov.goias.agrodefesa.controleDeBens.almoxarifado.view;

import gov.goias.agrodefesa.controleDeBens.almoxarifado.containers.AlmoxarifadoPageContainerEdit;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class AlmoxarifadoViewEdit {
	private static final AlmoxarifadoPageContainerEdit conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AlmoxarifadoPageContainerEdit.class);

	public static void isDisplayedCheck(){
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void descricao(String valor){
        conteiner.descricao.clear();
        conteiner.descricao.sendKeys(valor);
    }

    public static void salvar() {
        BrowserDriver.waitForElement(conteiner.salvar);
        conteiner.salvar.click();
    }

    public static void aviso(String valor) {
        BrowserDriver.waitForElement(conteiner.aviso);
        Assert.assertEquals(conteiner.aviso.getText(), valor);
        conteiner.ok.click();
    }

}
