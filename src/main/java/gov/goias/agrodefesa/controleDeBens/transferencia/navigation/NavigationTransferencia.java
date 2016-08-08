package gov.goias.agrodefesa.controleDeBens.transferencia.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationDependency;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.controleDeBens.patrimonio.entity.Patrimonio;
import gov.goias.agrodefesa.controleDeBens.patrimonio.navigation.NavigationPatrimonio;
import gov.goias.agrodefesa.controleDeBens.transferencia.entity.Transferencia;
import gov.goias.agrodefesa.controleDeBens.transferencia.view.TransferenciaViewHome;
import gov.goias.agrodefesa.controleDeBens.transferencia.view.TransferenciaViewInsert;
import gov.goias.agrodefesa.utils.NavegacaoType;

@Navigation(home = TransferenciaViewHome.class, insert = TransferenciaViewInsert.class, entity = Transferencia.class)
@NavigationType(label = "transferencia", modulo = NavegacaoType.CONTROLE_BENS, url = "controle-movimentacao")
@NavigationDependency(dependence = NavigationPatrimonio.class, actions = {Action.HOME, Action.INSERT, Action.MENSAGEM_INSERT})
public class NavigationTransferencia extends NavigationBase {

    public Transferencia getEntity() {
        return (Transferencia) entity;
    }

    @Override
    public void dependency() {
        super.dependency();
        getEntity().setPatrimonio((Patrimonio) NavegacaoFactory.getNavigator().getEntity(Patrimonio.class));
    }
}
