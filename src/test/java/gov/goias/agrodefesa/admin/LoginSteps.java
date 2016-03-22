package gov.goias.agrodefesa.admin;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

import java.util.logging.Logger;

public class LoginSteps {
	private static final Logger LOGGER = Logger.getLogger(LoginSteps.class.getName());

/*
	@Dado("^Navego para a aplicação SIDAGO$")
	public void dado_navego_para_a_aplicacao_sidago(){
		LOGGER.info("Entrando: Navego para a aplicação SIDAGO");
		NavigationFactory.getNavigator().loginPage();
	}

	@Quando("^Eu tento fazer o login com Login '(.+)' Senha '(.+)'$")
	public void quando_tento_fazer_o_login(String login, String senha){
		LOGGER.info("Entrando: Eu tento fazer o login com Login(CPF/CNPJ) " + login + " Senha "+ senha);
		NavigationFactory.getNavigator().autenticar(login, senha);
	}
*/

	@Dado("^Navego para a aplicação SIDAGO$")
	public void Navego_para_a_aplicação_SIDAGO() throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@Quando("^Eu tento fazer o login com Login '(.+)' Senha '(.+)'$")
	public void Eu_tento_fazer_o_login_com_Login_login_Senha_senha_(String login, String senha) throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@Então("^Eu deveria estar logado como '(.+)'$")
	public void Eu_deveria_estar_logado_como_nome_(String nome) throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@Então("^Eu saio do sistema$")
	public void Eu_saio_do_sistema() throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

	@Dado("^Eu faco login no sistema com o CPF \"([^\"]*)\" USUARIO \"([^\"]*)\"$")
	public void Eu_faco_login_no_sistema_com_o_CPF_USUARIO(String CPF, String usuario) {
		LOGGER.info("Entrando: Login no sistema");
		NavegacaoFactory.getNavigator().login(CPF, usuario);
	}

}
