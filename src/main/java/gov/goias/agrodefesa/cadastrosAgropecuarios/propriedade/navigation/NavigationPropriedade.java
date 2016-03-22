package gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.navigation.NavigationPessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.view.PropriedadeViewEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.view.PropriedadeViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.view.PropriedadeViewInsert;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationPropriedade implements NavegacaoStrategy {

    private NavigationPessoa pessoa;
    private static final String NOME_PROPRIEDADE = "Teste Automatizado";
    private static final String TIPO_CONTRIBUINTE = "Comerciante";
    private static final String CONDICAO_PROPRIEDADE = "Proprietário Único";

    private static final String TIPO_ENDERECO = "Pessoal";
    private static final String ENDERECO = "TESTE";
    private static final String BAIRRO = "TESTE";
    private static final String CEP = "74000";
    private static final String ROTEIRO = "TESTE";

    public NavigationPropriedade() {
        pessoa = (NavigationPessoa) NavegacaoFactory.getNavigator().pageLoad(NavegacaoType.PESSOA);
    }

    @Override
    public void execAcao(Action action) {
        switch(action){
            case HOME:
                BrowserDriver.loadPage(NavegacaoType.PROPRIEDADE.getUrl());
                PropriedadeViewHome.isDisplayedCheck();
                break;
            case INSERT:
                PropriedadeViewHome.incluirRegistro();
                PropriedadeViewInsert.isDisplayedCheck();
                PropriedadeViewInsert.produtor(pessoa.getCnpj());
                PropriedadeViewInsert.pesquisar();
                PropriedadeViewInsert.nomePropriedade(NOME_PROPRIEDADE);
                PropriedadeViewInsert.tipoDeContribuinte(TIPO_CONTRIBUINTE);
                PropriedadeViewInsert.condicaoDePropriedade(CONDICAO_PROPRIEDADE);
                PropriedadeViewInsert.adionarEndereco(TIPO_ENDERECO, ENDERECO, BAIRRO, CEP, ROTEIRO);
                BrowserDriver.screenshot();
                PropriedadeViewInsert.salvar();
                break;
            case SEARCH:
                PropriedadeViewHome.isDisplayedCheck();
                PropriedadeViewHome.cnpjCpf(pessoa.getCnpj());
                PropriedadeViewHome.pesquisar();
                PropriedadeViewHome.isDisplayedGridPesquisar();
                break;
            case EDIT:
                execAcao(Action.SEARCH);
                PropriedadeViewHome.alterar();
                PropriedadeViewEdit.isDisplayedCheck();
                PropriedadeViewEdit.salvar();
                break;
            case MENSAGEM_INSERT:
                PropriedadeViewInsert.aviso("Registro inserido com sucesso!");
                break;
            case MENSAGEM_EDIT:
                PropriedadeViewEdit.aviso("Registro alterado com sucesso!");
                break;
        }

    }

}
