package gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.navigation;

import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.entity.Lavoura;
import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.view.LavouraViewEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.view.LavouraViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.view.LavouraViewInsert;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
@Navigation(home = LavouraViewHome.class, insert = LavouraViewInsert.class, edit = LavouraViewEdit.class, entity = Lavoura.class)
public class NavigationLavoura  extends NavigationBase {

    public NavigationLavoura(NavegacaoType type) {
        super(type);
    }

    public Lavoura getEntity() {
        return (Lavoura) entity;
    }
}
