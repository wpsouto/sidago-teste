package gov.goias.agrodefesa.base.navigation;

import gov.goias.agrodefesa.utils.NavegacaoType;

public class NavigationBaseBuilder {
    private NavegacaoType type;
    private Class<?> classToProxy;
    private Class<?> home;
    private Class<?> insert;
    private Class<?> edit;

    public NavigationBaseBuilder setType(NavegacaoType type) {
        this.type = type;
        return this;
    }

    public NavigationBaseBuilder setClassToProxy(Class<?> classToProxy) {
        this.classToProxy = classToProxy;
        return this;
    }

    public NavigationBaseBuilder setHome(Class<?> home) {
        this.home = home;
        return this;
    }

    public NavigationBaseBuilder setInsert(Class<?> insert) {
        this.insert = insert;
        return this;
    }

    public NavigationBaseBuilder setEdit(Class<?> edit) {
        this.edit = edit;
        return this;
    }

    public NavigationBase createNavigationBase() {
        return new NavigationBase(type, classToProxy, home, insert, edit);
    }
}