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
        pessoa = ResourceFactory.init(Pessoa.class);
    }

    @Override
    public void home() {
        BrowserDriver.loadPage(NavegacaoType.PESSOA.getUrl());
        PessoaViewHome.isDisplayedCheck();
    }

    @Override
    public void insert() {
        pessoa.setCpfCnpj(Generator.cnpj());

        PessoaViewHome.incluirRegistro();
        PessoaViewInsert.isDisplayedCheck();
        PessoaViewInsert.cpfCnpj(pessoa.getCpfCnpj());
        PessoaViewInsert.pesquisar();
        PessoaViewInsert.nomeEmpresa(pessoa.getPessoaJuridica().getNomeEmpresa());
        PessoaViewInsert.nomeFantasia(pessoa.getPessoaJuridica().getNomeFantasia());
        PessoaViewInsert.adicionarEndereco(pessoa.getPessoaJuridica().getEndereco());
        BrowserDriver.screenshot();
        PessoaViewInsert.salvar();

    }

    @Override
    public void search() {
        PessoaViewHome.isDisplayedCheck();
        PessoaViewHome.cpfCnpj(pessoa.getCpfCnpj());
        PessoaViewHome.pesquisar();
        PessoaViewHome.isDisplayedGridPesquisar();
    }

    @Override
    public void edit() {
        search();
        PessoaViewHome.alterar();
        PessoaViewEdit.isDisplayedCheck();
        PessoaViewEdit.salvar();

    }

    @Override
    public void others(Action action) {
        switch(action){
            case MENSAGEM_INSERT:
                PessoaViewInsert.aviso("Registro inserido com sucesso!");
                break;
            case MENSAGEM_EDIT:
                PessoaViewEdit.aviso("Registro alterado com sucesso!");
                break;
            default:
                throw Action.actionNotFound(action.name());
        }
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

}
