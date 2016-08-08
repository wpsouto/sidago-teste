package gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationDependency;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.navigation.NavigationPessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.entity.Propriedade;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.view.PropriedadeViewEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.view.PropriedadeViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.view.PropriedadeViewInsert;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
@Navigation(home = PropriedadeViewHome.class, insert = PropriedadeViewInsert.class, edit = PropriedadeViewEdit.class, entity = Propriedade.class)
@NavigationType(label = "Propriedade", modulo = NavegacaoType.CADASTROS_AGROPECUARIOS, url = "propriedade")
@NavigationDependency(dependence = NavigationPessoa.class, actions = {Action.HOME, Action.INSERT, Action.MENSAGEM_INSERT})
public class NavigationPropriedade extends NavigationBase {

    public Propriedade getEntity() {
        return (Propriedade) entity;
    }

    @Override
    public void dependency() {
        super.dependency();

        getEntity().setPessoa((Pessoa) NavegacaoFactory.getNavigator().getEntity(Pessoa.class));
    }


}
