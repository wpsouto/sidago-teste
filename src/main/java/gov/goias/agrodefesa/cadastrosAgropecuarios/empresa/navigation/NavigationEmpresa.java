package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.navigation;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view.EmpresaViewEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view.EmpresaViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view.EmpresaViewInsert;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.CNPJGenerator;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationEmpresa implements NavegacaoStrategy {

    private String cnpj;
    private static final String CLASSIFICACAO = "CLUBE DE LAÇO - EMPRESA PRIVADA";
    private static final String SOCIO = "WEMERSON BARBOSA DA SILVA";
    private static final String NOME = "Teste Automatizado";
    //private static final String ALTERAR = "-ALTERADO";


    public NavigationEmpresa() {
        this.cnpj = CNPJGenerator.cnpj();
    }

    @Override
    public void execAcao(Action action) {
        switch(action){
            case HOME:
                BrowserDriver.loadPage(NavegacaoType.EMPRESA.getUrl());
                EmpresaViewHome.isDisplayedCheck();
                break;
            case INSERT:
                EmpresaViewHome.incluirRegistro();
                EmpresaViewInsert.isDisplayedCheck();
                EmpresaViewInsert.documento(this.cnpj);
                EmpresaViewInsert.classificacao(CLASSIFICACAO);
                EmpresaViewInsert.pesquisar();
                EmpresaViewInsert.informacaoObrigatoria(SOCIO, NOME, NOME);
                EmpresaViewInsert.informacaoComplementar();
                BrowserDriver.screenshot();
                EmpresaViewInsert.salvar();
                break;
            case SEARCH:
                EmpresaViewHome.isDisplayedCheck();
                EmpresaViewHome.documento(this.getCnpj());
                EmpresaViewHome.pesquisar();
                EmpresaViewHome.isDisplayedGridPesquisar();
                break;
            case EDIT:
                execAcao(Action.SEARCH);
                EmpresaViewHome.alterar();
                EmpresaViewEdit.isDisplayedCheck();
                EmpresaViewEdit.salvar();
                break;
            case MENSAGEM_INSERT:
                EmpresaViewInsert.aviso("Registro inserido com sucesso!");
                break;
            case MENSAGEM_EDIT:
                EmpresaViewEdit.aviso("Registro alterado com sucesso!");
                break;
        }

    }

    public String getCnpj() {
        return cnpj;
    }
}
