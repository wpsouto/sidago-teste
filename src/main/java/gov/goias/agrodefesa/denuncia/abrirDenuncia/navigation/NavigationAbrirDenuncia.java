package gov.goias.agrodefesa.denuncia.abrirDenuncia.navigation;

import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.entity.AbrirDenuncia;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.view.AbrirDenunciaViewEdit;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.view.AbrirDenunciaViewHome;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.view.AbrirDenunciaViewInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;
import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationAbrirDenuncia implements NavegacaoStrategy {
    private AbrirDenuncia entity;

    public NavigationAbrirDenuncia() {
        entity = ResourceFactory.load(AbrirDenuncia.class);
    }

    @Override
    public void execAcao(Action action) {
        switch (action) {
            case HOME:
                BrowserDriver.loadPage(NavegacaoType.ABRIR_DENUNCIA.getUrl());
                AbrirDenunciaViewHome.isDisplayedCheck();
                break;
            case SEARCH:
                AbrirDenunciaViewHome.isDisplayedCheck();
                AbrirDenunciaViewHome.tipoInfracao(entity.getTipoInfracao());
                AbrirDenunciaViewHome.pesquisar();
                AbrirDenunciaViewHome.isDisplayedGridPesquisar();
                break;
            case INSERT:
                AbrirDenunciaViewHome.incluirRegistro();
                AbrirDenunciaViewInsert.isDisplayedCheck();
                AbrirDenunciaViewInsert.tipoInfracao(entity.getTipoInfracao());
                AbrirDenunciaViewInsert.assunto(entity.getAssunto());
                BrowserDriver.screenshot();
                AbrirDenunciaViewInsert.salvar();
                break;
            case EDIT:
                execAcao(Action.SEARCH);
                AbrirDenunciaViewHome.alterar();
                AbrirDenunciaViewEdit.isDisplayedCheck();
                AbrirDenunciaViewEdit.salvar();
                break;
            case MENSAGEM_INSERT:
                AbrirDenunciaViewInsert.aviso("Registro inserido com sucesso!");
                break;
            case MENSAGEM_EDIT:
                AbrirDenunciaViewEdit.aviso("Registro alterado com sucesso!");
                break;
        }

    }

}
