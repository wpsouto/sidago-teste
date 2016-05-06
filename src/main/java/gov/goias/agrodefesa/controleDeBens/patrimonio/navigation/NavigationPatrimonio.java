package gov.goias.agrodefesa.controleDeBens.patrimonio.navigation;

import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.controleDeBens.patrimonio.entity.Patrimonio;
import gov.goias.agrodefesa.utils.NavegacaoType;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class NavigationPatrimonio extends NavigationBase {

    public NavigationPatrimonio(NavegacaoType type) {
        super(type);
    }

    public Patrimonio getEntity() {
        return (Patrimonio) entity;
    }

    @Override
    public void insert() {
        LocalDateTime today = LocalDateTime.now();

        getEntity().setNumeroPatrimonio(String.valueOf(Timestamp.valueOf(today).getTime()));
        super.insert();
    }
}
