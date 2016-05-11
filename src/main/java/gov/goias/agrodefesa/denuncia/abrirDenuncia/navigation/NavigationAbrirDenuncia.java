package gov.goias.agrodefesa.denuncia.abrirDenuncia.navigation;

import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.entity.AbrirDenuncia;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationAbrirDenuncia extends NavigationBase {

    public NavigationAbrirDenuncia(NavegacaoType type) {
        super(type);
    }

    public AbrirDenuncia getEntity() {
        return (AbrirDenuncia) entity;
    }

}
