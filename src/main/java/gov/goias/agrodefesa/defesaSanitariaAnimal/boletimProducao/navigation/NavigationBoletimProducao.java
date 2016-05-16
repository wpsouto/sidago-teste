package gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.navigation;

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
    public void insert() {
        Propriedade propriedade = (Propriedade) dependencia(Propriedade.class, "@Propriedade");
        getEntity().setPropriedade(propriedade);

        super.insert();
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
