package gov.goias.agrodefesa.chamado.abrirChamado.view;

import gov.goias.agrodefesa.chamado.abrirChamado.containers.AbrirChamadoPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbrirChamadoViewHome {
    private static final Logger log = LoggerFactory.getLogger(AbrirChamadoViewHome.class);
	private static final AbrirChamadoPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AbrirChamadoPageContainerHome.class);

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

	public static void numeroChamado(String valor){
        log.debug(Constants.MGS_INSERIDO, "NUMERO CHAMADO", valor);
		container.numeroChamado.clear();
        container.numeroChamado.sendKeys(valor);
	}

    public static void pesquisar() {
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
		container.form.submit();
	}

	public static void isDisplayedGridPesquisar(String valor) {
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(container.gridRow);
        container.gridRow.isDisplayed();
        Assert.assertEquals(valor, container.gridRow.getText());
	}

	public static void finalizar() {
        log.debug(Constants.MGS_SELECIONADO, "OPERACAO FINALIZAR");
		container.finalizar.click();
	}

    public static void classificacao(String valor) {
        log.debug(Constants.MGS_INSERIDO, "CLASSIFICACAO", valor);
        container.classificacao.sendKeys(valor);
        BrowserDriver.waitForElement(container.classificacaoAutoComplete);
        container.classificacaoAutoComplete.click();
    }

    public static void solicitante(String valor) {
        log.debug(Constants.MGS_INSERIDO, "SOLICITANTE", valor);
        container.solicitante.sendKeys(valor);
        BrowserDriver.waitForElement(container.solicitanteAutoComplete);
        container.solicitanteAutoComplete.click();
    }

    public static void tecnico(String valor) {
        log.debug(Constants.MGS_INSERIDO, "TECNICO", valor);
        container.tecnico.sendKeys(valor);
        BrowserDriver.waitForElement(container.tecnicoAutoComplete);
        container.tecnicoAutoComplete.click();
    }

    public static void lotacao(String valor) {
        log.debug(Constants.MGS_INSERIDO, "LOTACAO", valor);
        container.lotacao.sendKeys(valor);
        BrowserDriver.waitForElement(container.lotacaoAutoComplete);
        container.lotacaoAutoComplete.click();
    }

    public static void suporte(String valor) {
        log.debug(Constants.MGS_INSERIDO, "SUPORTE", valor);
        BrowserDriver.selectByVisibleText(container.suporte, valor);
    }

    public static void contato(String valor) {
        log.debug(Constants.MGS_INSERIDO, "CONTATO", valor);
        BrowserDriver.selectByVisibleText(container.contato, valor);
    }

    public static void situacao(String valor) {
        log.debug(Constants.MGS_INSERIDO, "SITUACAO", valor);
        BrowserDriver.selectByVisibleText(container.situacao, valor);
    }

}
