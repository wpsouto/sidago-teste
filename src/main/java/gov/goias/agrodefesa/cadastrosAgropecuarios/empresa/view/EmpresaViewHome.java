package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.containers.EmpresaPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmpresaViewHome {
	private static final Logger log = LoggerFactory.getLogger(EmpresaViewHome.class);
	private static final EmpresaPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), EmpresaPageContainerHome.class);

	public static void isDisplayedCheck(){
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void incluirRegistro(){
        log.debug(Constants.MGS_SELECIONADO, "INCLUIR REGISTRO");
        BrowserDriver.waitForElement(container.incluirRegistro);
        container.incluirRegistro.click();
    }

	public static void documento(String valor){
        log.debug(Constants.MGS_INSERIDO, "DOCUMENTO", valor);
		container.documento.clear();
		container.documento.sendKeys(valor);
	}

    public static void pesquisar() {
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
		container.pesquisar.click();
	}

	public static void isDisplayedGridPesquisar() {
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(container.gridRow);
		container.gridRow.isDisplayed();
	}

	public static String situacaoCadastral() {
		BrowserDriver.waitForElement(container.gridRow);
		return container.gridRow.getText();
	}

	public static void alterar() {
        log.debug(Constants.MGS_SELECIONADO, "ALTERAR");
        BrowserDriver.waitForElement(container.alterar);
		container.alterar.click();
	}

	public static void aprovar() {
		log.debug(Constants.MGS_SELECIONADO, "APROVAR");
		BrowserDriver.waitForElement(container.aprovar);
		container.aprovar.click();
	}

}
