package gov.goias.agrodefesa.base.navigation;

import cucumber.api.PendingException;
import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.view.EditView;
import gov.goias.agrodefesa.base.view.HomeView;
import gov.goias.agrodefesa.base.view.InsertView;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationBase implements NavegacaoStrategy {

    protected final Logger log = LoggerFactory.getLogger(this.getClass());
    protected Object entity;
    protected NavegacaoType type;
    protected HomeView home;
    protected InsertView insert;
    protected EditView edit;

    public NavigationBase(NavegacaoType type) {
        this.entity = ResourceFactory.init(type.getClassToProxy());
        this.type = type;
        try {
            this.home = (HomeView) type.getHome().getConstructor(Object.class).newInstance(this.entity);
            this.insert = (InsertView) type.getInsert().getConstructor(Object.class).newInstance(this.entity);
            if (type.getEdit() != null) {
                this.edit = (EditView) type.getEdit().getConstructor(Object.class).newInstance(this.entity);
            }
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw NavigationBase.error("ERRO AO INSTANCIAR CLASSE BASE", e);
        }
    }
/*
    public NavigationBase(NavegacaoType type, Class<?> classToProxy, Class<?> home, Class<?> insert, Class<?> edit) {
        this.entity = ResourceFactory.init(classToProxy);
        this.type = type;
        try {
            this.home = (HomeView) home.getConstructor(Object.class).newInstance(this.entity);
            this.insert = (InsertView) insert.getConstructor(Object.class).newInstance(this.entity);
            if (edit != null) {
                this.edit = (EditView) edit.getConstructor(Object.class).newInstance(this.entity);
            }
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw NavigationBase.error("ERRO AO INSTANCIAR CLASSE BASE", e);
        }
    }
*/


    protected Object dependencia(Class entityClass, String tag) {
        Object object = NavegacaoFactory.getNavigator().getEntity(entityClass);

        if (object == null) {
            throw new PendingException(String.format(Constants.MGS_DEPENDENCIA, tag));
        }

        return object;
    }

    private static IllegalArgumentException error(String message, Throwable cause) {
        return new IllegalArgumentException(message, cause);
    }

    @Override
    public void home() {
        BrowserDriver.loadPage(type.getUrl());
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
