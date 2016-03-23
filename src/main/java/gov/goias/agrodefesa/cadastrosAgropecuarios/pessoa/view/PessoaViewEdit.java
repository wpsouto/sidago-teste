package gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.containers.PessoaPageContainerEdit;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PessoaViewEdit {
    private static final Logger log = LoggerFactory.getLogger(PessoaViewHome.class);
	private static final PessoaPageContainerEdit conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PessoaPageContainerEdit.class);

	public static void isDisplayedCheck(){
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void nomeEmpresa(String valor){
        log.debug(Constants.MGS_INSERIDO, "NOME EMPRESA", valor);
        BrowserDriver.waitForElement(conteiner.nomeEmpresa);
        conteiner.nomeEmpresa.sendKeys(valor);
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
