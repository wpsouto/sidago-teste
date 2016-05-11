package gov.goias.agrodefesa.controleDeBens.transferencia.navigation;

import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.controleDeBens.patrimonio.entity.Patrimonio;
import gov.goias.agrodefesa.controleDeBens.transferencia.entity.Transferencia;
import gov.goias.agrodefesa.utils.NavegacaoType;

public class NavigationTransferencia extends NavigationBase {

    public NavigationTransferencia(NavegacaoType type) {
        super(type);
    }

    public Transferencia getEntity() {
        return (Transferencia) entity;
    }

    @Override
    public void insert() {
        Patrimonio patrimonio = (Patrimonio) dependencia(Patrimonio.class, "@Patrimonio");
        getEntity().setPatrimonio(patrimonio);

        super.insert();
    }

}
