package gov.goias.agrodefesa.concessaoDeDiarias.assinaturaDeDiarias.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.concessaoDeDiarias.assinaturaDeDiarias.view.AssinaturaDeDiariasViewHome;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.navigation.NavigationDelegacaoDeAtividades;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;

public class NavigationAssinaturaDeDiarias implements NavegacaoStrategy {

    private NavigationDelegacaoDeAtividades delegacaoDeAtividades;

    public NavigationAssinaturaDeDiarias() {
        delegacaoDeAtividades = (NavigationDelegacaoDeAtividades) NavegacaoFactory.getNavigator().pageLoad(NavegacaoType.DELEGACAO_DE_ATIVIDADES);
    }

    private void assinar() {
        AssinaturaDeDiariasViewHome.isDisplayedCheck();
        AssinaturaDeDiariasViewHome.numeroDaDiaria(delegacaoDeAtividades.getNumeroDiaria());
        AssinaturaDeDiariasViewHome.pesquisar();
        AssinaturaDeDiariasViewHome.isDisplayedGridPesquisar();
        AssinaturaDeDiariasViewHome.informacoesDetalhadas();
        AssinaturaDeDiariasViewHome.assinar();
    }

    @Override
    public void home() {
        BrowserDriver.loadPage(NavegacaoType.ASSINATURA_DE_DIARIAS.getUrl());
        AssinaturaDeDiariasViewHome.isDisplayedCheck();

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
    public void others(Action action) {
        switch(action){
            case OK:
                assinar();
                break;
            case MENSAGEM_OK:
                AssinaturaDeDiariasViewHome.confirmar();
                break;
            default:
                throw Action.actionNotFound(action.name());
        }

    }

}
