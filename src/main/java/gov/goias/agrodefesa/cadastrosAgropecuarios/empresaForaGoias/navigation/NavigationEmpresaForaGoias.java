package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.navigation;

import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.entity.EmpresaForaGoias;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationEmpresaForaGoias extends NavigationBase {

    public NavigationEmpresaForaGoias(NavegacaoType type) {
        super(type);
    }

    public EmpresaForaGoias getEntity() {
        return (EmpresaForaGoias) entity;
    }
}
