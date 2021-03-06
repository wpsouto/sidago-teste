package gov.goias.agrodefesa.controleDeBens.almoxarifado.navigation;

import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.entity.Almoxarifado;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.view.AlmoxarifadoViewEdit;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.view.AlmoxarifadoViewHome;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.view.AlmoxarifadoViewInsert;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 * *
 */
@Navigation(home = AlmoxarifadoViewHome.class, insert = AlmoxarifadoViewInsert.class, edit = AlmoxarifadoViewEdit.class, entity = Almoxarifado.class)
@NavigationType(label = "almoxarifado", modulo = NavegacaoType.CONTROLE_BENS, url = "almoxarifado")
public class NavigationAlmoxarifado extends NavigationBase {

}
