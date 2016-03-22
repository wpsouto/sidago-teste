package gov.goias.agrodefesa.controleDeBens.material.navigation;

import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.controleDeBens.material.view.MaterialViewEdit;
import gov.goias.agrodefesa.controleDeBens.material.view.MaterialViewHome;
import gov.goias.agrodefesa.controleDeBens.material.view.MaterialViewInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;

public class NavigationMaterial implements NavegacaoStrategy {

    private static final String NOME = "Teste Automatizado";
    private static final String TIPO_MATERIAL = "Papelaria";
    private static final String UNIDADE_MEDIDA = "Unidade";
    private static final String ESTOQUE_MINIMO = "5";
    private static final String ALTERAR = "-ALTERADO";

    @Override
    public void execAcao(Action action) {
        switch(action){
            case HOME:
                BrowserDriver.loadPage(NavegacaoType.MATERIAL.getUrl());
                MaterialViewHome.isDisplayedCheck();
                break;
            case INSERT:
                MaterialViewHome.incluirRegistro();
                MaterialViewInsert.isDisplayedCheck();
                MaterialViewInsert.nomeMaterial(NOME);
                MaterialViewInsert.tipoMaterial(TIPO_MATERIAL);
                MaterialViewInsert.unidadeMedida(UNIDADE_MEDIDA);
                MaterialViewInsert.estoqueMinimo(ESTOQUE_MINIMO);
                BrowserDriver.screenshot();
                MaterialViewInsert.salvar();
                break;
            case SEARCH:
                MaterialViewHome.isDisplayedCheck();
                MaterialViewHome.nomeMaterial(NOME);
                MaterialViewHome.pesquisar();
                MaterialViewHome.isDisplayedGridPesquisar();
                break;
            case EDIT:
                execAcao(Action.SEARCH);
                MaterialViewHome.alterar();
                MaterialViewEdit.isDisplayedCheck();
                MaterialViewEdit.nomeMaterial(NOME + ALTERAR);
                MaterialViewEdit.salvar();
                break;
            case MENSAGEM_INSERT:
                MaterialViewInsert.aviso("Registro inserido com sucesso!");
                break;
            case MENSAGEM_EDIT:
                MaterialViewEdit.aviso("Registro alterado com sucesso!");
                break;
        }

    }

    public void salvarRegistroInvalido(){
        MaterialViewHome.incluirRegistro();
        MaterialViewInsert.isDisplayedCheck();
        MaterialViewInsert.salvar();
    }

    public void erroCheck() {
        MaterialViewInsert.checkErroNomeMaterial();
        MaterialViewInsert.checkErroTipoMaterial();
        MaterialViewInsert.checkErroUniadeMedida();
        MaterialViewInsert.validacao("Ocorreu um erro ao validar a inserção do registro. Observe as mensagens de erro!");
        BrowserDriver.screenshot();
    }

}
