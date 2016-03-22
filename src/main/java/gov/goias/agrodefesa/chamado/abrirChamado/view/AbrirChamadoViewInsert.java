package gov.goias.agrodefesa.chamado.abrirChamado.view;

import gov.goias.agrodefesa.chamado.abrirChamado.containers.AbrirChamadoPageContainerInsert;
import gov.goias.agrodefesa.controleDeBens.tranferencia.containers.TransferenciaPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class AbrirChamadoViewInsert {
	private static final Logger LOGGER = Logger.getLogger(AbrirChamadoViewInsert.class.getName());
	private static final AbrirChamadoPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AbrirChamadoPageContainerInsert.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando pagina Abrir Chamado - Incluir Registro e exibida");
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void solicitante(String valor){
        LOGGER.info("Inserindo valor no campo Solicitante");
        conteiner.solicitante.clear();
        conteiner.solicitante.sendKeys(valor);
        BrowserDriver.waitForElement(conteiner.solicitanteAutoComplete);
        conteiner.solicitanteAutoComplete.click();
    }

    public static void tipoSuporte(String valor) {
        LOGGER.info("Inserindo valor no campo Tipo Suporte");
        BrowserDriver.getDropDownOption(conteiner.tipoSuporte, valor).click();
    }

    public static void classificacao(String valor) {
        LOGGER.info("Inserindo valor no campo Classificacao");
        BrowserDriver.waitForElement(conteiner.classificacao);
        conteiner.classificacao.click();
        conteiner.classificacaoInput.click();
    }

    public static void tipoContato(String valor) {
        LOGGER.info("Inserindo valor no campo Tipo Contato");
        BrowserDriver.getDropDownOption(conteiner.tipoContato, valor).click();
    }

    public static void problema(String valor) {
        LOGGER.info("Inserindo valor no campo Problema: "+valor);
        conteiner.problema.clear();
        conteiner.problema.sendKeys(valor);
    }

    public static void adotarChamado(String valor) {
        LOGGER.info("Inserindo valor no campo Adotar Chamado: "+valor);
        BrowserDriver.getDropDownOption(conteiner.adotarChamado, valor).click();
    }

    public static void salvar() {
        LOGGER.info("Salvando os dados");
        BrowserDriver.waitForElement(conteiner.salvar);
        conteiner.salvar.click();
    }

    public static void aviso(String valor) {
        LOGGER.info("Mensagem de aviso");
        BrowserDriver.waitForElement(conteiner.aviso);
        Assert.assertEquals(conteiner.aviso.getText(), valor);
        conteiner.ok.click();
    }



}
