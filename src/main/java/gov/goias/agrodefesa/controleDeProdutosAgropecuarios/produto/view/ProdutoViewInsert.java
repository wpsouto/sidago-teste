package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.view;

import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.containers.ProdutoPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class ProdutoViewInsert {
	private static final ProdutoPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), ProdutoPageContainerInsert.class);

	public static void isDisplayedCheck(){
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void classificacao(String valor){
        BrowserDriver.selectByVisibleText(conteiner.classificacao, valor);
    }

    public static void nomeDoProduto(String valor){
        conteiner.nome.clear();
        conteiner.nome.sendKeys(valor);
    }

    public static void adicionarSubprodutoUnidade(String valor) {
        conteiner.adicionar.click();
        BrowserDriver.selectByVisibleText(conteiner.unidadeDeMedida, valor);
        conteiner.confirmar.click();
    }

    public static void salvar() {
        BrowserDriver.waitForElementIsNotPresent(By.id("id_unidademedida"));
        conteiner.salvar.click();
    }

    public static void aviso(String valor) {
        BrowserDriver.waitForElement(conteiner.aviso);
        Assert.assertEquals(conteiner.aviso.getText(), valor);
        conteiner.ok.click();
    }

}
