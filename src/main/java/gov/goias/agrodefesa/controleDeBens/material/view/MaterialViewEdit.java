package gov.goias.agrodefesa.controleDeBens.material.view;

import gov.goias.agrodefesa.controleDeBens.material.containers.MaterialEditPageContainer;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class MaterialViewEdit {
	private static final MaterialEditPageContainer conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), MaterialEditPageContainer.class);

	public static void isDisplayedCheck(){
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void nomeMaterial(String valor){
        conteiner.nomeMaterial.clear();
        conteiner.nomeMaterial.sendKeys(valor);
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
