package gov.goias.agrodefesa.concessaoDeDiarias.aprovacaoDoDiretor.view;

import gov.goias.agrodefesa.concessaoDeDiarias.aprovacaoDoDiretor.containers.AprovacaoDoDiretorPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AprovacaoDoDiretorViewHome {
    private static final Logger log = LoggerFactory.getLogger(AprovacaoDoDiretorViewHome.class);
	private static final AprovacaoDoDiretorPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AprovacaoDoDiretorPageContainerHome.class);

	public static void isDisplayedCheck(){
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void aprovar(String valor) {
        log.debug(Constants.MGS_SELECIONADO, "OPERACAO APROVAR");
        BrowserDriver.waitForElement(container.gridRow);
        container.gridRow.isDisplayed();
        Assert.assertEquals(valor, container.gridRow.getText());
        container.aprovar.click();
    }

    public static void concordar(){
        log.debug(Constants.MGS_SELECIONADO, "OPERACAO CONCORDAR");
        BrowserDriver.waitForElement(container.concordo);
        container.concordo.click();
    }


}
