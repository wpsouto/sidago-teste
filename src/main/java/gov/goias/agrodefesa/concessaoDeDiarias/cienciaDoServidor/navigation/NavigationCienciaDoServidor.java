package gov.goias.agrodefesa.concessaoDeDiarias.cienciaDoServidor.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.concessaoDeDiarias.cienciaDoServidor.view.CienciaDoServidorViewHome;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.navigation.NavigationDelegacaoDeAtividades;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;

public class NavigationCienciaDoServidor implements NavegacaoStrategy {

    private NavigationDelegacaoDeAtividades delegacaoDeAtividades;

    public NavigationCienciaDoServidor() {
        delegacaoDeAtividades = (NavigationDelegacaoDeAtividades) NavegacaoFactory.getNavigator().pageLoad(NavegacaoType.DELEGACAO_DE_ATIVIDADES);
    }

    private void darCiencia() {
        CienciaDoServidorViewHome.isDisplayedCheck();
        CienciaDoServidorViewHome.numero(delegacaoDeAtividades.getNumeroDiaria());
        CienciaDoServidorViewHome.pesquisar();
        CienciaDoServidorViewHome.pesquisarCheck();
        CienciaDoServidorViewHome.darCiencia();
    }

    @Override
    public void home() {
        BrowserDriver.loadPage(NavegacaoType.CIENCIA_DO_SERVIDOR.getUrl());
        CienciaDoServidorViewHome.isDisplayedCheck();

    }

    @Override
    public void insert() {

    }

    @Override
    public void search() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void confirm() {

    }

    @Override
    public void others(Action action) {
        switch(action){
            case CONFIRM:
                darCiencia();
                break;
            case MENSAGEM_CONFIRM:
                CienciaDoServidorViewHome.concordar();
                break;
            default:
                throw Action.actionNotFound(action.name());
        }

    }

}
