package gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationDependency;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.entity.Propriedade;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.navigation.NavigationPropriedade;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.entity.TermoFiscalizacao;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.view.TermoFiscalizacaoViewHome;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.view.TermoFiscalizacaoViewInsert;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 * *
 */
@Navigation(home = TermoFiscalizacaoViewHome.class, insert = TermoFiscalizacaoViewInsert.class, entity = TermoFiscalizacao.class)
@NavigationType(label = "Termo de Fiscalização", modulo = NavegacaoType.FISCALIZACAO, url = "termo-fiscalizacao")
@NavigationDependency(dependence = NavigationPropriedade.class, actions = {Action.HOME, Action.INSERT, Action.MENSAGEM_INSERT})
public class NavigationTermoFiscalizacao extends NavigationBase {

    public TermoFiscalizacao getEntity() {
        return (TermoFiscalizacao) entity;
    }

    @Override
    public void dependency() {
        super.dependency();

        getEntity().setPropriedade((Propriedade) NavegacaoFactory.getNavigator().getEntity(Propriedade.class));
    }
}
