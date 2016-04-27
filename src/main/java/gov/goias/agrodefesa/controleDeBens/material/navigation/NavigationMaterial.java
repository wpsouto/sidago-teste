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
    public void home() {
        BrowserDriver.loadPage(NavegacaoType.MATERIAL.getUrl());
        MaterialViewHome.isDisplayedCheck();

    }

    @Override
    public void insert() {
        MaterialViewHome.incluirRegistro();
        MaterialViewInsert.isDisplayedCheck();
        MaterialViewInsert.nomeMaterial(NOME);
        MaterialViewInsert.tipoMaterial(TIPO_MATERIAL);
        MaterialViewInsert.unidadeMedida(UNIDADE_MEDIDA);
        MaterialViewInsert.estoqueMinimo(ESTOQUE_MINIMO);
        BrowserDriver.screenshot();
        MaterialViewInsert.salvar();

    }

    @Override
    public void search() {
        MaterialViewHome.isDisplayedCheck();
        MaterialViewHome.nomeMaterial(NOME);
        MaterialViewHome.pesquisar();
        MaterialViewHome.isDisplayedGridPesquisar();

    }

    @Override
    public void edit() {
        search();
        MaterialViewHome.alterar();
        MaterialViewEdit.isDisplayedCheck();
        MaterialViewEdit.nomeMaterial(NOME + ALTERAR);
        MaterialViewEdit.salvar();

    }

    @Override
    public void others(Action action) {
        switch(action){
            case MENSAGEM_INSERT:
                MaterialViewInsert.aviso("Registro inserido com sucesso!");
                break;
            case MENSAGEM_EDIT:
                MaterialViewEdit.aviso("Registro alterado com sucesso!");
                break;
            default:
                throw Action.actionNotFound(action.name());

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
