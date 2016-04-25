package gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.view;

import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.containers.AquisicaoMudasPageContainerInsert;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.entity.AquisicaoMudas;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AquisicaoMudasViewInsert {
    private static final Logger log = LoggerFactory.getLogger(AquisicaoMudasViewInsert.class);
	private static final AquisicaoMudasPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AquisicaoMudasPageContainerInsert.class);

    public static void isDisplayedCheck(){
		log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void cnpjCpfOrigem(String valor){
        log.debug(Constants.MGS_INSERIDO, "NOME/CPF/CNPJ", valor);
        conteiner.cnpjCpfOrigem.sendKeys(valor);
    }

    public static void pesquisar() {
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        conteiner.pesquisarOrigem.click();
        BrowserDriver.waitForElement(conteiner.pesquisarHomeOrigem);
        conteiner.selecionar.click();
    }

    public static void registroRenasem(String valor){
        log.debug(Constants.MGS_INSERIDO, "REGISTRO RENASEM", valor);
        conteiner.registroRenasem.sendKeys(valor);
    }

    public static void eMailOrigem(String valor){
        log.debug(Constants.MGS_INSERIDO, "EMAIL ORIGEM", valor);
        conteiner.eMailOrigem.sendKeys(valor);
    }

    public static void telefoneOrigem(String valor){
        log.debug(Constants.MGS_INSERIDO, "TELEFONE ORIGEM", valor);
        conteiner.telefoneOrigem.clear();
        conteiner.telefoneOrigem.sendKeys(valor);
    }

    public static void tipoDestino(String valor){
        log.debug(Constants.MGS_INSERIDO, "TIPO DESTINO", valor);
        BrowserDriver.selectByVisibleText(conteiner.tipoDestino, valor);
    }

    public static void cnpjCpfDestino(String valor){
        log.debug(Constants.MGS_INSERIDO, "NOME/CPF/CNPJ DESTINO", valor);
        conteiner.cnpjCpfDestino.sendKeys(valor);
    }

    public static void pesquisarDestino() {
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR DESTINO");
        conteiner.pesquisarDestino.click();
        BrowserDriver.waitForElement(conteiner.pesquisarHomeDestino);
        conteiner.selecionar.click();
    }

    public static void propriedadeDestino() {
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR DESTINO");
        BrowserDriver.waitForElement(conteiner.propriedadeDestino).click();
    }

    public static void telefoneDestino(String valor){
        log.debug(Constants.MGS_INSERIDO, "TELEFONE DESTINO", valor);
        conteiner.telefoneDestino.clear();
        conteiner.telefoneDestino.sendKeys(valor);
    }

    public static void adicionarTransportador(AquisicaoMudas.Transporte transporte) {
        log.debug(Constants.MGS_SELECIONADO, "ADICIONAR TRANSPORTADOR");
        conteiner.adicionarTransportador.click();
        BrowserDriver.waitForElement(conteiner.adicionarTransportadorHome);
        BrowserDriver.selectByVisibleText(conteiner.tipoTransporte, transporte.getTipoTransporte());
        conteiner.confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(By.id("div_id_transportador"));
    }

    public static void adicionarMudas(AquisicaoMudas.Mudas mudas) {
        log.debug(Constants.MGS_SELECIONADO, "ADICIONAR MUDAS");
        conteiner.adicionarMudas.click();
        BrowserDriver.waitForElement(conteiner.adicionarMudasHome);
        BrowserDriver.selectByVisibleText(conteiner.produto, mudas.getProduto());
        BrowserDriver.waitForElement(conteiner.cultivar).click();
        BrowserDriver.selectByVisibleText(conteiner.tipoProduto, mudas.getTipoProduto());
        conteiner.quantidade.clear();
        conteiner.quantidade.sendKeys(mudas.getQuantidade());
        BrowserDriver.selectByVisibleText(conteiner.embalagem, mudas.getEmbalagem());
        BrowserDriver.selectByVisibleText(conteiner.metodoPropagacao, mudas.getMetodoPropaganda());
        conteiner.confirmar.click();
        conteiner.confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(By.id("div_produtos"));
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
