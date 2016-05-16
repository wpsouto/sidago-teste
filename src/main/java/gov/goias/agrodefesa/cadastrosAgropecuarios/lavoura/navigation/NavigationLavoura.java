package gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.navigation;

import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.entity.Lavoura;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationLavoura  extends NavigationBase {

    public NavigationLavoura(NavegacaoType type) {
        super(type);
    }

    public Lavoura getEntity() {
        return (Lavoura) entity;
    }
}
