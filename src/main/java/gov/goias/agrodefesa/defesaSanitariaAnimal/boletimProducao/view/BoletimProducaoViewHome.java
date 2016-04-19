package gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.view;

import gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.containers.BoletimProducaoPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoletimProducaoViewHome {
	private static final Logger log = LoggerFactory.getLogger(BoletimProducaoViewHome.class);
	private static final BoletimProducaoPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), BoletimProducaoPageContainerHome.class);

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

	public static void cpfCnpjProdutor(String valor){
        log.debug(Constants.MGS_INSERIDO, "CPF/CNPJ PRODUTOR", valor);
        container.cpfCnpjProdutor.sendKeys(valor);
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

	public static void cancelar() {
        log.debug(Constants.MGS_SELECIONADO, "CANCELAR");
        BrowserDriver.waitForElement(container.cancelar);
        container.cancelar.click();
        BrowserDriver.waitForElement(container.boxDelete);
        container.cancelarBoletimProducao.click();
	}

    public static void aviso(String valor) {
        log.debug(Constants.MGS_MENSAGEM, valor);
        BrowserDriver.waitForText(container.boxDelete, valor);
    }


}
