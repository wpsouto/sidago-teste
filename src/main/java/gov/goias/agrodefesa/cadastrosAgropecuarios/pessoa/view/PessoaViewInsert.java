package gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.containers.PessoaPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class PessoaViewInsert {
	private static final Logger LOGGER = Logger.getLogger(PessoaViewInsert.class.getName());
	private static final PessoaPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PessoaPageContainerInsert.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando - Incluir Registro e exibida");
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void cpfCnpj(String valor){
        LOGGER.info("Inserindo valor no campo Descrição");
        conteiner.cpfCnpj.clear();
        conteiner.cpfCnpj.sendKeys(valor);
    }

    public static void pesquisar() {
        LOGGER.info("Inserindo valor no campo Descrição");
        conteiner.pesquisar.click();
    }

    public static void nomeEmpresa(String valor){
        BrowserDriver.waitForElement(conteiner.nomeEmpresa);
        conteiner.nomeEmpresa.sendKeys(valor);
    }

    public static void nomeFantasia(String valor){
        BrowserDriver.waitForElement(conteiner.nomeFantasia);
        conteiner.nomeFantasia.sendKeys(valor);
    }

    public static void adicionarEndereco(String tipoEndereco){
        BrowserDriver.waitForElement(conteiner.adicionarEndereco);
        conteiner.adicionarEndereco.click();
        BrowserDriver.waitForElement(conteiner.tipoEndereco);
        BrowserDriver.selectByVisibleText(conteiner.tipoEndereco, tipoEndereco);
        conteiner.confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(By.id("id_endereco_tipo"));
    }

    public static void salvar() {
        LOGGER.info("Salvando os dados");
        conteiner.salvar.click();
    }

    public static void aviso(String valor) {
        LOGGER.info("Mensagem de aviso");
        BrowserDriver.waitForElement(conteiner.aviso);
        Assert.assertEquals(conteiner.aviso.getText(), valor);
        conteiner.ok.click();
    }

}
