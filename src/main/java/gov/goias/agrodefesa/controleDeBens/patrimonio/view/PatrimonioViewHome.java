package gov.goias.agrodefesa.controleDeBens.patrimonio.view;

import gov.goias.agrodefesa.controleDeBens.patrimonio.containers.PatrimonioPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class PatrimonioViewHome {
	private static final Logger LOGGER = Logger.getLogger(PatrimonioViewHome.class.getName());
	private static final PatrimonioPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PatrimonioPageContainerHome.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando a página de Patrimonio é exibida");
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void incluirRegistro(){
        LOGGER.info("Exibindo Incluir Registro Patrimonio");
        BrowserDriver.waitForElement(container.incluirRegistro);
        container.incluirRegistro.click();
    }

	public static void numeroPatrimonio(String valor){
		LOGGER.info("Inserindo valor no campo Numero Patrimonio");
		container.numeroPatrimonio.clear();
		container.numeroPatrimonio.sendKeys(valor);

	}

    public static void lotacao(String valor) {
        LOGGER.info("Inserindo valor no campo Lotação");
        container.lotacao.sendKeys(valor);
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

	public static void alterarRegistro() {
		LOGGER.info("Click em gridAlterar");
		container.alterar.click();
	}


}
