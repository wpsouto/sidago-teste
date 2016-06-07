package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationDependence;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.entity.UnidadeProducao;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.view.UnidadeProducaoViewEdit;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.view.UnidadeProducaoViewHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.view.UnidadeProducaoViewInsert;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.entity.TermoFiscalizacao;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.navigation.NavigationTermoFiscalizacao;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 * *
 */
@Navigation(home = UnidadeProducaoViewHome.class, insert = UnidadeProducaoViewInsert.class, edit = UnidadeProducaoViewEdit.class, entity = UnidadeProducao.class)
@NavigationType(label = "Unidade de Produção", modulo = NavegacaoType.DEFESA_SANITARIA_VEGETAL, url = "unidade-producao")
@NavigationDependence(dependence = NavigationTermoFiscalizacao.class, actions = {Action.HOME, Action.INSERT, Action.MENSAGEM_INSERT, Action.SEARCH})
public class NavigationUnidadeProducao extends NavigationBase {

    public UnidadeProducao getEntity() {
        return (UnidadeProducao) entity;
    }

    @Override
    public void dependency() {
        super.dependency();

        getEntity().setTermoFiscalizacao((TermoFiscalizacao) NavegacaoFactory.getNavigator().getEntity(TermoFiscalizacao.class));
    }

}
