package gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.containers.LavouraPageContainerEdit;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class LavouraViewEdit {
	private static final Logger LOGGER = Logger.getLogger(LavouraViewEdit.class.getName());
	private static final LavouraPageContainerEdit conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LavouraPageContainerEdit.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando pagina Almoxarifado - Editar Registro e exibida");
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void salvar() {
        LOGGER.info("Salvando os dados");
        BrowserDriver.waitForElement(conteiner.salvar);
        conteiner.salvar.click();
    }

    public static void aviso(String valor) {
        LOGGER.info("Mensagem de aviso");
        BrowserDriver.waitForElement(conteiner.aviso);
        Assert.assertEquals(conteiner.aviso.getText(), valor);
        conteiner.ok.click();
    }


}
