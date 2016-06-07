package gov.goias.agrodefesa.concessaoDeDiarias.assinaturaDeDiarias.navigation;

import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.concessaoDeDiarias.assinaturaDeDiarias.view.AssinaturaDeDiariasViewHome;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.entity.DelegacaoAtividade;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.NavegacaoType;

@Navigation(home = AssinaturaDeDiariasViewHome.class, entity = DelegacaoAtividade.class)
@NavigationType(label = "Assinatura de Diárias", modulo = NavegacaoType.CONCESSAO_DE_DIARIAS, url = "assinar/assinar")
public class NavigationAssinaturaDeDiarias extends NavigationBase {

    @Override
    public void others(Action action) {
        switch(action){
            case MENSAGEM_CONFIRM:
                ((AssinaturaDeDiariasViewHome)  home).aviso();
                break;
            default:
                super.others(action);
        }
    }

}
