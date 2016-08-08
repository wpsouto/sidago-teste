package gov.goias.agrodefesa.financeiro.dare.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationDependency;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.navigation.NavigationPessoa;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.financeiro.dare.entity.Dare;
import gov.goias.agrodefesa.financeiro.dare.view.DareViewHome;
import gov.goias.agrodefesa.financeiro.dare.view.DareViewInsert;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 * *
 */
@Navigation(home = DareViewHome.class, insert = DareViewInsert.class, entity = Dare.class)
@NavigationType(label = "DARE", modulo = NavegacaoType.FINANCEIRO, url = "dare")
@NavigationDependency(dependence = NavigationPessoa.class, actions = {Action.HOME, Action.INSERT, Action.MENSAGEM_INSERT})
public class NavigationDare extends NavigationBase {

    public Dare getEntity() {
        return (Dare) entity;
    }

    @Override
    public void dependency() {
        super.dependency();
        getEntity().setPessoa((Pessoa) NavegacaoFactory.getNavigator().getEntity(Pessoa.class));
    }

}
