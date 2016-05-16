package gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.navigation;

import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.entity.DelegacaoAtividade;
import gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.containers.PrestacaoDeContasPageContainerHome;
import gov.goias.agrodefesa.utils.NavegacaoType;

public class NavigationPrestacaoDeContas extends NavigationBase {

    public NavigationPrestacaoDeContas(NavegacaoType type) {
        super(type);
    }

    private DelegacaoAtividade getEntity() {
        return (DelegacaoAtividade) entity;
    }

    @Override
    public void edit() {
        DelegacaoAtividade delegacaoAtividade = (DelegacaoAtividade) dependencia(DelegacaoAtividade.class, "@DelegacaoDeAtividade");
        getEntity().setNumeroDiaria(delegacaoAtividade.getNumeroDiaria());

        super.edit();
    }
}
