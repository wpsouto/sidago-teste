package gov.goias.agrodefesa.controleDeBens.patrimonio.view;

import gov.goias.agrodefesa.controleDeBens.patrimonio.containers.PatrimonioPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class PatrimonioViewInsert {
	private static final PatrimonioPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PatrimonioPageContainerInsert.class);

	public static void isDisplayedCheck(){
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void numeroPatrimonioAgrodefesa(String valor){
        conteiner.numeroPatrimonioAgrodefesa.clear();
        conteiner.numeroPatrimonioAgrodefesa.sendKeys(valor);
    }

    public static void descricao(String valor){
        conteiner.descricao.clear();
        conteiner.descricao.sendKeys(valor);
    }

    public static void fornecedor(String valor) {
        conteiner.fornecedor.sendKeys(valor);
        BrowserDriver.waitForElement(conteiner.fornecedorAutoComplete);
        conteiner.fornecedorAutoComplete.click();
    }

    public static void origemRecurso(String valor) {
        BrowserDriver.selectByVisibleText(conteiner.origemRecurso, valor);
    }

    public static void tipoAquisicao(String valor) {
        BrowserDriver.selectByVisibleText(conteiner.tipoAquisicao, valor);
    }

    public static void especie(String valor) {
        BrowserDriver.selectByVisibleText(conteiner.especie, valor);
    }

    public static void conservacao(String valor) {
        BrowserDriver.selectByVisibleText(conteiner.conservacao, valor);
    }

    public static void lotacao(String valor) {
        conteiner.lotacao.sendKeys(valor);
        BrowserDriver.waitForElement(conteiner.lotacaoAutoComplete);
        conteiner.lotacaoAutoComplete.click();
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
