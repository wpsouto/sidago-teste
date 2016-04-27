package gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.navigation;

import cucumber.api.PendingException;
import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.navigation.NavigationPessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.entity.Propriedade;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.view.PropriedadeViewEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.view.PropriedadeViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.view.PropriedadeViewInsert;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.*;
import org.apache.commons.lang.StringUtils;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationPropriedade implements NavegacaoStrategy {

    private Propriedade propriedade;

    public NavigationPropriedade() {
        Pessoa pessoa = ((NavigationPessoa) NavegacaoFactory.getNavigator().pageLoad(NavegacaoType.PESSOA)).getPessoa();
        this.propriedade = ResourceFactory.init(Propriedade.class);
        this.propriedade.setPessoa(pessoa);
    }

    public Propriedade getPropriedade() {
        return propriedade;
    }

    @Override
    public void home() {
        BrowserDriver.loadPage(NavegacaoType.PROPRIEDADE.getUrl());
        PropriedadeViewHome.isDisplayedCheck();
    }

    @Override
    public void insert() {
        if (StringUtils.isEmpty(this.propriedade.getPessoa().getCpfCnpj())){
            throw new PendingException(String.format(Constants.MGS_DEPENDENCIA, "@Pessoa"));
        }

        PropriedadeViewHome.incluirRegistro();
        PropriedadeViewInsert.isDisplayedCheck();
        PropriedadeViewInsert.produtor(propriedade.getPessoa().getCpfCnpj());
        PropriedadeViewInsert.pesquisar();
        PropriedadeViewInsert.nomePropriedade(propriedade.getNomePropriedade());
        PropriedadeViewInsert.tipoDeContribuinte(propriedade.getTipoContribuinte());
        PropriedadeViewInsert.condicaoDePropriedade(propriedade.getCondicaoPropriedade());
        PropriedadeViewInsert.adionarEndereco(propriedade.getEndereco());
        BrowserDriver.screenshot();
        PropriedadeViewInsert.salvar();

    }

    @Override
    public void search() {
        PropriedadeViewHome.isDisplayedCheck();
        PropriedadeViewHome.cnpjCpf(propriedade.getPessoa().getCpfCnpj());
        PropriedadeViewHome.pesquisar();
        PropriedadeViewHome.isDisplayedGridPesquisar();

    }

    @Override
    public void edit() {
        search();
        PropriedadeViewHome.alterar();
        PropriedadeViewEdit.isDisplayedCheck();
        PropriedadeViewEdit.salvar();

    }

    @Override
    public void others(Action action) {
        switch(action){
            case MENSAGEM_INSERT:
                PropriedadeViewInsert.aviso("Registro inserido com sucesso!");
                break;
            case MENSAGEM_EDIT:
                PropriedadeViewEdit.aviso("Registro alterado com sucesso!");
                break;
            default:
                throw Action.actionNotFound(action.name());

        }

    }

}
