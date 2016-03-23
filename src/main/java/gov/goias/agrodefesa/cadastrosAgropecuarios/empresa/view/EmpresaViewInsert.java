package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.containers.EmpresaPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmpresaViewInsert {
    private static final Logger log = LoggerFactory.getLogger(EmpresaViewInsert.class);
	private static final EmpresaPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), EmpresaPageContainerInsert.class);

	public static void isDisplayedCheck(){
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void documento(String valor){
        log.debug(Constants.MGS_INSERIDO, "DOCUMENTO", valor);
        conteiner.documento.clear();
        conteiner.documento.sendKeys(valor);
    }

    public static void classificacao(String valor){
        log.debug(Constants.MGS_INSERIDO, "CLASSIFICACAO", valor);
        BrowserDriver.selectByVisibleText(conteiner.classificacao, valor);
    }

    public static void pesquisar() {
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        conteiner.pesquisar.click();
        BrowserDriver.waitForElement(conteiner.cliqueAqui);
        conteiner.cliqueAqui.click();
    }

    public static void informacaoObrigatoria(String socio, String nomeEmpresa, String nomeFantasia){
        log.debug(Constants.MGS_SELECIONADO, "INFORMACAO OBRIGATORIA");
        BrowserDriver.waitForElement(conteiner.informacaoObrigatoria);
        conteiner.informacaoObrigatoria.click();

        conteiner.socio.sendKeys(socio);
        BrowserDriver.waitForElement(conteiner.socioAutoComplete);
        conteiner.socioAutoComplete.click();

        conteiner.nomeEmpresa.sendKeys(nomeEmpresa);

        conteiner.nomeFantasia.sendKeys(nomeFantasia);
    }
    public static void informacaoComplementar(){
        log.debug(Constants.MGS_SELECIONADO, "INFORMACAO COMPLEMENTAR");
        BrowserDriver.waitForElement(conteiner.informacaoComplementar);
        conteiner.informacaoComplementar.click();
        conteiner.adicionarEndereco.click();
        conteiner.confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(By.id("div_id_endereco"));
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
