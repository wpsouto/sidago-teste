package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.containers.EmpresaForaGoiasPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class EmpresaForaGoiasViewHome {
	private static final Logger LOGGER = Logger.getLogger(EmpresaForaGoiasViewHome.class.getName());
	private static final EmpresaForaGoiasPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), EmpresaForaGoiasPageContainerHome.class);

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

	public static void cnpj(String valor){
		LOGGER.info("Inserindo valor no campo Descricao");
		container.cnpj.clear();
		container.cnpj.sendKeys(valor);
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
