package gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.navigation;

import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.view.PessoaViewEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.view.PessoaViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.view.PessoaViewInsert;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.*;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationPessoa implements NavegacaoStrategy {

    private Pessoa pessoa;

    public NavigationPessoa() {
        pessoa = ResourceFactory.load(Pessoa.class);
    }

    @Override
    public void execAcao(Action action) {
        switch(action){
            case HOME:
                BrowserDriver.loadPage(NavegacaoType.PESSOA.getUrl());
                PessoaViewHome.isDisplayedCheck();
                break;
            case INSERT:
                pessoa.setCpfCnpj(Generator.cnpj());

                PessoaViewHome.incluirRegistro();
                PessoaViewInsert.isDisplayedCheck();
                PessoaViewInsert.cpfCnpj(pessoa.getCpfCnpj());
                PessoaViewInsert.pesquisar();
                PessoaViewInsert.nomeEmpresa(pessoa.getPessoaJuridica().getNomeEmpresa());
                PessoaViewInsert.nomeFantasia(pessoa.getPessoaJuridica().getNomeFantasia());
                PessoaViewInsert.adicionarEndereco(pessoa.getPessoaJuridica().getEndereco().getTipoEndereco());
                BrowserDriver.screenshot();
                PessoaViewInsert.salvar();
                break;
            case SEARCH:
                PessoaViewHome.isDisplayedCheck();
                PessoaViewHome.cpfCnpj(pessoa.getCpfCnpj());
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

    public Pessoa getPessoa() {
        return pessoa;
    }

}
