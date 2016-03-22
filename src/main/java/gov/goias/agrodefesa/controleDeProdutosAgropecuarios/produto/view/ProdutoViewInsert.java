package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.view;

import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.containers.ProdutoPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class ProdutoViewInsert {
	private static final Logger LOGGER = Logger.getLogger(ProdutoViewInsert.class.getName());
	private static final ProdutoPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), ProdutoPageContainerInsert.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando - Incluir Registro e exibida");
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void classificacao(String valor){
        LOGGER.info("Inserindo valor no campo Descrição");
        BrowserDriver.getDropDownOption(conteiner.classificacao, valor).click();
    }

    public static void nomeDoProduto(String valor){
        LOGGER.info("Inserindo valor no campo Descrição");
        conteiner.nome.clear();
        conteiner.nome.sendKeys(valor);
    }

    public static void adicionarSubprodutoUnidade(String valor) {
        LOGGER.info("Inserindo valor no campo Descrição");
        conteiner.adicionar.click();
        BrowserDriver.getDropDownOption(conteiner.unidadeDeMedida, valor).click();
        conteiner.confirmar.click();
    }

    public static void salvar() {
        LOGGER.info("Salvando os dados");
        BrowserDriver.waitForElementIsNotPresent(By.id("id_unidademedida"));
        conteiner.salvar.click();
    }

    public static void aviso(String valor) {
        LOGGER.info("Mensagem de aviso");
        BrowserDriver.waitForElement(conteiner.aviso);
        Assert.assertEquals(conteiner.aviso.getText(), valor);
        conteiner.ok.click();
    }

}
