package gov.goias.agrodefesa.chamado.abrirChamado.navigation;

import gov.goias.agrodefesa.base.Navigation;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.chamado.abrirChamado.entity.Chamado;
import gov.goias.agrodefesa.chamado.abrirChamado.view.AbrirChamadoViewHome;
import gov.goias.agrodefesa.chamado.abrirChamado.view.AbrirChamadoViewInsert;
import gov.goias.agrodefesa.utils.NavegacaoType;

@Navigation(home = AbrirChamadoViewHome.class, insert = AbrirChamadoViewInsert.class, entity = Chamado.class)
public class NavigationAbrirChamado extends NavigationBase {

    public NavigationAbrirChamado(NavegacaoType type) {
        super(type);
    }

    public Chamado getEntity() {
        return (Chamado) entity;
    }

}
