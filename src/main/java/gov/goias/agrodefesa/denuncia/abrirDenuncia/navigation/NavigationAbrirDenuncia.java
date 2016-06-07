package gov.goias.agrodefesa.denuncia.abrirDenuncia.navigation;

import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.entity.AbrirDenuncia;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.view.AbrirDenunciaViewEdit;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.view.AbrirDenunciaViewHome;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.view.AbrirDenunciaViewInsert;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
@Navigation(home = AbrirDenunciaViewHome.class, insert = AbrirDenunciaViewInsert.class, edit = AbrirDenunciaViewEdit.class, entity = AbrirDenuncia.class)
@NavigationType(label = "Abrir Denúncia", modulo = NavegacaoType.DENUNCIA, url = "abrir-denuncia")
public class NavigationAbrirDenuncia extends NavigationBase {

}
