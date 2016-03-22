package gov.goias.agrodefesa.admin.view;

import gov.goias.agrodefesa.admin.containers.HomePageContainer;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class HomeView {
	private static final Logger LOGGER = Logger.getLogger(HomeView.class.getName());
	private static final HomePageContainer container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), HomePageContainer.class);
	
	public static void isDisplayedCheck(){
		LOGGER.info("Verificando página Inicial é exibido");
		BrowserDriver.waitForElement(container.homePageTitle);
		container.homePageTitle.isDisplayed();
	}

	public static void isUserNameCheck(String userName){
		LOGGER.info("Verificando se o nome do usuario logado esta correto");
        Assert.assertTrue(isUserName(userName));
    }

    public static boolean isUserName(String userName){
        LOGGER.info("Verificando se o nome do usuario logado esta correto");
        return container.homePageTitle.getText().toUpperCase().contains(userName.toUpperCase());
    }

    public static void logout(){
        LOGGER.info("Logging out");
        container.logout.click();
        BrowserDriver.closeAlert();
    }

}
