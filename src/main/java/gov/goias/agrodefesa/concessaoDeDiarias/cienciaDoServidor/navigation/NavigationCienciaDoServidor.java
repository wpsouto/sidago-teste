package gov.goias.agrodefesa.concessaoDeDiarias.cienciaDoServidor.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.Navigation;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.concessaoDeDiarias.cienciaDoServidor.view.CienciaDoServidorViewHome;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.entity.DelegacaoAtividade;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.Constants;
import gov.goias.agrodefesa.utils.NavegacaoType;

@Navigation(home = CienciaDoServidorViewHome.class, entity = DelegacaoAtividade.class)
public class NavigationCienciaDoServidor extends NavigationBase {

    public NavigationCienciaDoServidor(NavegacaoType type) {
        super(type);
    }

    public DelegacaoAtividade getEntity() {
        return (DelegacaoAtividade) entity;
    }

    @Override
    public void dependency() {
        super.dependency();
        log.debug(Constants.MGS_DEPENDENCIA, NavegacaoType.DELEGACAO_DE_ATIVIDADES.getKey());

        if (!NavegacaoFactory.getNavigator().existEntity(DelegacaoAtividade.class)) {
            NavegacaoFactory.getNavigator().pageLoad(Action.HOME, NavegacaoType.DELEGACAO_DE_ATIVIDADES.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.INSERT, NavegacaoType.DELEGACAO_DE_ATIVIDADES.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.MENSAGEM_INSERT, NavegacaoType.DELEGACAO_DE_ATIVIDADES.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.SEARCH, NavegacaoType.DELEGACAO_DE_ATIVIDADES.getKey());
        }
    }
}
