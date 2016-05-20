package gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.Navigation;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.entity.Propriedade;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.entity.TermoFiscalizacao;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.view.TermoFiscalizacaoViewHome;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.view.TermoFiscalizacaoViewInsert;
import gov.goias.agrodefesa.utils.Constants;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
@Navigation(home = TermoFiscalizacaoViewHome.class, insert = TermoFiscalizacaoViewInsert.class, entity = TermoFiscalizacao.class)
public class NavigationTermoFiscalizacao extends NavigationBase {

    public NavigationTermoFiscalizacao(NavegacaoType type) {
        super(type);
    }

    public TermoFiscalizacao getEntity() {
        return (TermoFiscalizacao) entity;
    }

    @Override
    public void dependency() {
        super.dependency();

        if (!NavegacaoFactory.getNavigator().existEntity(Propriedade.class)) {
            log.debug(Constants.MGS_DEPENDENCIA, NavegacaoType.PROPRIEDADE.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.HOME, NavegacaoType.PROPRIEDADE.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.INSERT, NavegacaoType.PROPRIEDADE.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.MENSAGEM_INSERT, NavegacaoType.PROPRIEDADE.getKey());
        }

        getEntity().setPropriedade((Propriedade) NavegacaoFactory.getNavigator().getEntity(Propriedade.class));
    }
}
