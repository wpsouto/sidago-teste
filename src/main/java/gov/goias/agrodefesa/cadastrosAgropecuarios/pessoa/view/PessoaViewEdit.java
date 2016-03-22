package gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.containers.PessoaPageContainerEdit;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class PessoaViewEdit {
	private static final Logger LOGGER = Logger.getLogger(PessoaViewEdit.class.getName());
	private static final PessoaPageContainerEdit conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PessoaPageContainerEdit.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando pagina Almoxarifado - Editar Registro e exibida");
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void nomeEmpresa(String valor){
        BrowserDriver.waitForElement(conteiner.nomeEmpresa);
        conteiner.nomeEmpresa.sendKeys(valor);
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
