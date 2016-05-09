package gov.goias.agrodefesa.chamado.abrirChamado.navigation;

import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.chamado.abrirChamado.entity.Chamado;
import gov.goias.agrodefesa.utils.NavegacaoType;

public class NavigationAbrirChamado extends NavigationBase {

    public NavigationAbrirChamado(NavegacaoType type) {
        super(type);
    }

    public Chamado getEntity() {
        return (Chamado) entity;
    }

    @Override
    public void insert() {
        log.debug("SITUACAOOO {}   ", getEntity().getSolicitante());
        log.debug("SITUACAOOO {}   ", getEntity().getTipoSuporte());
        super.insert();
    }
}
