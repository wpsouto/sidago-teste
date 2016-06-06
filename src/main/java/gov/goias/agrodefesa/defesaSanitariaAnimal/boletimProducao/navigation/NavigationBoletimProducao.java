package gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.entity.Propriedade;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.entity.BoletimProducao;
import gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.view.BoletimProducaoViewHome;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationBoletimProducao extends NavigationBase {

    public NavigationBoletimProducao(NavegacaoType type) {
        super(type);
    }

    public BoletimProducao getEntity() {
        return (BoletimProducao) entity;
    }


    @Override
    public void dependency() {
        super.dependency();
/*
        log.debug(Constants.MGS_DEPENDENCIA, NavegacaoType.PROPRIEDADE.getKey());

        if (!NavegacaoFactory.getNavigator().existEntity(Propriedade.class)) {
            NavegacaoFactory.getNavigator().pageLoad(Action.HOME, NavegacaoType.PROPRIEDADE.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.INSERT, NavegacaoType.PROPRIEDADE.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.MENSAGEM_INSERT, NavegacaoType.PROPRIEDADE.getKey());
        }
*/

        getEntity().setPropriedade((Propriedade) NavegacaoFactory.getNavigator().getEntity(Propriedade.class));
    }

    @Override
    public void others(Action action) {
        switch (action) {
            case CANCEL:
                ((BoletimProducaoViewHome) home).cancelar();
                break;
            case MENSAGEM_CANCEL:
                ((BoletimProducaoViewHome) home).aviso();
                break;
            default:
                super.others(action);
        }

    }

}
