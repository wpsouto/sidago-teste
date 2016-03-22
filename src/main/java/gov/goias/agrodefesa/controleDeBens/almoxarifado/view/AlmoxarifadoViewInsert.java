package gov.goias.agrodefesa.controleDeBens.almoxarifado.view;

import gov.goias.agrodefesa.controleDeBens.almoxarifado.containers.AlmoxarifadoPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class AlmoxarifadoViewInsert {
	private static final Logger LOGGER = Logger.getLogger(AlmoxarifadoViewInsert.class.getName());
	private static final AlmoxarifadoPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AlmoxarifadoPageContainerInsert.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando pagina Material - Incluir Registro e exibida");
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void descricao(String valor){
        LOGGER.info("Inserindo valor no campo Descrição");
        conteiner.descricao.clear();
        conteiner.descricao.sendKeys(valor);
    }

    public static void lotacao(String valor) {
        LOGGER.info("Inserindo valor no campo Lotação");
        conteiner.lotacao.sendKeys(valor);
        BrowserDriver.waitForElement(conteiner.lotacaoAutoComplete);
        conteiner.lotacaoAutoComplete.click();
    }

    public static void gestor(String valor) {
        LOGGER.info("Inserindo valor no campo Gestor");
        conteiner.gestor.sendKeys(valor);
        BrowserDriver.waitForElement(conteiner.gestorAutoComplete);
        conteiner.gestorAutoComplete.click();
    }

    public static void almoxarifadoPai(String valor) {
        LOGGER.info("Inserindo valor no campo Almoxarifado Pai");
        conteiner.almoxarifadoPai.sendKeys(valor);
        BrowserDriver.waitForElement(conteiner.almoxarifadoPaiAutoComplete);
        conteiner.almoxarifadoPaiAutoComplete.click();
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
