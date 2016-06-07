package gov.goias.agrodefesa.admin.navigation;

import gov.goias.agrodefesa.admin.view.HomeView;
import gov.goias.agrodefesa.admin.view.LoginView;
import gov.goias.agrodefesa.base.navigation.NavigationBaseFactory;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Hashtable;

public class Navegacao {

    protected final Logger log = LoggerFactory.getLogger(this.getClass());
    public static final String PASSWORD = "admin";
    private static Hashtable<Class<?>, Object> entities = new Hashtable<>();
    public boolean autentaticado;

    public Navegacao() {
        autentaticado = false;
    }

    public void addEntity(Object entity) {
        entities.put(entity.getClass(), entity);
    }

    public Object getEntity(Class<?> classProxy) {
        return entities.get(classProxy);
    }

    public boolean existEntity(Class<?> classProxy) {
        return (getEntity(classProxy) != null);
    }

    public void pageLoad(Action action, String key) {
        NavegacaoStrategy page = NavigationBaseFactory.createNavigation(key);

        switch (action) {
            case HOME:
                page.home();
                break;
            case INSERT:
                page.insert();
                break;
            case SEARCH:
                page.search();
                break;
            case EDIT:
                page.edit();
                break;
            case CONFIRM:
                page.confirm();
                break;

            default:
                page.others(action);
        }
    }

    private void loginPage() {
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
        } else {
            if (!HomeView.isUserName(nome)) {
                autentaticado = false;
                login(CPF, nome);
            }
        }
    }
}
