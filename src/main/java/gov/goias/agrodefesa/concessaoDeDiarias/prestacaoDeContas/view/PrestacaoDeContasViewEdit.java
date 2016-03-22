package gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.view;

import gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.containers.PrestacaoDeContasPageContainerEdit;
import gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.containers.PrestacaoDeContasPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Logger;

public class PrestacaoDeContasViewEdit {
	private static final Logger LOGGER = Logger.getLogger(PrestacaoDeContasViewEdit.class.getName());
	private static final PrestacaoDeContasPageContainerEdit container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PrestacaoDeContasPageContainerEdit.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando a página de Prestar Contas é exibida");
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void atividade(String valor){
        LOGGER.info("Inserindo valor no campo Atividades");
        container.atividades.sendKeys(valor);
    }

    public static void upload(String fileUpload){
        LOGGER.info("Envio de Arquivo");
        JavascriptExecutor executor =  ((JavascriptExecutor) BrowserDriver.getCurrentDriver());
        String js = "arguments[0].style.display ='block';";
        executor.executeScript(js, container.teste);
        container.teste.sendKeys(fileUpload.toString());
    }

    public static void salvar() {
        LOGGER.info("Salvar");
        container.salvar.click();
    }

    public static void aviso(String valor) {
        LOGGER.info("Mensagem de aviso");
        BrowserDriver.waitForElement(container.aviso);
        Assert.assertEquals(container.aviso.getText(), valor);
        LOGGER.info(valor);
    }

}
