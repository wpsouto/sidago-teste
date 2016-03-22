package gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.navigation;

import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.view.PessoaViewEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.view.PessoaViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.view.PessoaViewInsert;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.CNPJGenerator;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationPessoa implements NavegacaoStrategy {

    private String cnpj;
    private static final String NOME = "Teste Automatizado";
    private static final String TIPO_ENDERECO = "Pessoal";
    private static final String ALTERAR = "-ALTERADO";


    public NavigationPessoa() {
        this.cnpj = CNPJGenerator.cnpj();
    }

    @Override
    public void execAcao(Action action) {
        switch(action){
            case HOME:
                BrowserDriver.loadPage(NavegacaoType.PESSOA.getUrl());
                PessoaViewHome.isDisplayedCheck();
                break;
            case INSERT:
                PessoaViewHome.incluirRegistro();
                PessoaViewInsert.isDisplayedCheck();
                PessoaViewInsert.cpfCnpj(getCnpj());
                PessoaViewInsert.pesquisar();
                PessoaViewInsert.nomeEmpresa(NOME);
                PessoaViewInsert.nomeFantasia(NOME);
                PessoaViewInsert.adicionarEndereco(TIPO_ENDERECO);
                BrowserDriver.screenshot();
                PessoaViewInsert.salvar();
                break;
            case SEARCH:
                PessoaViewHome.isDisplayedCheck();
                PessoaViewHome.cpfCnpj(this.getCnpj());
                PessoaViewHome.pesquisar();
                PessoaViewHome.isDisplayedGridPesquisar();
                break;
            case EDIT:
                execAcao(Action.SEARCH);
                PessoaViewHome.alterar();
                PessoaViewEdit.isDisplayedCheck();
                PessoaViewEdit.salvar();
                break;
            case MENSAGEM_INSERT:
                PessoaViewInsert.aviso("Registro inserido com sucesso!");
                break;
            case MENSAGEM_EDIT:
                PessoaViewEdit.aviso("Registro alterado com sucesso!");
                break;
        }

    }

    public String getCnpj() {
        return cnpj;
    }
}
