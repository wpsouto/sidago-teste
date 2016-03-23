package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.containers.EmpresaForaGoiasPageContainerEdit;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmpresaForaGoiasViewEdit {
    private static final Logger log = LoggerFactory.getLogger(EmpresaForaGoiasViewEdit.class);
	private static final EmpresaForaGoiasPageContainerEdit conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), EmpresaForaGoiasPageContainerEdit.class);

	public static void isDisplayedCheck(){
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
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
