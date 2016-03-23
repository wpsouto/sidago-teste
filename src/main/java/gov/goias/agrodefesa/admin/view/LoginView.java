package gov.goias.agrodefesa.admin.view;

import gov.goias.agrodefesa.admin.containers.LoginPageContainer;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginView {
	private static final Logger log = LoggerFactory.getLogger(LoginView.class);
	private static final LoginPageContainer loginContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginPageContainer.class);
	
	public static void isDisplayedCheck(){
		log.debug(Constants.MGS_AGUARDANDO);
		loginContainer.loginHome();
	}
	
	public static void login(String username, String password){
        log.info("Fazendo login com nome de usuário: {} senha: {}", username, password);
        loginContainer.login(username,password);
	}

	
}
