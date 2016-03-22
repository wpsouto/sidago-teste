package gov.goias.agrodefesa.admin.view;

import gov.goias.agrodefesa.admin.containers.LoginPageContainer;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class LoginView {
	private static final Logger LOGGER = Logger.getLogger(LoginView.class.getName());
	private static final LoginPageContainer loginContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginPageContainer.class);
	
	public static void isDisplayedCheck(){
		LOGGER.info("Verificando página de login é exibido");
		loginContainer.loginHome();
	}
	
	public static void login(String username, String password){
		LOGGER.info("Fazendo login com nome de usuário:" + username + " senha:" + password);
        loginContainer.login(username,password);
		LOGGER.info("Login submetido");
	}

	
}
