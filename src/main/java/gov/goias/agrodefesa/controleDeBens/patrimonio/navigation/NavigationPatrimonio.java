package gov.goias.agrodefesa.controleDeBens.patrimonio.navigation;

import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.controleDeBens.patrimonio.entity.Patrimonio;
import gov.goias.agrodefesa.controleDeBens.patrimonio.view.PatrimonioViewEdit;
import gov.goias.agrodefesa.controleDeBens.patrimonio.view.PatrimonioViewHome;
import gov.goias.agrodefesa.controleDeBens.patrimonio.view.PatrimonioViewInsert;
import gov.goias.agrodefesa.utils.NavegacaoType;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Navigation(home = PatrimonioViewHome.class, insert = PatrimonioViewInsert.class, edit = PatrimonioViewEdit.class, entity = Patrimonio.class)
@NavigationType(label = "patrimonio", modulo = NavegacaoType.CONTROLE_BENS, url = "patrimonio")
public class NavigationPatrimonio extends NavigationBase {

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
