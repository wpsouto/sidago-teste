package gov.goias.agrodefesa.controleDeBens.patrimonio.view;

import gov.goias.agrodefesa.controleDeBens.patrimonio.containers.PatrimonioPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class PatrimonioViewInsert {
	private static final Logger LOGGER = Logger.getLogger(PatrimonioViewInsert.class.getName());
	private static final PatrimonioPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PatrimonioPageContainerInsert.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando pagina Patrimonio - Incluir Registro e exibida");
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void numeroPatrimonioAgrodefesa(String valor){
        LOGGER.info("Inserindo valor no campo Numero Patrimonio Agrodefesa");
        conteiner.numeroPatrimonioAgrodefesa.clear();
        conteiner.numeroPatrimonioAgrodefesa.sendKeys(valor);
    }

    public static void descricao(String valor){
        LOGGER.info("Inserindo valor no campo Descricao");
        conteiner.descricao.clear();
        conteiner.descricao.sendKeys(valor);
    }

    public static void fornecedor(String valor) {
        LOGGER.info("Inserindo valor no campo Fornecedor");
        conteiner.fornecedor.sendKeys(valor);
        BrowserDriver.waitForElement(conteiner.fornecedorAutoComplete);
        conteiner.fornecedorAutoComplete.click();
    }

    public static void origemRecurso(String valor) {
        LOGGER.info("Inserindo valor no campo Origem Recurso: "+valor);
        BrowserDriver.getDropDownOption(conteiner.origemRecurso, valor).click();
    }

    public static void tipoAquisicao(String valor) {
        LOGGER.info("Inserindo valor no campo Tipo Aquisição");
        BrowserDriver.getDropDownOption(conteiner.tipoAquisicao, valor).click();
    }

    public static void especie(String valor) {
        LOGGER.info("Inserindo valor no campo Especie");
        BrowserDriver.getDropDownOption(conteiner.especie, valor).click();
    }

    public static void conservacao(String valor) {
        LOGGER.info("Inserindo valor no campo Conservacao");
        BrowserDriver.getDropDownOption(conteiner.conservacao, valor).click();
    }

    public static void lotacao(String valor) {
        LOGGER.info("Inserindo valor no campo Lotacao");
        conteiner.lotacao.sendKeys(valor);
        BrowserDriver.waitForElement(conteiner.lotacaoAutoComplete);
        conteiner.lotacaoAutoComplete.click();
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
