package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.view;

import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.containers.IngredienteAtivoPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.support.PageFactory;

public class IngredienteAtivoViewHome {
	private static final IngredienteAtivoPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), IngredienteAtivoPageContainerHome.class);

	public static void isDisplayedCheck(){
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void incluirRegistro(){
        BrowserDriver.waitForElement(container.incluirRegistro);
        container.incluirRegistro.click();
    }

	public static void ingrediente(String valor){
		container.ingrediente.clear();
		container.ingrediente.sendKeys(valor);
	}

    public static void pesquisar() {
		container.pesquisar.click();
	}

	public static void isDisplayedGridPesquisar() {
		BrowserDriver.waitForElement(container.gridRow);
		container.gridRow.isDisplayed();
	}

	public static void alterar() {
		container.alterar.click();
	}


}
