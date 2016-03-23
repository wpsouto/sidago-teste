package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.containers.EmpresaForaGoiasPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmpresaForaGoiasViewHome {
	private static final Logger log = LoggerFactory.getLogger(EmpresaForaGoiasViewHome.class);
	private static final EmpresaForaGoiasPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), EmpresaForaGoiasPageContainerHome.class);

	public static void isDisplayedCheck(){
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void incluirRegistro(){
        log.debug(Constants.MGS_SELECIONADO, "INCLUIR REGISTRO");
        BrowserDriver.waitForElement(container.incluirRegistro);
        container.incluirRegistro.click();
    }

	public static void cnpj(String valor){
        log.debug(Constants.MGS_INSERIDO, "CNPJ", valor);
		container.cnpj.clear();
		container.cnpj.sendKeys(valor);
	}

    public static void pesquisar() {
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
		container.pesquisar.click();
	}

	public static void isDisplayedGridPesquisar() {
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(container.gridRow);
		container.gridRow.isDisplayed();
	}

	public static void alterar() {
        log.debug(Constants.MGS_SELECIONADO, "ALTERAR");
		container.alterar.click();
	}


}
