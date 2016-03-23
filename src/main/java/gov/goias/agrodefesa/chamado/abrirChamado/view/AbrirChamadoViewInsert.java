package gov.goias.agrodefesa.chamado.abrirChamado.view;

import gov.goias.agrodefesa.chamado.abrirChamado.containers.AbrirChamadoPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbrirChamadoViewInsert {
    private static final Logger log = LoggerFactory.getLogger(AbrirChamadoViewInsert.class);
	private static final AbrirChamadoPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AbrirChamadoPageContainerInsert.class);

	public static void isDisplayedCheck(){
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void solicitante(String valor){
        log.debug(Constants.MGS_INSERIDO, "SOLICITANTE", valor);
        conteiner.solicitante.clear();
        conteiner.solicitante.sendKeys(valor);
        BrowserDriver.waitForElement(conteiner.solicitanteAutoComplete);
        conteiner.solicitanteAutoComplete.click();
    }

    public static void tipoSuporte(String valor) {
        log.debug(Constants.MGS_INSERIDO, "TIPO SUPORTE", valor);
        BrowserDriver.selectByVisibleText(conteiner.tipoSuporte, valor);
    }

    public static void classificacao(String valor) {
        log.debug(Constants.MGS_INSERIDO, "CLASSIFICACAO", valor);
        BrowserDriver.waitForElement(conteiner.classificacao);
        conteiner.classificacao.click();
        conteiner.classificacaoInput.click();
    }

    public static void tipoContato(String valor) {
        log.debug(Constants.MGS_INSERIDO, "TIPO CONTATO", valor);
        BrowserDriver.selectByVisibleText(conteiner.tipoContato, valor);
    }

    public static void problema(String valor) {
        log.debug(Constants.MGS_INSERIDO, "PROBLEMA", valor);
        conteiner.problema.clear();
        conteiner.problema.sendKeys(valor);
    }

    public static void adotarChamado(String valor) {
        log.debug(Constants.MGS_INSERIDO, "ADOTAR CHAMADO", valor);
        BrowserDriver.selectByVisibleText(conteiner.adotarChamado, valor);
    }

    public static void salvar() {
        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.waitForElement(conteiner.salvar);
        conteiner.salvar.click();
    }

    public static void aviso(String valor) {
        log.debug(Constants.MGS_MENSAGEM, valor);
        BrowserDriver.waitForElement(conteiner.aviso);
        Assert.assertEquals(conteiner.aviso.getText(), valor);
        conteiner.ok.click();
    }



}
