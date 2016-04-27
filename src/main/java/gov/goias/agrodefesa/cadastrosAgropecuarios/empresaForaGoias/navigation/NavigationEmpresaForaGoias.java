package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.navigation;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.view.EmpresaForaGoiasViewEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.view.EmpresaForaGoiasViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.view.EmpresaForaGoiasViewInsert;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Generator;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationEmpresaForaGoias implements NavegacaoStrategy {

    private String cnpj;
    private static final String NUMERO_DOCUMENTO = "12353501000130";
    private static final String CLASSIFICACAO = "CASA AGROPECUÁRIA - SEMENTES";

    public NavigationEmpresaForaGoias() {
        this.cnpj = Generator.cnpj();
    }

    @Override
    public void home() {
        BrowserDriver.loadPage(NavegacaoType.EMPRESA_FORA_GOIAS.getUrl());
        EmpresaForaGoiasViewHome.isDisplayedCheck();

    }

    @Override
    public void insert() {
        EmpresaForaGoiasViewHome.incluirRegistro();
        EmpresaForaGoiasViewInsert.isDisplayedCheck();
        EmpresaForaGoiasViewInsert.numeroDocumento(NUMERO_DOCUMENTO);
        EmpresaForaGoiasViewInsert.pesquisar();
        EmpresaForaGoiasViewInsert.classificacao(CLASSIFICACAO);
        BrowserDriver.screenshot();
        EmpresaForaGoiasViewInsert.salvar();

    }

    @Override
    public void search() {
        EmpresaForaGoiasViewHome.isDisplayedCheck();
        EmpresaForaGoiasViewHome.cnpj(NUMERO_DOCUMENTO);
        EmpresaForaGoiasViewHome.pesquisar();
        EmpresaForaGoiasViewHome.isDisplayedGridPesquisar();

    }

    @Override
    public void edit() {
        search();
        EmpresaForaGoiasViewHome.alterar();
        EmpresaForaGoiasViewEdit.isDisplayedCheck();
        EmpresaForaGoiasViewEdit.salvar();

    }

    @Override
    public void others(Action action) {
        switch(action){
            case MENSAGEM_INSERT:
                EmpresaForaGoiasViewInsert.aviso("Registro inserido com sucesso!");
                break;
            case MENSAGEM_EDIT:
                EmpresaForaGoiasViewEdit.aviso("Registro alterado com sucesso!");
                break;
            default:
                throw Action.actionNotFound(action.name());
        }

    }

    public String getCnpj() {
        return cnpj;
    }
}
