package gov.goias.agrodefesa.controleDeBens.tranferencia.view;

import gov.goias.agrodefesa.controleDeBens.tranferencia.containers.TransferenciaPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class TransferenciaViewHome {
	private static final Logger LOGGER = Logger.getLogger(TransferenciaViewHome.class.getName());
	private static final TransferenciaPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), TransferenciaPageContainerHome.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando a página de Transferencia é exibida");
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void incluirRegistro(){
        LOGGER.info("Exibindo Incluir Registro Transferencia");
        BrowserDriver.waitForElement(container.incluirRegistro);
        container.incluirRegistro.click();
    }

	public static void numeroPatrimonio(String valor){
		LOGGER.info("Inserindo valor no campo Numero Patrimonio");
		container.numeroPatrimonio.clear();
        container.numeroPatrimonio.sendKeys(valor);
        BrowserDriver.waitForElement(container.numeroPatrimonioAutoComplete);
		container.numeroPatrimonioAutoComplete.click();
	}

    public static void pesquisar() {
		LOGGER.info("Pesquisando");
		container.pesquisar.click();
	}

	public static void isDisplayedGridPesquisar() {
        LOGGER.info("Validando Pesquisa "+container.gridRow.getText());
        BrowserDriver.waitForElement(container.gridRow);
        container.gridRow.isDisplayed();
        Assert.assertEquals(container.numeroPatrimonio.getAttribute("value"), container.gridRow.getText());
	}

	public static void confirmar() {
		LOGGER.info("Click em grid Confirmar");
		container.confirmar.click();
        BrowserDriver.waitForElement(container.confirmarMsg);
        container.confirmarMsg.click();
	}

    public static void confirmarMsg() {
        LOGGER.info("Mensagem COnfirmar");
        BrowserDriver.closeAlert();
    }
}
