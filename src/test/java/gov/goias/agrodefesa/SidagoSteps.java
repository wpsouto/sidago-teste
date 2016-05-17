package gov.goias.agrodefesa;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.constants.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SidagoSteps {
    protected final Logger log = LoggerFactory.getLogger(this.getClass());

	@Dado("^Eu faco login no sistema com o CPF \"([^\"]*)\" USUARIO \"([^\"]*)\" tela inicial \"([^\"]*)\"$")
	public void Eu_faco_login_no_sistema_com_o_CPF_USUARIO(String CPF, String usuario, String pageString) {
		NavegacaoFactory.getNavigator().login(CPF, usuario);
        NavegacaoFactory.getNavigator().pageLoad(Action.HOME, pageString);
	}

    @Então("^Eu recebo a mensagem \"([^\"]*)\" do \"([^\"]*)\"$")
    public void Eu_recebo_a_mensagem_do(String actionString, String pageString) {
        NavegacaoFactory.getNavigator().pageLoad(Action.actionForName(actionString), pageString);
    }

    @Quando("^Eu \"([^\"]*)\" um registro de \"([^\"]*)\"$")
    public void Eu_um_novo_registro_de(String actionString, String pageString) {
        NavegacaoFactory.getNavigator().pageLoad(Action.actionForName(actionString), pageString);
    }

}
