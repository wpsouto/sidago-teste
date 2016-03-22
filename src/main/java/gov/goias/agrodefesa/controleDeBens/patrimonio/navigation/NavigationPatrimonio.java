package gov.goias.agrodefesa.controleDeBens.patrimonio.navigation;

import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.controleDeBens.patrimonio.view.PatrimonioViewEdit;
import gov.goias.agrodefesa.controleDeBens.patrimonio.view.PatrimonioViewHome;
import gov.goias.agrodefesa.controleDeBens.patrimonio.view.PatrimonioViewInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class NavigationPatrimonio implements NavegacaoStrategy {

    private String numeroPatrimonio;

    public NavigationPatrimonio() {
        LocalDateTime today = LocalDateTime.now();
        this.setNumeroPatrimonio(String.valueOf(Timestamp.valueOf(today).getTime()));
    }

    @Override
    public void execAcao(Action action) {
        switch (action) {
            case HOME:
                BrowserDriver.loadPage(NavegacaoType.PATRIMONIO.getUrl());
                PatrimonioViewHome.isDisplayedCheck();
                break;
            case INSERT:
                PatrimonioViewHome.incluirRegistro();
                PatrimonioViewInsert.isDisplayedCheck();
                PatrimonioViewInsert.numeroPatrimonioAgrodefesa(this.getNumeroPatrimonio());
                PatrimonioViewInsert.descricao("Teste Automatizado");
                PatrimonioViewInsert.fornecedor("PROSERVER TECNOLOGIA");
                PatrimonioViewInsert.origemRecurso("Recurso Próprio");
                PatrimonioViewInsert.tipoAquisicao("Outros");
                PatrimonioViewInsert.especie("Impressora");
                PatrimonioViewInsert.conservacao("Bom");
                PatrimonioViewInsert.lotacao("Núcleo de Tecnologia da Informação");
                BrowserDriver.screenshot();
                PatrimonioViewInsert.salvar();
                break;
            case SEARCH:
                PatrimonioViewHome.isDisplayedCheck();
                PatrimonioViewHome.numeroPatrimonio(this.getNumeroPatrimonio());
                PatrimonioViewHome.pesquisar();
                PatrimonioViewHome.isDisplayedGridPesquisar();
                break;
            case EDIT:
                execAcao(Action.SEARCH);
                PatrimonioViewHome.alterarRegistro();
                PatrimonioViewEdit.isDisplayedCheck();
                PatrimonioViewEdit.descricao("Teste Automatizado ALTERADO");
                PatrimonioViewEdit.salvar();
                break;
            case MENSAGEM_INSERT:
                PatrimonioViewInsert.aviso("Registro inserido com sucesso!");
                break;
        }

    }

    public String getNumeroPatrimonio() {
        return numeroPatrimonio;
    }

    private void setNumeroPatrimonio(String numeroPatrimonio) {
        this.numeroPatrimonio = numeroPatrimonio;
    }
}
