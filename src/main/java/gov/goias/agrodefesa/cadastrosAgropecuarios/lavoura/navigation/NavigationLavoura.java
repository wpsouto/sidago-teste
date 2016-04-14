package gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.navigation;

import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.view.LavouraViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.view.LavouraViewInsert;
import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.view.LavouraViewEdit;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;
import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.entity.Produto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationLavoura implements NavegacaoStrategy {

    private static String dataAtual;
    private static final String INSCRICAO_ESTADUAL = "113682832";
    private static final String SISTEMA_CULTIVO = "Sequeiro";
    private static final String ORIGEM_SEMENTE = "Própria";
    private static final String PRODUTO = "ALGODÃO";
    private static final String TIPO_PRODUTO = "Plantas de algodão / ha";
    private static final String ESTIMATIVA = "100000";

    public NavigationLavoura() {
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataAtual = dataAtual.format(formatador);
    }

    @Override
    public void execAcao(Action action) {
        switch (action) {
            case HOME:
                BrowserDriver.loadPage(NavegacaoType.LAVOURA.getUrl());
                LavouraViewHome.isDisplayedCheck();
                break;
            case INSERT:
                LavouraViewHome.incluirRegistro();
                LavouraViewInsert.isDisplayedCheck();
                LavouraViewInsert.listaSefaz(INSCRICAO_ESTADUAL);
                LavouraViewInsert.adicionarProduto(new Produto.ProdutoBuilder()
                        .produto(PRODUTO)
                        .cultivar(PRODUTO)
                        .tipoProduto(TIPO_PRODUTO)
                        .estimativaProducao(ESTIMATIVA)
                        .dataPrevistaPlantio(dataAtual)
                        .previsaoInicioColheita(dataAtual)
                        .previsaoFimColheita(dataAtual)
                        .areaPlantada(ESTIMATIVA)
                        .build());
                LavouraViewInsert.sistemaCultivo(SISTEMA_CULTIVO);
                LavouraViewInsert.origemSemente(ORIGEM_SEMENTE);
                BrowserDriver.screenshot();
                LavouraViewInsert.salvar();
                break;
            case SEARCH:
                LavouraViewHome.isDisplayedCheck();
                LavouraViewHome.inscricaoEstadual(INSCRICAO_ESTADUAL);
                LavouraViewHome.pesquisar();
                LavouraViewHome.isDisplayedGridPesquisar();
                break;
            case EDIT:
                execAcao(Action.SEARCH);
                LavouraViewHome.alterar();
                LavouraViewEdit.isDisplayedCheck();
                LavouraViewEdit.salvar();
                break;
            case MENSAGEM_INSERT:
                LavouraViewInsert.aviso("Registro inserido com sucesso!");
                break;
            case MENSAGEM_EDIT:
                LavouraViewEdit.aviso("Registro alterado com sucesso!");
                break;
        }

    }

}
