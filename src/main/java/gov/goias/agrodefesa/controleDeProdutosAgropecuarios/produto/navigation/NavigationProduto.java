package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.navigation;

import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.view.ProdutoViewEdit;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.view.ProdutoViewHome;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.view.ProdutoViewInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationProduto implements NavegacaoStrategy {

    private static final String CLASSIFICACAO = "Animal";
    private static final String NOME_DO_PRODUTO = "Teste Automatizado";
    private static final String ALTERAR = "-ALTERADO";
    private static final String UNIDADE_DE_MEDIDA = "Kilo(s)";

    @Override
    public void home() {
        BrowserDriver.loadPage(NavegacaoType.PRODUTO.getUrl());
        ProdutoViewHome.isDisplayedCheck();

    }

    @Override
    public void insert() {
        ProdutoViewHome.incluirRegistro();
        ProdutoViewInsert.isDisplayedCheck();
        ProdutoViewInsert.classificacao(CLASSIFICACAO);
        ProdutoViewInsert.nomeDoProduto(NOME_DO_PRODUTO);
        ProdutoViewInsert.adicionarSubprodutoUnidade(UNIDADE_DE_MEDIDA);
        BrowserDriver.screenshot();
        ProdutoViewInsert.salvar();

    }

    @Override
    public void search() {
        ProdutoViewHome.isDisplayedCheck();
        ProdutoViewHome.nome(NOME_DO_PRODUTO);
        ProdutoViewHome.pesquisar();
        ProdutoViewHome.isDisplayedGridPesquisar();

    }

    @Override
    public void edit() {
        search();
        ProdutoViewHome.alterar();
        ProdutoViewEdit.isDisplayedCheck();
        ProdutoViewEdit.nomeDoProduto(NOME_DO_PRODUTO + ALTERAR);
        ProdutoViewEdit.salvar();

    }

    @Override
    public void others(Action action) {
        switch(action){
            case MENSAGEM_INSERT:
                ProdutoViewInsert.aviso("Registro inserido com sucesso!");
                break;
            case MENSAGEM_EDIT:
                ProdutoViewEdit.aviso("Registro alterado com sucesso!");
                break;
            default:
                throw Action.actionNotFound(action.name());
        }

    }

}
