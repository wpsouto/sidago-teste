package gov.goias.agrodefesa.controleDeBens.almoxarifado.view;

import gov.goias.agrodefesa.controleDeBens.almoxarifado.containers.AlmoxarifadoPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class AlmoxarifadoViewHome {
	private static final Logger LOGGER = Logger.getLogger(AlmoxarifadoViewHome.class.getName());
	private static final AlmoxarifadoPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AlmoxarifadoPageContainerHome.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando página de Almoxarifado é exibida");
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void incluirRegistro(){
        LOGGER.info("Exibindo Incluir Registro Almoxarifado");
        BrowserDriver.waitForElement(container.incluirRegistro);
        container.incluirRegistro.click();
    }

	public static void descricao(String valor){
		LOGGER.info("Inserindo valor no campo Descricao");
		container.descricao.clear();
		container.descricao.sendKeys(valor);
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
		LOGGER.info("Validando Pesquisa");
		BrowserDriver.waitForElement(container.gridRow);
		container.gridRow.isDisplayed();
	}

	public static void alterar() {
		LOGGER.info("Click em gridAlterar");
		container.alterar.click();
	}


}
