package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.containers.EmpresaPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class EmpresaViewInsert {
	private static final Logger LOGGER = Logger.getLogger(EmpresaViewInsert.class.getName());
	private static final EmpresaPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), EmpresaPageContainerInsert.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando - Incluir Registro e exibida");
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void documento(String valor){
        LOGGER.info("Inserindo valor no campo Descrição");
        conteiner.documento.clear();
        conteiner.documento.sendKeys(valor);
    }

    public static void classificacao(String valor){
        LOGGER.info("Inserindo valor no campo Descrição");
        BrowserDriver.getDropDownOption(conteiner.classificacao, valor).click();
    }

    public static void pesquisar() {
        LOGGER.info("Inserindo valor no campo Descrição");
        conteiner.pesquisar.click();
        BrowserDriver.waitForElement(conteiner.cliqueAqui);
        conteiner.cliqueAqui.click();
    }

    public static void informacaoObrigatoria(String socio, String nomeEmpresa, String nomeFantasia){
        BrowserDriver.waitForElement(conteiner.informacaoObrigatoria);
        conteiner.informacaoObrigatoria.click();

        conteiner.socio.sendKeys(socio);
        BrowserDriver.waitForElement(conteiner.socioAutoComplete);
        conteiner.socioAutoComplete.click();

        conteiner.nomeEmpresa.sendKeys(nomeEmpresa);

        conteiner.nomeFantasia.sendKeys(nomeFantasia);
    }
    public static void informacaoComplementar(){
        BrowserDriver.waitForElement(conteiner.informacaoComplementar);
        conteiner.informacaoComplementar.click();
        conteiner.adicionarEndereco.click();
        conteiner.confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(By.id("div_id_endereco"));
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
