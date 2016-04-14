package gov.goias.agrodefesa.denuncia.abrirDenuncia.view;

import gov.goias.agrodefesa.denuncia.abrirDenuncia.containers.AbrirDenunciaPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbrirDenunciaViewHome {
	private static final Logger log = LoggerFactory.getLogger(AbrirDenunciaViewHome.class);
	private static final AbrirDenunciaPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AbrirDenunciaPageContainerHome.class);

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

	public static void tipoInfracao(String valor){
        log.debug(Constants.MGS_INSERIDO, "TIPO INFRACAO", valor);
        BrowserDriver.scrollUp();
		container.tipoInfracao.sendKeys(valor.split("-")[1].trim());
        BrowserDriver.waitForElement(container.tipoInfracaoAutoComplete);
        container.tipoInfracaoAutoComplete.click();
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

	public static void alterar() {
        log.debug(Constants.MGS_SELECIONADO, "ALTERAR");
        BrowserDriver.waitForElement(container.alterar);
        BrowserDriver.scroll(container.alterar);
        container.alterar.click();
	}

}
