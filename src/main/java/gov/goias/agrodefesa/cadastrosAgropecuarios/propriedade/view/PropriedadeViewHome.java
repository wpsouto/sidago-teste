package gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.containers.PropriedadePageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class PropriedadeViewHome {
	private static final Logger LOGGER = Logger.getLogger(PropriedadeViewHome.class.getName());
	private static final PropriedadePageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PropriedadePageContainerHome.class);

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

	public static void cnpjCpf(String valor){
		LOGGER.info("Inserindo valor no campo Descricao");
		container.cnpjCpf.clear();
		container.cnpjCpf.sendKeys(valor);
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
