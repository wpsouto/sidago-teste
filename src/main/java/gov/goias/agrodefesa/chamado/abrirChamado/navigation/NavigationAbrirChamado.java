package gov.goias.agrodefesa.chamado.abrirChamado.navigation;

import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.chamado.abrirChamado.entity.Chamado;
import gov.goias.agrodefesa.chamado.abrirChamado.view.AbrirChamadoViewHome;
import gov.goias.agrodefesa.chamado.abrirChamado.view.AbrirChamadoViewInsert;
import gov.goias.agrodefesa.utils.NavegacaoType;

@Navigation(home = AbrirChamadoViewHome.class, insert = AbrirChamadoViewInsert.class, entity = Chamado.class)
@NavigationType(label = "Abrir Chamado", modulo = NavegacaoType.CHAMADO, url = "abrir-chamado")
public class NavigationAbrirChamado extends NavigationBase {

    public Chamado getEntity() {
        return (Chamado) entity;
    }

}
