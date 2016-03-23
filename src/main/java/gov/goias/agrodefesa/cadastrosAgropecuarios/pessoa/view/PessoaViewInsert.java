package gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.containers.PessoaPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PessoaViewInsert {
    private static final Logger log = LoggerFactory.getLogger(PessoaViewInsert.class);
	private static final PessoaPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PessoaPageContainerInsert.class);

	public static void isDisplayedCheck(){
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void cpfCnpj(String valor){
        log.debug(Constants.MGS_INSERIDO, "CPF/CNPJ", valor);
        conteiner.cpfCnpj.clear();
        conteiner.cpfCnpj.sendKeys(valor);
    }

    public static void pesquisar() {
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        conteiner.pesquisar.click();
    }

    public static void nomeEmpresa(String valor){
        log.debug(Constants.MGS_INSERIDO, "NOME EMPRESA", valor);
        BrowserDriver.waitForElement(conteiner.nomeEmpresa);
        conteiner.nomeEmpresa.sendKeys(valor);
    }

    public static void nomeFantasia(String valor){
        log.debug(Constants.MGS_INSERIDO, "NOME FANTASIA", valor);
        BrowserDriver.waitForElement(conteiner.nomeFantasia);
        conteiner.nomeFantasia.sendKeys(valor);
    }

    public static void adicionarEndereco(String tipoEndereco){
        log.debug(Constants.MGS_INSERIDO, "ADICIONAR ENDERECO");
        BrowserDriver.waitForElement(conteiner.adicionarEndereco);
        conteiner.adicionarEndereco.click();
        BrowserDriver.waitForElement(conteiner.tipoEndereco);
        BrowserDriver.selectByVisibleText(conteiner.tipoEndereco, tipoEndereco);
        conteiner.confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(By.id("id_endereco_tipo"));
    }

    public static void salvar() {
        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        conteiner.salvar.click();
    }

    public static void aviso(String valor) {
        log.debug(Constants.MGS_MENSAGEM, valor);
        BrowserDriver.waitForElement(conteiner.aviso);
        Assert.assertEquals(conteiner.aviso.getText(), valor);
        conteiner.ok.click();
    }

}
