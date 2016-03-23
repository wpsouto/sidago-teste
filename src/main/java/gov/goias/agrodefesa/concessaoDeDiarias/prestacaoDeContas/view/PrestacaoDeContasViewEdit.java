package gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.view;

import gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.containers.PrestacaoDeContasPageContainerEdit;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

public class PrestacaoDeContasViewEdit {
	private static final PrestacaoDeContasPageContainerEdit container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PrestacaoDeContasPageContainerEdit.class);

	public static void isDisplayedCheck(){
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void atividade(String valor){
        container.atividades.sendKeys(valor);
    }

    public static void upload(String fileUpload){
        JavascriptExecutor executor =  ((JavascriptExecutor) BrowserDriver.getCurrentDriver());
        String js = "arguments[0].style.display ='block';";
        executor.executeScript(js, container.teste);
        container.teste.sendKeys(fileUpload.toString());
    }

    public static void salvar() {
        container.salvar.click();
    }

    public static void aviso(String valor) {
        BrowserDriver.waitForElement(container.aviso);
        Assert.assertEquals(container.aviso.getText(), valor);
    }

}
