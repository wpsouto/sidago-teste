package gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.navigation;

import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.view.LavouraViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.view.LavouraViewInsert;
import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.view.LavouraViewEdit;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;
import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.entity.Produto;
import gov.goias.agrodefesa.utils.ResourceFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationLavoura implements NavegacaoStrategy {

     private static final String INSCRICAO_ESTADUAL = "113682832";
    private static final String SISTEMA_CULTIVO = "Sequeiro";
    private static final String ORIGEM_SEMENTE = "Própria";
    private Produto produto = ResourceFactory.init(Produto.class);

    @Override
    public void home() {
        BrowserDriver.loadPage(NavegacaoType.LAVOURA.getUrl());
        LavouraViewHome.isDisplayedCheck();

    }

    @Override
    public void insert() {
        LavouraViewHome.incluirRegistro();
        LavouraViewInsert.isDisplayedCheck();
        LavouraViewInsert.listaSefaz();
        LavouraViewInsert.adicionarProduto(produto);
        LavouraViewInsert.sistemaCultivo(SISTEMA_CULTIVO);
        LavouraViewInsert.origemSemente(ORIGEM_SEMENTE);
        BrowserDriver.screenshot();
        LavouraViewInsert.salvar();

    }

    @Override
    public void search() {
        LavouraViewHome.isDisplayedCheck();
        LavouraViewHome.inscricaoEstadual(INSCRICAO_ESTADUAL);
        LavouraViewHome.pesquisar();
        LavouraViewHome.isDisplayedGridPesquisar();

    }

    @Override
    public void edit() {
        search();
        LavouraViewHome.alterar();
        LavouraViewEdit.isDisplayedCheck();
        LavouraViewEdit.salvar();

    }

    @Override
    public void others(Action action) {
        switch (action) {
            case MENSAGEM_INSERT:
                LavouraViewInsert.aviso("Registro inserido com sucesso!");
                break;
            case MENSAGEM_EDIT:
                LavouraViewEdit.aviso("Registro alterado com sucesso!");
                break;
            default:
                throw Action.actionNotFound(action.name());

        }

    }

}
