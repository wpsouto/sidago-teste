package gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationDependency;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.entity.Propriedade;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.navigation.NavigationPropriedade;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.entity.BoletimProducao;
import gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.view.BoletimProducaoViewHome;
import gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.view.BoletimProducaoViewInsert;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 * *
 */

@Navigation(home = BoletimProducaoViewHome.class, insert = BoletimProducaoViewInsert.class, entity = BoletimProducao.class)
@NavigationType(label = "Boletim de Produção", modulo = NavegacaoType.DEFESA_SANITARIA_ANIMAL, url = "boletim-producao")
@NavigationDependency(dependence = NavigationPropriedade.class, actions = {Action.HOME, Action.INSERT, Action.MENSAGEM_INSERT})
public class NavigationBoletimProducao extends NavigationBase {

    public BoletimProducao getEntity() {
        return (BoletimProducao) entity;
    }

    @Override
    public void dependency() {
        super.dependency();

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
