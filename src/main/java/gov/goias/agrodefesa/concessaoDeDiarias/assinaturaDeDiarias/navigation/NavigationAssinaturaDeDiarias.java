package gov.goias.agrodefesa.concessaoDeDiarias.assinaturaDeDiarias.navigation;

import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.concessaoDeDiarias.assinaturaDeDiarias.view.AssinaturaDeDiariasViewHome;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.entity.DelegacaoAtividade;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.NavegacaoType;

public class NavigationAssinaturaDeDiarias extends NavigationBase {

    public NavigationAssinaturaDeDiarias(NavegacaoType type) {
        super(type);
    }

    public DelegacaoAtividade getEntity() {
        return (DelegacaoAtividade) entity;
    }

    @Override
    public void confirm() {
        DelegacaoAtividade delegacaoAtividade = (DelegacaoAtividade) dependencia(DelegacaoAtividade.class, "@DelegacaoDeAtividade");
        getEntity().setNumeroDiaria(delegacaoAtividade.getNumeroDiaria());
        super.confirm();
    }

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
