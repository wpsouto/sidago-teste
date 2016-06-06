package gov.goias.agrodefesa.cadastrosAgropecuarios;

import cucumber.api.java.pt.Quando;
import gov.goias.agrodefesa.base.navigation.NavigationBaseFactory;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.navigation.NavigationEmpresa;

public class EmpresaSteps {

    private NavigationEmpresa empresa = (NavigationEmpresa) NavigationBaseFactory.createNavigation(NavigationEmpresa.class);

    @Quando("^Eu insiro um registro de Empresa com a Classificacao: \"([^\"]*)\" \"([^\"]*)\"$")
    public void Eu_insiro_um_registro_de_Empresa_com_a_Classificacao(String id, String descricao) {
        empresa.inserir(id.trim(), descricao.trim());
    }
}
