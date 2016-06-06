package gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.entity.AquisicaoMudas;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.view.AquisicaoMudasViewAprovacao;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.view.AquisicaoMudasViewHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.view.AquisicaoMudasViewInsert;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.entity.UnidadeProducao;
import gov.goias.agrodefesa.utils.Constants;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
@Navigation(home = AquisicaoMudasViewHome.class, insert = AquisicaoMudasViewInsert.class, entity = AquisicaoMudas.class)
public class NavigationAquisicaoMudas extends NavigationBase {

    private AquisicaoMudasViewAprovacao viewAprovacao;

    public NavigationAquisicaoMudas(NavegacaoType type) {
        super(type);
        viewAprovacao = new AquisicaoMudasViewAprovacao(getEntity());
    }

    public AquisicaoMudas getEntity() {
        return (AquisicaoMudas) entity;
    }


    @Override
    public void dependency() {
        super.dependency();

        if (!NavegacaoFactory.getNavigator().existEntity(UnidadeProducao.class)) {
            log.debug(Constants.MGS_DEPENDENCIA, NavegacaoType.UNIDADE_PRODUCAO.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.HOME, NavegacaoType.UNIDADE_PRODUCAO.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.INSERT, NavegacaoType.UNIDADE_PRODUCAO.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.MENSAGEM_INSERT, NavegacaoType.UNIDADE_PRODUCAO.getKey());
        }

        getEntity().setUnidadeProducao((UnidadeProducao) NavegacaoFactory.getNavigator().getEntity(UnidadeProducao.class));
    }

    @Override
    public void others(Action action) {
        switch(action){
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
