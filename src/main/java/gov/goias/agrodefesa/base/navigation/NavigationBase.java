package gov.goias.agrodefesa.base.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.Navigation;
import gov.goias.agrodefesa.base.view.EditView;
import gov.goias.agrodefesa.base.view.HomeView;
import gov.goias.agrodefesa.base.view.InsertView;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;
import gov.goias.agrodefesa.utils.ResourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.Annotation;
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
        this.type = type;

        try {
            initEntity();
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw NavigationBase.error("ERRO AO INSTANCIAR CLASSE BASE", e);
        }

        dependency();
    }

    private void initEntity() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> obj = this.getClass();
        if (obj.isAnnotationPresent(Navigation.class)){
            Annotation annotation = obj.getAnnotation(Navigation.class);
            Navigation navigation = (Navigation) annotation;

            if (!navigation.entity().equals(Navigation.None.class)) {
                this.entity = ResourceFactory.init(navigation.entity());
            }

            this.home = (HomeView) navigation.home().getConstructor(Object.class).newInstance(this.entity);
            //this.home.setEntity(this.entity);

            if (!navigation.insert().equals(Navigation.None.class)) {
                this.insert = (InsertView) navigation.insert().getConstructor(Object.class).newInstance(this.entity);
                //this.insert.setEntity(this.entity);
            }

            if (!navigation.edit().equals(Navigation.None.class)) {
                this.edit = (EditView) navigation.edit().getConstructor(Object.class).newInstance(this.entity);
                //this.edit.setEntity(this.entity);
            }

        }
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
    public void dependency() {
        log.debug("Verificando Dependencias");
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

