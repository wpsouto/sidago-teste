package gov.goias.agrodefesa.controleDeBens.transferencia.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.Navigation;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.controleDeBens.patrimonio.entity.Patrimonio;
import gov.goias.agrodefesa.controleDeBens.transferencia.entity.Transferencia;
import gov.goias.agrodefesa.controleDeBens.transferencia.view.TransferenciaViewHome;
import gov.goias.agrodefesa.controleDeBens.transferencia.view.TransferenciaViewInsert;
import gov.goias.agrodefesa.utils.Constants;
import gov.goias.agrodefesa.utils.NavegacaoType;

@Navigation(home = TransferenciaViewHome.class, insert = TransferenciaViewInsert.class, entity = Transferencia.class)
public class NavigationTransferencia extends NavigationBase {

    public NavigationTransferencia(NavegacaoType type) {
        super(type);
    }

    public Transferencia getEntity() {
        return (Transferencia) entity;
    }

    @Override
    public void dependency() {
        super.dependency();

        if (!NavegacaoFactory.getNavigator().existEntity(Patrimonio.class)) {
            log.debug(Constants.MGS_DEPENDENCIA, NavegacaoType.PATRIMONIO.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.HOME, NavegacaoType.PATRIMONIO.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.INSERT, NavegacaoType.PATRIMONIO.getKey());
            NavegacaoFactory.getNavigator().pageLoad(Action.MENSAGEM_INSERT, NavegacaoType.PATRIMONIO.getKey());
        }

        getEntity().setPatrimonio((Patrimonio) NavegacaoFactory.getNavigator().getEntity(Patrimonio.class));
    }
}
