package gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationDependency;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.entity.CadastroLote;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.view.CadastroLoteViewEdit;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.view.CadastroLoteViewHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.view.CadastroLoteViewInsert;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.entity.UnidadeConsolidacao;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.navigation.NavigationUnidadeConsolidacao;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
@Navigation(home = CadastroLoteViewHome.class, insert = CadastroLoteViewInsert.class, edit = CadastroLoteViewEdit.class, entity = CadastroLote.class)
@NavigationType(label = "Cadastro de Lote", modulo = NavegacaoType.DEFESA_SANITARIA_VEGETAL, url = "lote")
@NavigationDependency(dependence = NavigationUnidadeConsolidacao.class, actions = {Action.HOME, Action.INSERT, Action.MENSAGEM_INSERT})
public class NavigationCadastroLote extends NavigationBase {

    public CadastroLote getEntity() {
        return (CadastroLote) entity;
    }

    @Override
    public void dependency() {
        super.dependency();
        getEntity().setUnidadeConsolidacao((UnidadeConsolidacao) NavegacaoFactory.getNavigator().getEntity(UnidadeConsolidacao.class));
    }
}
