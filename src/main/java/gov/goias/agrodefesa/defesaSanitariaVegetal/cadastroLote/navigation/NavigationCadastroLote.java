package gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.entity.CadastroLote;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.entity.UnidadeConsolidacao;
import gov.goias.agrodefesa.utils.Constants;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationCadastroLote extends NavigationBase {

    public NavigationCadastroLote(NavegacaoType type) {
        super(type);
    }

    public CadastroLote getEntity() {
        return (CadastroLote) entity;
    }

    @Override
    public void dependency() {
        super.dependency();
        log.debug(Constants.MGS_DEPENDENCIA, NavegacaoType.UNIDADE_CONSOLIDACAO.getKey());

        if (!NavegacaoFactory.getNavigator().existEntity(UnidadeConsolidacao.class)) {
            NavegacaoFactory.getNavigator().pageLoad(Action.HOME, NavegacaoType.UNIDADE_CONSOLIDACAO.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.INSERT, NavegacaoType.UNIDADE_CONSOLIDACAO.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.MENSAGEM_INSERT, NavegacaoType.UNIDADE_CONSOLIDACAO.getKey());
        }

        getEntity().setUnidadeConsolidacao((UnidadeConsolidacao) NavegacaoFactory.getNavigator().getEntity(UnidadeConsolidacao.class));
    }
}
