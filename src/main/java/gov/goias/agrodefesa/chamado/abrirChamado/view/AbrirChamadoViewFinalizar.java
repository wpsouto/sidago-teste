package gov.goias.agrodefesa.chamado.abrirChamado.view;

import gov.goias.agrodefesa.chamado.abrirChamado.containers.AbrirChamadoPageContainerFinalizar;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbrirChamadoViewFinalizar {
    private static final Logger log = LoggerFactory.getLogger(AbrirChamadoViewFinalizar.class);
	private static final AbrirChamadoPageContainerFinalizar container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AbrirChamadoPageContainerFinalizar.class);

	public static void isDisplayedCheck(){
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void resumo(String valor) {
        log.debug(Constants.MGS_INSERIDO, "RESUMO", valor);
        BrowserDriver.selectByVisibleText(container.resumo, valor);
    }

    public static void descricao(String valor) {
        log.debug(Constants.MGS_INSERIDO, "DESCRICAO", valor);
        container.descricao.sendKeys(valor);
    }

	public static void confirmar() {
        log.debug(Constants.MGS_SELECIONADO, "OPERACAO CONFIRMAR");
		container.confirmar.click();
	}

}