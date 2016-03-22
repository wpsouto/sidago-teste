package gov.goias.agrodefesa.chamado.abrirChamado.view;

import gov.goias.agrodefesa.chamado.abrirChamado.containers.AbrirChamadoPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class AbrirChamadoViewHome {
	private static final Logger LOGGER = Logger.getLogger(AbrirChamadoViewHome.class.getName());
	private static final AbrirChamadoPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AbrirChamadoPageContainerHome.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando a página de Abrir Chamado é exibida");
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void incluirRegistro(){
        LOGGER.info("Exibindo Incluir Registro Abrir Chamado");
        BrowserDriver.waitForElement(container.incluirRegistro);
        container.incluirRegistro.click();
    }

	public static void numeroChamado(String valor){
		LOGGER.info("Inserindo valor no campo Numero Chamado");
		container.numeroChamado.clear();
        container.numeroChamado.sendKeys(valor);
	}

    public static void pesquisar() {
		LOGGER.info("Pesquisando");
		container.form.submit();
	}

	public static void isDisplayedGridPesquisar(String valor) {
        LOGGER.info("Validando Pesquisa "+container.gridRow.getText());
        BrowserDriver.waitForElement(container.gridRow);
        container.gridRow.isDisplayed();
        Assert.assertEquals(valor, container.gridRow.getText());
	}

	public static void finalizar() {
		LOGGER.info("Click em grid Confirmar");
		container.finalizar.click();
	}

    public static void classificacao(String valor) {
        LOGGER.info("Inserindo valor no campo Classificacao");
        container.classificacao.sendKeys(valor);
        BrowserDriver.waitForElement(container.classificacaoAutoComplete);
        container.classificacaoAutoComplete.click();
    }

    public static void solicitante(String valor) {
        LOGGER.info("Inserindo valor no campo Solicitante");
        container.solicitante.sendKeys(valor);
        BrowserDriver.waitForElement(container.solicitanteAutoComplete);
        container.solicitanteAutoComplete.click();
    }

    public static void tecnico(String valor) {
        LOGGER.info("Inserindo valor no campo Tecnico");
        container.tecnico.sendKeys(valor);
        BrowserDriver.waitForElement(container.tecnicoAutoComplete);
        container.tecnicoAutoComplete.click();
    }

    public static void lotacao(String valor) {
        LOGGER.info("Inserindo valor no campo Lotacao");
        container.lotacao.sendKeys(valor);
        BrowserDriver.waitForElement(container.lotacaoAutoComplete);
        container.lotacaoAutoComplete.click();
    }

    public static void suporte(String valor) {
        LOGGER.info("Inserindo valor no campo Suporte");
        BrowserDriver.getDropDownOption(container.suporte, valor).click();
    }

    public static void contato(String valor) {
        LOGGER.info("Inserindo valor no Contato");
        BrowserDriver.getDropDownOption(container.contato, valor).click();
    }

    public static void situacao(String valor) {
        LOGGER.info("Inserindo valor no Situacao");
        BrowserDriver.getDropDownOption(container.situacao, valor).click();
    }

}
