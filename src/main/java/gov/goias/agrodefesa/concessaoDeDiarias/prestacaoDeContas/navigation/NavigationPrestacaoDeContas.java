package gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.navigation.NavigationDelegacaoDeAtividades;
import gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.view.PrestacaoDeContasViewEdit;
import gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.view.PrestacaoDeContasViewHome;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;

public class NavigationPrestacaoDeContas implements NavegacaoStrategy {

    private static final String ATIVIDADES = "Teste Automatizado";

    private NavigationDelegacaoDeAtividades delegacaoDeAtividades;

    public NavigationPrestacaoDeContas() {
        delegacaoDeAtividades = (NavigationDelegacaoDeAtividades) NavegacaoFactory.getNavigator().pageLoad(NavegacaoType.DELEGACAO_DE_ATIVIDADES);
    }

    private void prestarContas() {
        PrestacaoDeContasViewHome.isDisplayedCheck();
        PrestacaoDeContasViewHome.numero(delegacaoDeAtividades.getNumeroDiaria());
        PrestacaoDeContasViewHome.pesquisar();
        PrestacaoDeContasViewHome.pesquisarCheck();
        PrestacaoDeContasViewHome.prestarContas();
        PrestacaoDeContasViewEdit.isDisplayedCheck();
        PrestacaoDeContasViewEdit.atividade(ATIVIDADES);
        PrestacaoDeContasViewEdit.upload(PrestacaoDeContasViewEdit.class.getClassLoader().getResource("upload.pdf").getFile());
        PrestacaoDeContasViewEdit.salvar();
    }

    @Override
    public void home() {
        BrowserDriver.loadPage(NavegacaoType.PRESTACAO_DE_CONTAS.getUrl());
        PrestacaoDeContasViewHome.isDisplayedCheck();

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
                prestarContas();
                break;
            case MENSAGEM_OK:
                PrestacaoDeContasViewEdit.aviso("Registro alterado com sucesso!");
                break;
            default:
                throw Action.actionNotFound(action.name());
        }

    }

}
