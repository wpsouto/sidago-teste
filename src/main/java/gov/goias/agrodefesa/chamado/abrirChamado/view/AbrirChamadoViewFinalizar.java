package gov.goias.agrodefesa.chamado.abrirChamado.view;

import gov.goias.agrodefesa.chamado.abrirChamado.containers.AbrirChamadoPageContainerFinalizar;
import gov.goias.agrodefesa.chamado.abrirChamado.containers.AbrirChamadoPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class AbrirChamadoViewFinalizar {
	private static final Logger LOGGER = Logger.getLogger(AbrirChamadoViewFinalizar.class.getName());
	private static final AbrirChamadoPageContainerFinalizar container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AbrirChamadoPageContainerFinalizar.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando a página de Finalizar Chamado é exibida");
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void resumo(String valor) {
        LOGGER.info("Inserindo valor no campo Resumo");
        BrowserDriver.getDropDownOption(container.resumo, valor).click();
    }

    public static void descricao(String valor) {
        LOGGER.info("Inserindo valor no campo Descricao");
        container.descricao.sendKeys(valor);
    }

	public static void confirmar() {
		LOGGER.info("Click em grid Confirmar");
		container.confirmar.click();
	}

}