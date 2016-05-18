package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.entity.UnidadeConsolidacao;
import gov.goias.agrodefesa.utils.Constants;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationUnidadeConsolidacao extends NavigationBase {

    public NavigationUnidadeConsolidacao(NavegacaoType type) {
        super(type);
    }

    public UnidadeConsolidacao getEntity() {
        return (UnidadeConsolidacao) entity;
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
