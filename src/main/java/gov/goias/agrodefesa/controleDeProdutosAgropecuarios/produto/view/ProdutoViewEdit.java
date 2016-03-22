package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.view;

import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.containers.ProdutoPageContainerEdit;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class ProdutoViewEdit {
	private static final Logger LOGGER = Logger.getLogger(ProdutoViewEdit.class.getName());
	private static final ProdutoPageContainerEdit conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), ProdutoPageContainerEdit.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando pagina Almoxarifado - Editar Registro e exibida");
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void nomeDoProduto(String valor){
        LOGGER.info("Inserindo valor no campo Descrição");
        conteiner.nomeDoProduto.clear();
        conteiner.nomeDoProduto.sendKeys(valor);
    }

    public static void salvar() {
        LOGGER.info("Salvando os dados");
        BrowserDriver.waitForElement(conteiner.salvar);
        conteiner.salvar.click();
    }

    public static void aviso(String valor) {
        LOGGER.info("Mensagem de aviso");
        BrowserDriver.waitForElement(conteiner.aviso);
        Assert.assertEquals(conteiner.aviso.getText(), valor);
        conteiner.ok.click();
    }


}
