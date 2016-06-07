package gov.goias.agrodefesa.base.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.view.EditView;
import gov.goias.agrodefesa.base.view.HomeView;
import gov.goias.agrodefesa.base.view.InsertView;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by usuario on 10/03/16.
 * *
 */
public class NavigationBase implements NavegacaoStrategy {

    protected final Logger log = LoggerFactory.getLogger(this.getClass());
    public Object entity;
    public HomeView home;
    public InsertView insert;
    public EditView edit;
    public String url;
    public Class<?> dependencia;
    public Action[] actions;

    @Override
    public void home() {
        BrowserDriver.loadPage(this.url);
        home.isDisplayedCheck();
    }

    @Override
    public void insert() {
        home.incluir();
        insert.builder();
    }

    @Override
    public void search() {
        home();
        home.pesquisar();
    }

    @Override
    public void edit() {
        search();
        home.alterar();
        edit.builder();
    }

    @Override
    public void confirm() {
        search();
        home.confirm();
    }

    @Override
    public void dependency() {
        Navigation navigation = dependencia.getAnnotation(Navigation.class);
        NavigationType navigationType = dependencia.getAnnotation(NavigationType.class);

        if (!NavegacaoFactory.getNavigator().existEntity(navigation.entity())) {
            log.debug("Executando Dependencia {}", dependencia.getName());
            for (Action action : this.actions) {
                NavegacaoFactory.getNavigator().pageLoad(action, navigationType.label());
            }
        }
    }

    @Override
    public void others(Action action) {
        switch (action) {
            case MENSAGEM_INSERT:
                insert.aviso();
                NavegacaoFactory.getNavigator().addEntity(entity);
                break;
            case MENSAGEM_EDIT:
                edit.aviso();
                break;
            default:
                throw Action.actionNotFound(action.name());

        }

    }

}

