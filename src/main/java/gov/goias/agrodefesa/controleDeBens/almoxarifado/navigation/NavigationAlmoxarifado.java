package gov.goias.agrodefesa.controleDeBens.almoxarifado.navigation;

import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.containers.AlmoxarifadoPageContainerHome;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.view.AlmoxarifadoViewEdit;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.view.AlmoxarifadoViewHome;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.view.AlmoxarifadoViewInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationAlmoxarifado implements NavegacaoStrategy {

    private static final String DESCRICAO = "Teste Automatizado";
    private static final String LOTACAO = "Núcleo de Tecnologia da Informação";
    private static final String GESTOR = "Cirilo Jose Sabath";
    private static final String ALMOXARIFADO_PAI = "Almoxarifado UOL Formoso";
    private static final String ALTERAR = "-ALTERADO";
    @Override
    public void execAcao(Action action) {

        switch(action){
            case HOME:
                BrowserDriver.loadPage(NavegacaoType.ALMOXARIFADO.getUrl());
                AlmoxarifadoViewHome.isDisplayedCheck();
                break;
            case INSERT:
                AlmoxarifadoViewHome.incluirRegistro();
                AlmoxarifadoViewInsert.isDisplayedCheck();
                AlmoxarifadoViewInsert.descricao(DESCRICAO);
                AlmoxarifadoViewInsert.lotacao(LOTACAO);
                AlmoxarifadoViewInsert.gestor(GESTOR);
                AlmoxarifadoViewInsert.almoxarifadoPai(ALMOXARIFADO_PAI);
                BrowserDriver.screenshot();
                AlmoxarifadoViewInsert.salvar();
                break;
            case SEARCH:
                AlmoxarifadoViewHome.isDisplayedCheck();
                AlmoxarifadoViewHome.descricao(DESCRICAO);
                AlmoxarifadoViewHome.lotacao(LOTACAO);
                AlmoxarifadoViewHome.pesquisar();
                AlmoxarifadoViewHome.isDisplayedGridPesquisar();
                break;
            case EDIT:
                execAcao(Action.SEARCH);
                AlmoxarifadoViewHome.alterar();
                AlmoxarifadoViewEdit.isDisplayedCheck();
                AlmoxarifadoViewEdit.descricao(DESCRICAO + ALTERAR);
                AlmoxarifadoViewEdit.salvar();
                break;
            case MENSAGEM_INSERT:
                AlmoxarifadoViewInsert.aviso("Registro inserido com sucesso!");
                break;
            case MENSAGEM_EDIT:
                AlmoxarifadoViewEdit.aviso("Registro alterado com sucesso!");
                break;
        }

    }

}
