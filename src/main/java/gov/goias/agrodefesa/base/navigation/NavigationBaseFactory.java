package gov.goias.agrodefesa.base.navigation;

import gov.goias.agrodefesa.base.annotation.*;
import gov.goias.agrodefesa.base.view.BaseViewImpl;
import gov.goias.agrodefesa.base.view.EditView;
import gov.goias.agrodefesa.base.view.HomeView;
import gov.goias.agrodefesa.base.view.InsertView;
import gov.goias.agrodefesa.utils.*;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by wemerson on 20/05/16.
 * *
 */
public class NavigationBaseFactory {

    protected static final Logger log = LoggerFactory.getLogger(NavigationBaseFactory.class);
    private static NavegacaoStrategy strategy;

    public static NavegacaoStrategy createNavigation(String label) {
        for (Class<?> base : NavegacaoContext._strategies) {
            if (!base.isAnnotationPresent(Navigation.class)) {
                throw error(base.getName(), Navigation.class.getSimpleName());
            }

            if (!base.isAnnotationPresent(NavigationType.class)) {
                throw error(base.getName(), NavigationType.class.getSimpleName());
            }

            NavigationType navigationType = base.getAnnotation(NavigationType.class);
            if (navigationType.label().equalsIgnoreCase(label)) {
                if (strategy != null && base.equals(strategy.getClass())) {
                    return strategy;
                } else {
                    NavigationBaseFactory.createBase(base);
                    return strategy;
                }
            }
        }

        throw NavigationBaseFactory.error(String.format("ERRO AO INSTANCIAR CLASSE BASE LABEL (%s) não encontrado ", label));
    }

    public static NavegacaoStrategy createNavigation(Class<?> base) {
        return NavigationBaseFactory.createNavigation(base.getAnnotation(NavigationType.class).label());
    }

    private static void createBase(Class<?> base) {
        try {
            Navigation navigation = base.getAnnotation(Navigation.class);
            NavigationType navigationType = base.getAnnotation(NavigationType.class);

            strategy = (NavegacaoStrategy) base.getConstructor().newInstance();

            if (!navigation.entity().equals(Navigation.None.class)) {
                ((NavigationBase) strategy).entity = ResourceFactory.init(navigation.entity());
            }

            if (base.isAnnotationPresent(NavigationDependency.class) || base.isAnnotationPresent(NavigationDependencies.class)) {
                ((NavigationBase) strategy).dependencies = base.getAnnotationsByType(NavigationDependency.class);
                strategy.dependency();
            }

            ((NavigationBase) strategy).url = NavegacaoType.HTTP_BASE + navigationType.modulo() + navigationType.url();

            createHomeView(navigation, ((NavigationBase) strategy));
            createInsertView(navigation, ((NavigationBase) strategy));
            createEditView(navigation, ((NavigationBase) strategy));

        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw NavigationBaseFactory.error(base, e);
        }

    }

/*
    private static void createDependence(Class<?> base){
        if (base.isAnnotationPresent(NavigationDependence.class)) {
            NavigationDependence dependence = base.getAnnotation(NavigationDependence.class);
            Navigation navigation = dependence.dependence().getAnnotation(Navigation.class);
            NavigationType navigationType = dependence.dependence().getAnnotation(NavigationType.class);

            if (!NavegacaoFactory.getNavigator().existEntity(navigation.entity())) {
                log.debug("Executando Dependencia {}", dependence.dependence().getName());
                for (Action action : dependence.actions()) {
                    NavegacaoFactory.getNavigator().pageLoad(action, navigationType.label());
                }
            }

        }
    }
*/

    private static void createHomeView(Navigation navigation, NavigationBase navegacaoBase) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        navegacaoBase.home = (HomeView) navigation.home().getConstructor().newInstance();
        View view = navegacaoBase.home.getClass().getAnnotation(View.class);
        BaseViewImpl baseView = (BaseViewImpl) navegacaoBase.home;
        baseView.entity = navegacaoBase.entity;
        baseView.container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), view.pageContainer());
    }

    private static void createInsertView(Navigation navigation, NavigationBase navegacaoBase) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        if (!navigation.insert().equals(Navigation.None.class)) {
            navegacaoBase.insert = (InsertView) navigation.insert().getConstructor().newInstance();
            View view = navegacaoBase.insert.getClass().getAnnotation(View.class);
            BaseViewImpl baseView = (BaseViewImpl) navegacaoBase.insert;
            baseView.entity = navegacaoBase.entity;
            baseView.container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), view.pageContainer());
        }
    }

    private static void createEditView(Navigation navigation, NavigationBase navegacaoBase) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        if (!navigation.edit().equals(Navigation.None.class)) {
            navegacaoBase.edit = (EditView) navigation.edit().getConstructor().newInstance();
            View view = navegacaoBase.edit.getClass().getAnnotation(View.class);
            BaseViewImpl baseView = (BaseViewImpl) navegacaoBase.edit;
            baseView.entity = navegacaoBase.entity;
            baseView.container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), view.pageContainer());
        }
    }

/*
    private static void createOtherView(NavigationBase navegacaoBase) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        Field[] fields = navegacaoBase.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(ViewExtension.class)) {
                Object teste = Class.forName(field.getClass().getName()).getConstructor().newInstance();
                View view = teste.getClass().getAnnotation(View.class);
                ((BaseViewImpl) teste).container = navegacaoBase.entity;
                ((BaseViewImpl) teste).entity = PageFactory.initElements(BrowserDriver.getCurrentDriver(), view.pageContainer());

                //View view = navegacaoBase.edit.getClass().getAnnotation(View.class);
                //((BaseViewImpl) field).container = null;
                //BaseViewImpl baseView = (BaseViewImpl) field;
                // baseView.entity = navegacaoBase.entity;
                // baseView.container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), view.pageContainer());
            }
        }
    }
*/

    private static IllegalArgumentException error(String message) {
        return new IllegalArgumentException(message);
    }

    private static IllegalArgumentException error(String classe, String anotacao) {
        return new IllegalArgumentException(String.format("ERRO NA CLASSE %s ANOTAÇÃO @%s NÃO ENCONTRADA", classe, anotacao));
    }

    private static IllegalArgumentException error(Class<?> base, Throwable cause) {
        return new IllegalArgumentException(String.format("ERRO AO INSTANCIAR CLASSE BASE %s", base), cause);
    }

}
