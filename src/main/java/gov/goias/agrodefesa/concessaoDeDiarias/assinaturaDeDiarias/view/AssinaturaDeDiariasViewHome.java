package gov.goias.agrodefesa.concessaoDeDiarias.assinaturaDeDiarias.view;

import gov.goias.agrodefesa.concessaoDeDiarias.assinaturaDeDiarias.containers.AssinaturaDeDiariasPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AssinaturaDeDiariasViewHome {
    private static final Logger log = LoggerFactory.getLogger(AssinaturaDeDiariasViewHome.class);
	private static final AssinaturaDeDiariasPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AssinaturaDeDiariasPageContainerHome.class);

	public static void isDisplayedCheck(){
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void numeroDaDiaria(String valor) {
        log.debug(Constants.MGS_INSERIDO, "NUMERO DA DIARIA", valor);
        container.numeroDaDiaria.sendKeys(valor);
    }

    public static void pesquisar() {
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        container.pesquisar.click();
    }

    public static void isDisplayedGridPesquisar() {
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(container.gridNumero);
        container.gridNumero.isDisplayed();
        Assert.assertEquals(container.numeroDaDiaria.getAttribute("value"), container.gridNumero.getText());
    }

    public static void informacoesDetalhadas() {
        log.debug(Constants.MGS_SELECIONADO, "OPERACAO INFORMACOES DETALHADAS");
        BrowserDriver.waitForElement(container.gridInformacoesDetalhadas);
        container.gridInformacoesDetalhadas.click();
    }

    public static void assinar(){
        log.debug(Constants.MGS_SELECIONADO, "ASSINAR");
        BrowserDriver.waitForElement(container.assinar);
        container.assinar.click();
    }

    public static void confirmar(){
        log.debug(Constants.MGS_SELECIONADO, "OPERACAO CONFIRMAR");
        BrowserDriver.waitForElement(container.confirmar);
        container.confirmar.click();
    }

}

