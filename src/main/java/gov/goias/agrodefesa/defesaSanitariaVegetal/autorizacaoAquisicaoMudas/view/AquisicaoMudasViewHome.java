package gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.view;

import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.containers.AquisicaoMudasPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AquisicaoMudasViewHome {
	private static final Logger log = LoggerFactory.getLogger(AquisicaoMudasViewInsert.class);
	private static final AquisicaoMudasPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AquisicaoMudasPageContainerHome.class);

	public static void isDisplayedCheck(){
		log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void incluirRegistro(){
        log.debug(Constants.MGS_SELECIONADO, "INCLUIR REGISTRO");
        container.incluirRegistro.click();
    }

	public static void cpfCnpjOrigem(String valor) {
		log.debug(Constants.MGS_INSERIDO, "CPF CNPJ ORIGEM", valor);
		container.cpfCnpjOrigem.sendKeys(valor);
	}

    public static void pesquisar() {
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
		container.pesquisar.click();
	}

	public static void aprovacao() {
		log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(container.aprovar);
		container.aprovar.click();
	}


}
