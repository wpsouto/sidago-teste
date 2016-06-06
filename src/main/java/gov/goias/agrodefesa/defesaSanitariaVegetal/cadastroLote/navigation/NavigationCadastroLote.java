package gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.entity.CadastroLote;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.view.CadastroLoteViewEdit;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.view.CadastroLoteViewHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.view.CadastroLoteViewInsert;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.entity.UnidadeConsolidacao;
import gov.goias.agrodefesa.utils.Constants;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
@Navigation(home = CadastroLoteViewHome.class, insert = CadastroLoteViewInsert.class, edit = CadastroLoteViewEdit.class, entity = CadastroLote.class)
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

        if (!NavegacaoFactory.getNavigator().existEntity(UnidadeConsolidacao.class)) {
            log.debug(Constants.MGS_DEPENDENCIA, NavegacaoType.UNIDADE_CONSOLIDACAO.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.HOME, NavegacaoType.UNIDADE_CONSOLIDACAO.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.INSERT, NavegacaoType.UNIDADE_CONSOLIDACAO.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.MENSAGEM_INSERT, NavegacaoType.UNIDADE_CONSOLIDACAO.getKey());
        }

        getEntity().setUnidadeConsolidacao((UnidadeConsolidacao) NavegacaoFactory.getNavigator().getEntity(UnidadeConsolidacao.class));
    }
}
