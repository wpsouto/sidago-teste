package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.view;

import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.containers.ProdutoPageContainerEdit;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class ProdutoViewEdit {
	private static final ProdutoPageContainerEdit conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), ProdutoPageContainerEdit.class);

	public static void isDisplayedCheck(){
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void nomeDoProduto(String valor){
        conteiner.nomeDoProduto.clear();
        conteiner.nomeDoProduto.sendKeys(valor);
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
