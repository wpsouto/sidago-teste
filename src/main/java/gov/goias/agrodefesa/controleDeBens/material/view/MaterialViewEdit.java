package gov.goias.agrodefesa.controleDeBens.material.view;

import gov.goias.agrodefesa.controleDeBens.material.containers.MaterialEditPageContainer;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class MaterialViewEdit {
	private static final Logger LOGGER = Logger.getLogger(MaterialViewEdit.class.getName());
	private static final MaterialEditPageContainer conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), MaterialEditPageContainer.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando pagina Material - Editar Registro e exibida");
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void nomeMaterial(String valor){
        LOGGER.info("Inserindo valor no campo Nome");
        conteiner.nomeMaterial.clear();
        conteiner.nomeMaterial.sendKeys(valor);
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
