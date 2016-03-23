package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.view;

import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.containers.IngredienteAtivoPageContainerEdit;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class IngredienteAtivoViewEdit {
	private static final IngredienteAtivoPageContainerEdit conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), IngredienteAtivoPageContainerEdit.class);

	public static void isDisplayedCheck(){
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void descricao(String valor){
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
