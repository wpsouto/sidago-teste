package gov.goias.agrodefesa.controleDeBens.almoxarifado.view;

import gov.goias.agrodefesa.controleDeBens.almoxarifado.containers.AlmoxarifadoPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.support.PageFactory;

public class AlmoxarifadoViewHome {
	private static final AlmoxarifadoPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AlmoxarifadoPageContainerHome.class);

	public static void isDisplayedCheck(){
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void incluirRegistro(){
        BrowserDriver.waitForElement(container.incluirRegistro);
        container.incluirRegistro.click();
    }

	public static void descricao(String valor){
		container.descricao.clear();
		container.descricao.sendKeys(valor);
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
	}

	public static void alterar() {
		container.alterar.click();
	}


}
