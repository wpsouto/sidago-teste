package gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.navigation;

import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.entity.DelegacaoAtividade;
import gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.view.PrestacaoDeContasViewEdit;
import gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.view.PrestacaoDeContasViewHome;
import gov.goias.agrodefesa.utils.NavegacaoType;

@Navigation(home = PrestacaoDeContasViewHome.class, edit = PrestacaoDeContasViewEdit.class, entity = DelegacaoAtividade.class)
@NavigationType(label = "Prestação de Contas", modulo = NavegacaoType.CONCESSAO_DE_DIARIAS, url = "prestacao")
public class NavigationPrestacaoDeContas extends NavigationBase {


}
