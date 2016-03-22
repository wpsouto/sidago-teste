package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.navigation;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.view.EmpresaForaGoiasViewEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.view.EmpresaForaGoiasViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.view.EmpresaForaGoiasViewInsert;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.CNPJGenerator;
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
        this.cnpj = CNPJGenerator.cnpj();
    }

    @Override
    public void execAcao(Action action) {
        switch(action){
            case HOME:
                BrowserDriver.loadPage(NavegacaoType.EMPRESA_FORA_GOIAS.getUrl());
                EmpresaForaGoiasViewHome.isDisplayedCheck();
                break;
            case INSERT:
                EmpresaForaGoiasViewHome.incluirRegistro();
                EmpresaForaGoiasViewInsert.isDisplayedCheck();
                EmpresaForaGoiasViewInsert.numeroDocumento(NUMERO_DOCUMENTO);
                EmpresaForaGoiasViewInsert.pesquisar();
                EmpresaForaGoiasViewInsert.classificacao(CLASSIFICACAO);
                BrowserDriver.screenshot();
                EmpresaForaGoiasViewInsert.salvar();
                break;
            case SEARCH:
                EmpresaForaGoiasViewHome.isDisplayedCheck();
                EmpresaForaGoiasViewHome.cnpj(NUMERO_DOCUMENTO);
                EmpresaForaGoiasViewHome.pesquisar();
                EmpresaForaGoiasViewHome.isDisplayedGridPesquisar();
                break;
            case EDIT:
                execAcao(Action.SEARCH);
                EmpresaForaGoiasViewHome.alterar();
                EmpresaForaGoiasViewEdit.isDisplayedCheck();
                EmpresaForaGoiasViewEdit.salvar();
                break;
            case MENSAGEM_INSERT:
                EmpresaForaGoiasViewInsert.aviso("Registro inserido com sucesso!");
                break;
            case MENSAGEM_EDIT:
                EmpresaForaGoiasViewEdit.aviso("Registro alterado com sucesso!");
                break;
        }

    }

    public String getCnpj() {
        return cnpj;
    }
}
