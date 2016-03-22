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

    @Override
    public void execAcao(Action action) {
        switch(action){
            case HOME:
                BrowserDriver.loadPage(NavegacaoType.PRESTACAO_DE_CONTAS.getUrl());
                PrestacaoDeContasViewHome.isDisplayedCheck();
                break;
            case OK:
                PrestacaoDeContasViewHome.isDisplayedCheck();
                PrestacaoDeContasViewHome.numero(delegacaoDeAtividades.getNumeroDiaria());
                PrestacaoDeContasViewHome.pesquisar();
                PrestacaoDeContasViewHome.pesquisarCheck();
                PrestacaoDeContasViewHome.prestarContas();
                PrestacaoDeContasViewEdit.isDisplayedCheck();
                PrestacaoDeContasViewEdit.atividade(ATIVIDADES);
                PrestacaoDeContasViewEdit.upload(PrestacaoDeContasViewEdit.class.getClassLoader().getResource("upload.pdf").getFile());
                PrestacaoDeContasViewEdit.salvar();
                break;
            case MENSAGEM_OK:
                PrestacaoDeContasViewEdit.aviso("Registro alterado com sucesso!");
                break;
        }

    }

}
