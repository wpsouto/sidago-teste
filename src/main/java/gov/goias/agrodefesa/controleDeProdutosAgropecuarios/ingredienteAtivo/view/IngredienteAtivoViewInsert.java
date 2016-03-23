package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.view;

import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.containers.IngredienteAtivoPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class IngredienteAtivoViewInsert {
	private static final IngredienteAtivoPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), IngredienteAtivoPageContainerInsert.class);

	public static void isDisplayedCheck(){
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void nomeIngrediente(String valor){
        conteiner.nomeIngrediente.clear();
        conteiner.nomeIngrediente.sendKeys(valor);
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
