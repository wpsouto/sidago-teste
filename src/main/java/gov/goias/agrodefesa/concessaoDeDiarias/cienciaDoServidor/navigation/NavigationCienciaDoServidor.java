package gov.goias.agrodefesa.concessaoDeDiarias.cienciaDoServidor.navigation;

import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.entity.DelegacaoAtividade;
import gov.goias.agrodefesa.utils.NavegacaoType;

public class NavigationCienciaDoServidor extends NavigationBase {

    public NavigationCienciaDoServidor(NavegacaoType type) {
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
}
