package gov.goias.agrodefesa.admin.view;

import gov.goias.agrodefesa.admin.containers.HomePageContainer;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeView {
    private static final Logger log = LoggerFactory.getLogger(HomeView.class);
	private static final HomePageContainer container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), HomePageContainer.class);
	
	public static void isDisplayedCheck(){
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(container.homePageTitle);
		container.homePageTitle.isDisplayed();
	}

	public static void isUserNameCheck(String userName){
        Assert.assertTrue(isUserName(userName));
    }

    public static boolean isUserName(String userName){
        log.debug("Verificando se o descricao do usuario logado esta correto");
        return container.homePageTitle.getText().toUpperCase().contains(userName.toUpperCase());
    }

    public static void logout(){
        log.debug(Constants.MGS_SELECIONADO, "Logging out");
        container.logout.click();
        BrowserDriver.closeAlert();
    }

}
