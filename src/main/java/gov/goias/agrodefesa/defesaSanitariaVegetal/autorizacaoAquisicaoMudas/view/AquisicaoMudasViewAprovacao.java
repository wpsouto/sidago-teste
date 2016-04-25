package gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.view;

import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.containers.AquisicaoMudasPageContainerAprovar;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AquisicaoMudasViewAprovacao {
    private static final Logger log = LoggerFactory.getLogger(AquisicaoMudasViewInsert.class);
	private static final AquisicaoMudasPageContainerAprovar conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AquisicaoMudasPageContainerAprovar.class);

	public static void isDisplayedCheck(){
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void observacao(String valor) {
        log.debug(Constants.MGS_INSERIDO, "OBSERVACAO", valor);
        conteiner.observacao.sendKeys(valor);
    }

    public static void situacao(String valor) {
        log.debug(Constants.MGS_INSERIDO, "SITUACAO", valor);
        BrowserDriver.selectByVisibleText(conteiner.situacao, valor);
    }

    public static void salvar() {
        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        conteiner.salvar.click();
    }

    public static void aviso(String valor) {
        log.debug(Constants.MGS_MENSAGEM, valor);
        BrowserDriver.waitForText(conteiner.aviso, valor);
        conteiner.ok.click();
    }


}
