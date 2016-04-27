package gov.goias.agrodefesa.chamado.abrirChamado.navigation;

import gov.goias.agrodefesa.chamado.abrirChamado.view.AbrirChamadoViewFinalizar;
import gov.goias.agrodefesa.chamado.abrirChamado.view.AbrirChamadoViewHome;
import gov.goias.agrodefesa.chamado.abrirChamado.view.AbrirChamadoViewInsert;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.view.AlmoxarifadoViewEdit;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.view.AlmoxarifadoViewHome;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.view.AlmoxarifadoViewInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;

public class NavigationAbrirChamado implements NavegacaoStrategy {

    @Override
    public void home() {
        BrowserDriver.loadPage(NavegacaoType.ABRIR_CHAMADO.getUrl());
        AbrirChamadoViewHome.isDisplayedCheck();

    }

    @Override
    public void insert() {
        AbrirChamadoViewHome.incluirRegistro();
        AbrirChamadoViewInsert.isDisplayedCheck();
        AbrirChamadoViewInsert.solicitante("WEMERSON DOS REIS COSTA");
        AbrirChamadoViewInsert.tipoSuporte("Sistemas Internos");
        AbrirChamadoViewInsert.classificacao("Acompanhamento de Acordos");
        AbrirChamadoViewInsert.tipoContato("Sistema");
        AbrirChamadoViewInsert.problema("Teste Automatizado");
        AbrirChamadoViewInsert.adotarChamado("Adotar");
        BrowserDriver.screenshot();
        AbrirChamadoViewInsert.salvar();

    }

    @Override
    public void search() {

    }

    @Override
    public void edit() {

    }

    public void finalizar() {
        AbrirChamadoViewHome.classificacao("Acompanhamento de Acordos");
        AbrirChamadoViewHome.solicitante("WEMERSON DOS REIS COSTA");
        AbrirChamadoViewHome.tecnico("Administrador");
        AbrirChamadoViewHome.suporte("Sistemas Internos");
        AbrirChamadoViewHome.contato("Sistema");
        AbrirChamadoViewHome.situacao("Adotado pelo técnico");
        AbrirChamadoViewHome.pesquisar();
        AbrirChamadoViewHome.isDisplayedGridPesquisar("WEMERSON DOS REIS COSTA");
        AbrirChamadoViewHome.finalizar();
        AbrirChamadoViewFinalizar.isDisplayedCheck();
        AbrirChamadoViewFinalizar.resumo("Resolvido pelo Técnico");
        AbrirChamadoViewFinalizar.descricao("Teste Automatizado");

    }

    @Override
    public void others(Action action) {
        switch(action){
            case OK:
                finalizar();
                break;
            case MENSAGEM_INSERT:
                AbrirChamadoViewInsert.aviso("Registro inserido com sucesso!");
                break;
            case MENSAGEM_OK:
                AbrirChamadoViewFinalizar.confirmar();
                break;
            default:
                throw Action.actionNotFound(action.name());
        }

    }
}
