package gov.goias.agrodefesa.cadastrosAgropecuarios;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Quando;
import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.Classificacao;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.navigation.NavigationEmpresa;
import gov.goias.agrodefesa.utils.NavegacaoType;

import java.util.logging.Logger;

public class EmpresaSteps {

    private static final Logger LOGGER = Logger.getLogger(EmpresaSteps.class.getName());

    @Quando("^Eu altero a a Classificao da Empresa para: \"([^\"]*)\" \"([^\"]*)\"$")
    public void Eu_altero_a_a_Classificao_da_Empresa_para(String id, String descricao) {
        NavigationEmpresa empresa = (NavigationEmpresa) NavegacaoFactory.getNavigator().pageLoad(NavegacaoType.EMPRESA);
        empresa.alterar(id.trim(), descricao.trim());
    }

    @Quando("^Eu aprovo um registro de Empresa$")
    public void Eu_aprovo_um_registro_de_Empresa() {
        NavigationEmpresa empresa = (NavigationEmpresa) NavegacaoFactory.getNavigator().pageLoad(NavegacaoType.EMPRESA);
        empresa.aprovar();
    }

/*
    @Quando("^Eu insiro um registro de Empresa com a Classificacao: \"([^\"]*)\" \"([^\"]*)\"$")
    public void Eu_insiro_um_registro_de_Empresa_com_a_Classificacao(String id, String descricao) {
        NavigationEmpresa empresa = (NavigationEmpresa) NavegacaoFactory.getNavigator().pageLoad(NavegacaoType.EMPRESA);
        empresa.inserir(id.trim(), descricao.trim());
    }
*/
}
