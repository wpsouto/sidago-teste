package gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.containers.PropriedadePageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropriedadeViewInsert {
    private static final Logger log = LoggerFactory.getLogger(PropriedadeViewInsert.class);
	private static final PropriedadePageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PropriedadePageContainerInsert.class);

    public static void isDisplayedCheck(){
		log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void produtor(String valor){
        log.debug(Constants.MGS_INSERIDO, valor);
        conteiner.produtor.clear();
        conteiner.produtor.sendKeys(valor);
        BrowserDriver.waitForElement(conteiner.produtorAutoComplete).click();
    }

    public static void pesquisar() {
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        conteiner.pesquisar.click();
        BrowserDriver.waitForElement(conteiner.cliqueAqui);
        conteiner.cliqueAqui.click();
    }

    public static void nomePropriedade(String valor){
        log.debug(Constants.MGS_INSERIDO, "Nome Propriedade", valor);
        BrowserDriver.waitForElement(conteiner.nomePropriedade);
        conteiner.nomePropriedade.clear();
        conteiner.nomePropriedade.sendKeys(valor);
    }

    public static void tipoDeContribuinte(String valor){
        log.debug(Constants.MGS_INSERIDO, "Tipo de Contribuinte", valor);
        BrowserDriver.selectByVisibleText(conteiner.tipoDeContribuinte, valor);
    }

    public static void condicaoDePropriedade(String valor){
        log.debug(Constants.MGS_INSERIDO, "condicao de propriedade", valor);
        BrowserDriver.selectByVisibleText(conteiner.condicaoDePropriedade, valor);
    }

    public static void adionarEndereco(String tipoEndereco, String endereco, String bairro, String cep, String roteiro){
        log.debug(Constants.MGS_INSERIDO, "adionarEndereco");
        conteiner.adicionarEndereco.click();
        BrowserDriver.waitForElement(conteiner.tipoEndereco);
        BrowserDriver.selectByVisibleText(conteiner.tipoEndereco, tipoEndereco);
        conteiner.endereco.sendKeys(endereco);
        conteiner.bairro.sendKeys(bairro);
        conteiner.cep.sendKeys(cep);
        conteiner.roteiro.sendKeys(roteiro);
        conteiner.confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(By.id("id_enderecotipo"));
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
