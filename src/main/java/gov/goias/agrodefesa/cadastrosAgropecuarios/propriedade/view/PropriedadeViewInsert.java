package gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.containers.PropriedadePageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class PropriedadeViewInsert {
    //private static final Logger log = Logger.getLogger(PropriedadeViewInsert.class.getName());
    private static final Logger log = LoggerFactory.getLogger(PropriedadeViewInsert.class);
	private static final PropriedadePageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PropriedadePageContainerInsert.class);

	public static void isDisplayedCheck(){
		log.debug("Verificando - Incluir Registro e exibida");
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void produtor(String valor){
        log.debug("Inserindo {} = {}", "Produtor", valor);
        conteiner.produtor.clear();
        conteiner.produtor.sendKeys(valor);
        BrowserDriver.waitForElement(conteiner.produtorAutoComplete).click();
    }

    public static void pesquisar() {
        log.debug("Selecionado {}", "pesquisar");
        conteiner.pesquisar.click();
        BrowserDriver.waitForElement(conteiner.cliqueAqui);
        conteiner.cliqueAqui.click();
    }

    public static void nomePropriedade(String valor){
        log.debug("Inserindo {} = {}", "Nome Propriedade", valor);
        BrowserDriver.waitForElement(conteiner.nomePropriedade);
        conteiner.nomePropriedade.clear();
        conteiner.nomePropriedade.sendKeys(valor);
    }

    public static void tipoDeContribuinte(String valor){
        log.debug("Inserindo {} = {}", "Tipo de Contribuinte", valor);
        BrowserDriver.getDropDownOption(conteiner.tipoDeContribuinte, valor).click();
    }

    public static void condicaoDePropriedade(String valor){
        log.debug("Inserindo {} = {}", "condicao de propriedade", valor);
        BrowserDriver.getDropDownOption(conteiner.condicaoDePropriedade, valor).click();
    }

    public static void adionarEndereco(String tipoEndereco, String endereco, String bairro, String cep, String roteiro){
        conteiner.adicionarEndereco.click();
        BrowserDriver.waitForElement(conteiner.tipoEndereco);
        BrowserDriver.getDropDownOption(conteiner.tipoEndereco, tipoEndereco).click();
        conteiner.endereco.sendKeys(endereco);
        conteiner.bairro.sendKeys(bairro);
        conteiner.cep.sendKeys(cep);
        conteiner.roteiro.sendKeys(roteiro);
        conteiner.confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(By.id("id_enderecotipo"));
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
