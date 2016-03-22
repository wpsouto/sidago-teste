package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.navigation;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.view.EmpresaClassificacaoViewEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.view.EmpresaClassificacaoViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.view.EmpresaClassificacaoViewInsert;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.CNPJGenerator;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationEmpresaClassificacao implements NavegacaoStrategy {

    private String cnpj;
    private static final String CLASSIFICACAO = "Teste Automatizado";
    private static final String TIPO_CLASSIFICACAO = "Classificação Simples";
    private static final String ALTERAR = "-ALTERADO";


    @Override
    public void execAcao(Action action) {
        switch(action){
            case HOME:
                BrowserDriver.loadPage(NavegacaoType.EMPRESA_CLASSIFICACAO.getUrl());
                EmpresaClassificacaoViewHome.isDisplayedCheck();
                break;
            case INSERT:
                EmpresaClassificacaoViewHome.incluirRegistro();
                EmpresaClassificacaoViewInsert.isDisplayedCheck();
                EmpresaClassificacaoViewInsert.tipoClassificacao(TIPO_CLASSIFICACAO);
                EmpresaClassificacaoViewInsert.classificacao(CLASSIFICACAO);
                BrowserDriver.screenshot();
                EmpresaClassificacaoViewInsert.salvar();
                break;
            case SEARCH:
                EmpresaClassificacaoViewHome.isDisplayedCheck();
                EmpresaClassificacaoViewHome.classificacao(CLASSIFICACAO);
                EmpresaClassificacaoViewHome.pesquisar();
                EmpresaClassificacaoViewHome.isDisplayedGridPesquisar();
                break;
            case EDIT:
                execAcao(Action.SEARCH);
                EmpresaClassificacaoViewHome.alterar();
                EmpresaClassificacaoViewEdit.isDisplayedCheck();
                EmpresaClassificacaoViewHome.classificacao(CLASSIFICACAO);
                EmpresaClassificacaoViewEdit.salvar();
                break;
            case MENSAGEM_INSERT:
                EmpresaClassificacaoViewInsert.aviso("Registro inserido com sucesso!");
                break;
            case MENSAGEM_EDIT:
                EmpresaClassificacaoViewEdit.aviso("Registro alterado com sucesso!");
                break;
        }

    }

    public String getCnpj() {
        return cnpj;
    }
}
