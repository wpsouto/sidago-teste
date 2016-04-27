package gov.goias.agrodefesa.base.navigation;

import gov.goias.agrodefesa.base.view.EditView;
import gov.goias.agrodefesa.base.view.HomeView;
import gov.goias.agrodefesa.base.view.InsertView;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public abstract class NavigationBase implements NavegacaoStrategy {

    protected NavegacaoType type;
    protected HomeView home;
    protected InsertView insert;
    protected EditView edit;

    public NavigationBase(NavegacaoType type) {
        this.type = type;
    }

    @Override
    public void home() {
        BrowserDriver.loadPage(type.getUrl());
        home.isDisplayedCheck();
    }

    @Override
    public void insert(){
        home.incluir();
        insert.builder();

    }

    @Override
    public void search(){
        home.pesquisar();
    }

    @Override
    public void edit(){
        search();
        home.alterar();
        edit.builder();
    }

    @Override
    public void others(Action action){
        switch(action){
            case MENSAGEM_INSERT:
                insert.aviso();
                break;
            case MENSAGEM_EDIT:
                edit.aviso();
                break;
            default:
                throw Action.actionNotFound(action.name());

        }

    }

}
