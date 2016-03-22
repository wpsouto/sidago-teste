package gov.goias.agrodefesa.concessaoDeDiarias.aprovacaoDoDiretor.view;

import gov.goias.agrodefesa.concessaoDeDiarias.aprovacaoDoDiretor.containers.AprovacaoDoDiretorPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class AprovacaoDoDiretorViewHome {
	private static final Logger LOGGER = Logger.getLogger(AprovacaoDoDiretorViewHome.class.getName());
	private static final AprovacaoDoDiretorPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AprovacaoDoDiretorPageContainerHome.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando a página de Aprovacao do Diretor é exibida");
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void aprovar(String valor) {
        LOGGER.info("Validando Pesquisa "+container.gridRow.getText());
        BrowserDriver.waitForElement(container.gridRow);
        container.gridRow.isDisplayed();
        Assert.assertEquals(valor, container.gridRow.getText());
        container.aprovar.click();
    }

    public static void concordar(){
        BrowserDriver.waitForElement(container.concordo);
        container.concordo.click();
    }


}
