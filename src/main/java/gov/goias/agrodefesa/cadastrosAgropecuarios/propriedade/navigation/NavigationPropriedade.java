package gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.Navigation;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.entity.Propriedade;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.view.PropriedadeViewEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.view.PropriedadeViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.view.PropriedadeViewInsert;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.Constants;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
@Navigation(home = PropriedadeViewHome.class, insert = PropriedadeViewInsert.class, edit = PropriedadeViewEdit.class, entity = Propriedade.class)
public class NavigationPropriedade extends NavigationBase {

    public NavigationPropriedade(NavegacaoType type) {
        super(type);
    }

    public Propriedade getEntity() {
        return (Propriedade) entity;
    }

    @Override
    public void dependency() {
        super.dependency();

        if (!NavegacaoFactory.getNavigator().existEntity(Pessoa.class)) {
            log.debug(Constants.MGS_DEPENDENCIA, NavegacaoType.PESSOA.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.HOME, NavegacaoType.PESSOA.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.INSERT, NavegacaoType.PESSOA.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.MENSAGEM_INSERT, NavegacaoType.PESSOA.getKey());
        }

        getEntity().setPessoa((Pessoa) NavegacaoFactory.getNavigator().getEntity(Pessoa.class));
    }


}
