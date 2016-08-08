package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationDependency;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.navigation.NavigationPessoa;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.entity.UnidadeConsolidacao;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.view.UnidadeConsolidacaoViewEdit;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.view.UnidadeConsolidacaoViewHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.view.UnidadeConsolidacaoViewInsert;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 * *
 */
@Navigation(home = UnidadeConsolidacaoViewHome.class, insert = UnidadeConsolidacaoViewInsert.class, edit = UnidadeConsolidacaoViewEdit.class, entity = UnidadeConsolidacao.class)
@NavigationType(label = "Unidade Consolidação", modulo = NavegacaoType.DEFESA_SANITARIA_VEGETAL, url = "unidade-consolidacao")
@NavigationDependency(dependence = NavigationPessoa.class, actions = {Action.HOME, Action.INSERT, Action.MENSAGEM_INSERT})
public class NavigationUnidadeConsolidacao extends NavigationBase {

    public UnidadeConsolidacao getEntity() {
        return (UnidadeConsolidacao) entity;
    }

    @Override
    public void dependency() {
        super.dependency();

        getEntity().setPessoa((Pessoa) NavegacaoFactory.getNavigator().getEntity(Pessoa.class));
    }
}
