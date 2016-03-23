package gov.goias.agrodefesa.controleDeBens.tranferencia.view;

import gov.goias.agrodefesa.controleDeBens.tranferencia.containers.TransferenciaPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class TransferenciaViewInsert {
	private static final TransferenciaPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), TransferenciaPageContainerInsert.class);

	public static void isDisplayedCheck(){
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void numeroPatrimonio(String valor){
        conteiner.numeroPatrimonio.clear();
        conteiner.numeroPatrimonio.sendKeys(valor);
        BrowserDriver.waitForElement(conteiner.numeroPatrimonioAutoComplete);
        conteiner.numeroPatrimonioAutoComplete.click();
    }

    public static void destino(String valor){
        conteiner.destinoPatrimonio.clear();
        conteiner.destinoPatrimonio.sendKeys(valor);
        BrowserDriver.waitForElement(conteiner.destinoPatrimonioAutoComplete);
        conteiner.destinoPatrimonioAutoComplete.click();
    }

    public static void conservacao(String valor) {
        BrowserDriver.selectByVisibleText(conteiner.conservacao, valor);
    }

    public static void manutencao(String valor) {
        BrowserDriver.selectByVisibleText(conteiner.manutencao, valor);
    }

    public static void observacao(String valor) {
        BrowserDriver.selectByVisibleText(conteiner.observacao, valor);
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
