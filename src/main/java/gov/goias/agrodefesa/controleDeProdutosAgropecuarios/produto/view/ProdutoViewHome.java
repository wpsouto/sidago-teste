package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.view;

import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.containers.ProdutoPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.support.PageFactory;

public class ProdutoViewHome {
	private static final ProdutoPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), ProdutoPageContainerHome.class);

	public static void isDisplayedCheck(){
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void incluirRegistro(){
        BrowserDriver.waitForElement(container.incluirRegistro);
        container.incluirRegistro.click();
    }

	public static void nome(String valor){
		container.nome.clear();
		container.nome.sendKeys(valor);
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
