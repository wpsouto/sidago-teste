package gov.goias.agrodefesa.controleDeBens.patrimonio.view;

import gov.goias.agrodefesa.controleDeBens.patrimonio.containers.PatrimonioPageContainerEdit;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class PatrimonioViewEdit {
	private static final PatrimonioPageContainerEdit conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PatrimonioPageContainerEdit.class);

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
