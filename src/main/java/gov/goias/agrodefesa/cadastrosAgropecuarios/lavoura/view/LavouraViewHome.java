package gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.containers.LavouraPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LavouraViewHome {
	private static final Logger log = LoggerFactory.getLogger(LavouraViewInsert.class);
	private static final LavouraPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LavouraPageContainerHome.class);

	public static void isDisplayedCheck(){
        log.debug("Verificando - Home é exibida");
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void incluirRegistro(){
        log.debug("Exibindo Incluir Registro");
        BrowserDriver.waitForElement(container.incluirRegistro);
        container.incluirRegistro.click();
    }

	public static void inscricaoEstadual(String valor){
		log.debug("Inserindo {} = {}", "Incricao Estadual", valor);
		container.inscricaoEstadual.clear();
		container.inscricaoEstadual.sendKeys(valor);
	}

    public static void pesquisar() {
		log.debug("Click Pesquisar");
		container.pesquisar.click();
	}

	public static void isDisplayedGridPesquisar() {
        log.debug("Verificando - Grid é exibida");
		BrowserDriver.waitForElement(container.gridRow);
		container.gridRow.isDisplayed();
	}

	public static void alterar() {
		log.debug("Click no Grid operação Alterar");
		container.alterar.click();
	}


}
