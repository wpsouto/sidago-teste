package gov.goias.agrodefesa.concessaoDeDiarias.cienciaDoServidor.navigation;

import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationDependence;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.concessaoDeDiarias.cienciaDoServidor.view.CienciaDoServidorViewHome;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.entity.DelegacaoAtividade;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.navigation.NavigationDelegacaoDeAtividades;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.NavegacaoType;

@Navigation(home = CienciaDoServidorViewHome.class, entity = DelegacaoAtividade.class)
@NavigationType(label = "Ciência do Servidor", modulo = NavegacaoType.CONCESSAO_DE_DIARIAS, url = "ciencia")
@NavigationDependence(dependence = NavigationDelegacaoDeAtividades.class, actions = {Action.HOME, Action.INSERT, Action.SEARCH})
public class NavigationCienciaDoServidor extends NavigationBase {

/*
    @Override
    public void dependency() {
        super.dependency();
    }
*/
}
