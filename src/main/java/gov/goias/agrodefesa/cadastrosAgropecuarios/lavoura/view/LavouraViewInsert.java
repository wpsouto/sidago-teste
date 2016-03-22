package gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.containers.LavouraPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Produto;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LavouraViewInsert {
    private static final Logger log = LoggerFactory.getLogger(LavouraViewInsert.class);
	private static final LavouraPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LavouraPageContainerInsert.class);

    public static void isDisplayedCheck(){
		log.debug("Verificando - Incluir Registro e exibida");
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void listaSefaz(String valor){
        log.debug("Inserindo {} = {}", "Lista Sefaz", valor);
        BrowserDriver.waitForElement(conteiner.listaSefaz).click();
    }

    public static void adicionarProduto(Produto produto) {
        log.debug("Click adicionarEndereco");
        conteiner.adicionarProduto.click();
        BrowserDriver.waitForElement(conteiner.produto);
        BrowserDriver.selectByVisibleText(conteiner.produto, produto.getProduto());
        BrowserDriver.selectByVisibleText(conteiner.cultivar, produto.getCultivar());
        BrowserDriver.selectByVisibleText(conteiner.tipoProduto, produto.getTipoProduto());
        conteiner.estimativaProducao.sendKeys(produto.getEstimativaProducao());
        conteiner.dataPrevistoPlantio.sendKeys(produto.getDataPrevistaPlantio());
        conteiner.dataAtual.click();
        conteiner.previsaoInicioColheita.sendKeys(produto.getPrevisaoInicioColheita());
        conteiner.dataAtual.click();
        conteiner.previsaoFimColheita.sendKeys(produto.getPrevisaoFimColheita());
        conteiner.dataAtual.click();
        conteiner.areaPlantada.sendKeys(produto.getAreaPlantada());
        conteiner.confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(By.id("div_produtos"));
    }

    public static void sistemaCultivo(String valor){
        log.debug("Inserindo {} = {}", "sistema cultivo", valor);
        BrowserDriver.waitForElement(conteiner.sistemaCultivo);
        BrowserDriver.selectByVisibleText(conteiner.sistemaCultivo, valor);
    }

    public static void origemSemente(String valor){
        log.debug("Inserindo {} = {}", "origem semente", valor);
        BrowserDriver.waitForElement(conteiner.origemSemente);
        BrowserDriver.selectByVisibleText(conteiner.origemSemente, valor);
    }

    public static void salvar() {
        log.debug("Salvando os dados");
        conteiner.salvar.click();
    }

    public static void aviso(String valor) {
        log.debug("Mensagem de aviso");
        BrowserDriver.waitForElement(conteiner.aviso);
        Assert.assertEquals(conteiner.aviso.getText(), valor);
        conteiner.ok.click();
    }
}
