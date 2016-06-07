package gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationDependence;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.entity.AquisicaoMudas;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.view.AquisicaoMudasViewAprovacao;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.view.AquisicaoMudasViewHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.view.AquisicaoMudasViewInsert;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.entity.UnidadeProducao;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.navigation.NavigationUnidadeProducao;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
@Navigation(home = AquisicaoMudasViewHome.class, insert = AquisicaoMudasViewInsert.class, entity = AquisicaoMudas.class)
@NavigationType(label = "Autorização para Aquisição de Mudas", modulo = NavegacaoType.DEFESA_SANITARIA_VEGETAL, url = "autorizacao-aquisicao-mudas")
@NavigationDependence(dependence = NavigationUnidadeProducao.class, actions = {Action.HOME, Action.INSERT, Action.MENSAGEM_INSERT})
public class NavigationAquisicaoMudas extends NavigationBase {

    private AquisicaoMudasViewAprovacao viewAprovacao;

    public AquisicaoMudas getEntity() {
        return (AquisicaoMudas) entity;
    }

    @Override
    public void dependency() {
        super.dependency();
        getEntity().setUnidadeProducao((UnidadeProducao) NavegacaoFactory.getNavigator().getEntity(UnidadeProducao.class));

        viewAprovacao = new AquisicaoMudasViewAprovacao(getEntity());
    }

    @Override
    public void others(Action action) {
        switch (action) {
            case APPROVE:
                search();
                ((AquisicaoMudasViewHome) home).aprovacao();
                viewAprovacao.builder();
                break;
            case MENSAGEM_APROVO:
                viewAprovacao.aviso();
                break;
            default:
                super.others(action);
        }

    }

}
