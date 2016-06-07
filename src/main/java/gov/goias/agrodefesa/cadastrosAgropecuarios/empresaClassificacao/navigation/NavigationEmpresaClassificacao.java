package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.navigation;

import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.entity.Classificacao;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.view.EmpresaClassificacaoViewEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.view.EmpresaClassificacaoViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.view.EmpresaClassificacaoViewInsert;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
@Navigation(home = EmpresaClassificacaoViewHome.class, insert = EmpresaClassificacaoViewInsert.class, edit = EmpresaClassificacaoViewEdit.class, entity = Classificacao.class)
@NavigationType(label = "Empresa Classificação", modulo = NavegacaoType.CADASTROS_AGROPECUARIOS, url = "classificacao")
public class NavigationEmpresaClassificacao extends NavigationBase {

}
