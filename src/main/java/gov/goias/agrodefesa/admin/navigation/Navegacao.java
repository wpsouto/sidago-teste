package gov.goias.agrodefesa.admin.navigation;

import gov.goias.agrodefesa.admin.view.HomeView;
import gov.goias.agrodefesa.admin.view.LoginView;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.*;

public class Navegacao {

    //private static final Logger LOGGER = Logger.getLogger(Navigation.class.getName());
	public static final String PASSWORD = "admin";
    public boolean autentaticado;

	public Navegacao() {
        autentaticado = false;
    }

    public void pageLoad(Action action, String key){
        NavegacaoStrategy page = NavegacaoContext.parce(key);
        page.execAcao(action);
    }

    public NavegacaoStrategy pageLoad(NavegacaoType type){
        return NavegacaoContext.parce(type);
    }

    private void loginPage(){
		BrowserDriver.loadPage(NavegacaoType.HTTP_BASE);
		LoginView.isDisplayedCheck();
	}

	private void autenticar(String login, String nome) {
		LoginView.login(login, PASSWORD);
        HomeView.isDisplayedCheck();
        HomeView.isUserNameCheck(nome);
	}

    public void login(String CPF, String nome) {
        if (!autentaticado) {
            loginPage();
            autenticar(CPF, nome);
            autentaticado = true;
        }
        else {
           if (!HomeView.isUserName(nome)){
             autentaticado = false;
             login(CPF, nome);
           }
        }
    }

}
