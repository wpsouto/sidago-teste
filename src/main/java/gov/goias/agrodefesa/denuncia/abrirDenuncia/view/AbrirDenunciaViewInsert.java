package gov.goias.agrodefesa.denuncia.abrirDenuncia.view;

import gov.goias.agrodefesa.denuncia.abrirDenuncia.containers.AbrirDenunciaPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbrirDenunciaViewInsert {
    private static final Logger log = LoggerFactory.getLogger(AbrirDenunciaViewInsert.class);
	private static final AbrirDenunciaPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AbrirDenunciaPageContainerInsert.class);

	public static void isDisplayedCheck(){
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void tipoInfracao(String valor){
        log.debug(Constants.MGS_INSERIDO, "TIPO INFRACAO", valor);
        BrowserDriver.selectByVisibleText(conteiner.tipoInfracao, valor);
    }

    public static void assunto(String valor){
        log.debug(Constants.MGS_INSERIDO, "ASSUNTO", valor);
        conteiner.assunto.clear();
        conteiner.assunto.sendKeys(valor);
    }

    public static void salvar() {
        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        conteiner.salvar.click();
    }

    public static void aviso(String valor) {
        log.debug(Constants.MGS_MENSAGEM, valor);
        BrowserDriver.waitForElement(conteiner.aviso);
        Assert.assertEquals(conteiner.aviso.getText(), valor);
        conteiner.ok.click();
    }

}
