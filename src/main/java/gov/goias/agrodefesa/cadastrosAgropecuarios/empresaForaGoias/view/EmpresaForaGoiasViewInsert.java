package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.containers.EmpresaForaGoiasPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class EmpresaForaGoiasViewInsert {
	private static final Logger LOGGER = Logger.getLogger(EmpresaForaGoiasViewInsert.class.getName());
	private static final EmpresaForaGoiasPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), EmpresaForaGoiasPageContainerInsert.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando - Incluir Registro e exibida");
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void numeroDocumento(String valor){
        LOGGER.info("Inserindo valor no campo Descrição");
        conteiner.numeroDocumento.clear();
        conteiner.numeroDocumento.sendKeys(valor);
    }

    public static void pesquisar() {
        LOGGER.info("Inserindo valor no campo Descrição");
        conteiner.pesquisar.click();
        BrowserDriver.waitForElement(conteiner.selecionar);
        conteiner.selecionar.click();
    }

    public static void classificacao(String valor){
        LOGGER.info("Inserindo valor no campo Descrição");
        BrowserDriver.selectByVisibleText(conteiner.classificacao, valor);
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
