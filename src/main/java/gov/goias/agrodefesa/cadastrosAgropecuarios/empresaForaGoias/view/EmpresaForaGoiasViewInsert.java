package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.containers.EmpresaForaGoiasPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmpresaForaGoiasViewInsert {
    private static final Logger log = LoggerFactory.getLogger(EmpresaForaGoiasViewInsert.class);
	private static final EmpresaForaGoiasPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), EmpresaForaGoiasPageContainerInsert.class);

	public static void isDisplayedCheck(){
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void numeroDocumento(String valor){
        log.debug(Constants.MGS_INSERIDO, "NUMERO DOCUMENTO", valor);
        conteiner.numeroDocumento.clear();
        conteiner.numeroDocumento.sendKeys(valor);
    }

    public static void pesquisar() {
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        conteiner.pesquisar.click();
        BrowserDriver.waitForElement(conteiner.selecionar);
        conteiner.selecionar.click();
    }

    public static void classificacao(String valor){
        log.debug(Constants.MGS_INSERIDO, "CLASSIFICACAO", valor);
        BrowserDriver.selectByVisibleText(conteiner.classificacao, valor);
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
