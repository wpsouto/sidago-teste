package gov.goias.agrodefesa.controleDeBens.almoxarifado.view;

import gov.goias.agrodefesa.controleDeBens.almoxarifado.containers.AlmoxarifadoPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class AlmoxarifadoViewInsert {
	private static final AlmoxarifadoPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AlmoxarifadoPageContainerInsert.class);

	public static void isDisplayedCheck(){
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void descricao(String valor){
        conteiner.descricao.clear();
        conteiner.descricao.sendKeys(valor);
    }

    public static void lotacao(String valor) {
        conteiner.lotacao.sendKeys(valor);
        BrowserDriver.waitForElement(conteiner.lotacaoAutoComplete);
        conteiner.lotacaoAutoComplete.click();
    }

    public static void gestor(String valor) {
        conteiner.gestor.sendKeys(valor);
        BrowserDriver.waitForElement(conteiner.gestorAutoComplete);
        conteiner.gestorAutoComplete.click();
    }

    public static void almoxarifadoPai(String valor) {
        conteiner.almoxarifadoPai.sendKeys(valor);
        BrowserDriver.waitForElement(conteiner.almoxarifadoPaiAutoComplete);
        conteiner.almoxarifadoPaiAutoComplete.click();
    }

    public static void salvar() {
        BrowserDriver.waitForElement(conteiner.salvar);
        conteiner.salvar.click();
    }

    public static void aviso(String valor) {
        BrowserDriver.waitForElement(conteiner.aviso);
        Assert.assertEquals(conteiner.aviso.getText(), valor);
        conteiner.ok.click();
    }

}
