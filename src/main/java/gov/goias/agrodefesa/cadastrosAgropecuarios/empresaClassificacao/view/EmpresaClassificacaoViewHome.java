package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.containers.EmpresaClassificacaoPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class EmpresaClassificacaoViewHome {
	private static final Logger LOGGER = Logger.getLogger(EmpresaClassificacaoViewHome.class.getName());
	private static final EmpresaClassificacaoPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), EmpresaClassificacaoPageContainerHome.class);

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

	public static void classificacao(String valor){
		LOGGER.info("Inserindo valor no campo Descricao");
		container.classificacao.clear();
		container.classificacao.sendKeys(valor);
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
