package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.containers.EmpresaPageContainerEdit;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class EmpresaViewEdit {
	private static final Logger LOGGER = Logger.getLogger(EmpresaViewEdit.class.getName());
	private static final EmpresaPageContainerEdit conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), EmpresaPageContainerEdit.class);

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
