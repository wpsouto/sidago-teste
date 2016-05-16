package gov.goias.agrodefesa.cadastrosAgropecuarios;

import cucumber.api.java.pt.Quando;
import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.navigation.NavigationEmpresa;
import gov.goias.agrodefesa.utils.NavegacaoType;

public class EmpresaSteps {

    @Quando("^Eu insiro um registro de Empresa com a Classificacao: \"([^\"]*)\" \"([^\"]*)\"$")
    public void Eu_insiro_um_registro_de_Empresa_com_a_Classificacao(String id, String descricao) {
        NavigationEmpresa navigationEmpresa = (NavigationEmpresa) NavegacaoFactory.getNavigator().pageLoad(NavegacaoType.EMPRESA);
        navigationEmpresa.inserir(id.trim(), descricao.trim());
    }
}
