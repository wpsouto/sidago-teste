package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.view;

import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.containers.IngredienteAtivoPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class IngredienteAtivoViewInsert {
	private static final Logger LOGGER = Logger.getLogger(IngredienteAtivoViewInsert.class.getName());
	private static final IngredienteAtivoPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), IngredienteAtivoPageContainerInsert.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando pagina Material - Incluir Registro e exibida");
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void nomeIngrediente(String valor){
        LOGGER.info("Inserindo valor no campo Descrição");
        conteiner.nomeIngrediente.clear();
        conteiner.nomeIngrediente.sendKeys(valor);
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
