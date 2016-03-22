package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.navigation;

import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.view.IngredienteAtivoViewEdit;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.view.IngredienteAtivoViewHome;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.view.IngredienteAtivoViewInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationIngredienteAtivo implements NavegacaoStrategy {

    private static final String INGREDIENTE = "Teste Automatizado";
    private static final String ALTERAR = "-ALTERADO";

    @Override
    public void execAcao(Action action) {
        switch(action){
            case HOME:
                BrowserDriver.loadPage(NavegacaoType.INGREDIENTE_ATIVO.getUrl());
                IngredienteAtivoViewHome.isDisplayedCheck();
                break;
            case INSERT:
                IngredienteAtivoViewHome.incluirRegistro();
                IngredienteAtivoViewInsert.isDisplayedCheck();
                IngredienteAtivoViewInsert.nomeIngrediente(INGREDIENTE);
                BrowserDriver.screenshot();
                IngredienteAtivoViewInsert.salvar();
                break;
            case SEARCH:
                IngredienteAtivoViewHome.isDisplayedCheck();
                IngredienteAtivoViewHome.ingrediente(INGREDIENTE);
                IngredienteAtivoViewHome.pesquisar();
                IngredienteAtivoViewHome.isDisplayedGridPesquisar();
                break;
            case EDIT:
                execAcao(Action.SEARCH);
                IngredienteAtivoViewHome.alterar();
                IngredienteAtivoViewEdit.isDisplayedCheck();
                IngredienteAtivoViewEdit.descricao(INGREDIENTE + ALTERAR);
                IngredienteAtivoViewEdit.salvar();
                break;
            case MENSAGEM_INSERT:
                IngredienteAtivoViewInsert.aviso("Registro inserido com sucesso!");
                break;
            case MENSAGEM_EDIT:
                IngredienteAtivoViewEdit.aviso("Registro alterado com sucesso!");
                break;
        }

    }

}
