package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.entity.UnidadeProducao;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.entity.TermoFiscalizacao;
import gov.goias.agrodefesa.utils.Constants;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationUnidadeProducao extends NavigationBase {

    public NavigationUnidadeProducao(NavegacaoType type) {
        super(type);
    }

    public UnidadeProducao getEntity() {
        return (UnidadeProducao) entity;
    }

    @Override
    public void dependency() {
        super.dependency();

        if (!NavegacaoFactory.getNavigator().existEntity(TermoFiscalizacao.class)) {
            log.debug(Constants.MGS_DEPENDENCIA, NavegacaoType.TERMO_FISCALIZACAO.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.HOME, NavegacaoType.TERMO_FISCALIZACAO.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.INSERT, NavegacaoType.TERMO_FISCALIZACAO.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.MENSAGEM_INSERT, NavegacaoType.TERMO_FISCALIZACAO.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.SEARCH, NavegacaoType.TERMO_FISCALIZACAO.getKey());
        }

        getEntity().setTermoFiscalizacao((TermoFiscalizacao) NavegacaoFactory.getNavigator().getEntity(TermoFiscalizacao.class));
    }

}
