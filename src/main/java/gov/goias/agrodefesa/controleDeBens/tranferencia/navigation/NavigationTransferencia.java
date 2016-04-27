package gov.goias.agrodefesa.controleDeBens.tranferencia.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.controleDeBens.patrimonio.navigation.NavigationPatrimonio;
import gov.goias.agrodefesa.controleDeBens.tranferencia.view.TransferenciaViewHome;
import gov.goias.agrodefesa.controleDeBens.tranferencia.view.TransferenciaViewInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;

public class NavigationTransferencia implements NavegacaoStrategy {

    private NavigationPatrimonio patrimonio;

    public NavigationTransferencia() {
        patrimonio = (NavigationPatrimonio) NavegacaoFactory.getNavigator().pageLoad(NavegacaoType.PATRIMONIO);
    }

    private void confirmar() {
        TransferenciaViewHome.isDisplayedCheck();
        TransferenciaViewHome.numeroPatrimonio(this.patrimonio.getNumeroPatrimonio());
        TransferenciaViewHome.pesquisar();
        TransferenciaViewHome.isDisplayedGridPesquisar();
        TransferenciaViewHome.confirmar();
        TransferenciaViewHome.confirmarMsg();
    }

    @Override
    public void home() {
        BrowserDriver.loadPage(NavegacaoType.TRANSFERENCIA_BENS.getUrl());
        TransferenciaViewHome.isDisplayedCheck();

    }

    @Override
    public void insert() {
        TransferenciaViewHome.incluirRegistro();
        TransferenciaViewInsert.isDisplayedCheck();
        TransferenciaViewInsert.numeroPatrimonio(patrimonio.getNumeroPatrimonio());
        TransferenciaViewInsert.destino("UOL Goiânia");
        TransferenciaViewInsert.conservacao("Bom");
        TransferenciaViewInsert.manutencao("Não");
        BrowserDriver.screenshot();
        TransferenciaViewInsert.salvar();

    }

    @Override
    public void search() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void others(Action action) {
        switch (action) {
            case OK:
                confirmar();
                break;
            case MENSAGEM_INSERT:
                TransferenciaViewInsert.aviso("Registro inserido com sucesso!");
                break;
            default:
                throw Action.actionNotFound(action.name());

        }

    }

}
