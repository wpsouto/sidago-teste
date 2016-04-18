package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.navigation;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.entity.Empresa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view.EmpresaViewAprovacao;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view.EmpresaViewEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view.EmpresaViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view.EmpresaViewInsert;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.*;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationEmpresa implements NavegacaoStrategy {
    private Empresa empresa;
    private boolean alterado= false;

    public NavigationEmpresa() {
        empresa = ResourceFactory.load(Empresa.class);
    }

    @Override
    public void execAcao(Action action) {
        switch (action) {
            case HOME:
                BrowserDriver.loadPage(NavegacaoType.EMPRESA.getUrl());
                EmpresaViewHome.isDisplayedCheck();
                break;
            case SEARCH:
                EmpresaViewHome.isDisplayedCheck();
                EmpresaViewHome.documento(empresa.getInformacaoObrigatoria().getCpfCnpj());
                EmpresaViewHome.pesquisar();
                EmpresaViewHome.isDisplayedGridPesquisar();
                break;
            case APROVO:
                execAcao(Action.SEARCH);
                EmpresaViewHome.aprovar();
                EmpresaViewAprovacao.isDisplayedCheck();
                EmpresaViewAprovacao.validar(empresa);
                BrowserDriver.screenshot();
                break;
            case EDIT:
                execAcao(Action.SEARCH);
                alterado = false;
                if (EmpresaViewHome.situacaoCadastral().contains("Aguardando Envio Cadastro")){
                    EmpresaViewHome.alterar();
                    EmpresaViewEdit.isDisplayedCheck();
                    EmpresaViewEdit.anexarDocumentos(empresa.getAnexarDocumentos());
                    EmpresaViewEdit.enviarCadastro();
                    alterado = true;
                }
                break;
            case MENSAGEM_INSERT:
                EmpresaViewInsert.aviso("Registro inserido com sucesso!");
                break;
            case MENSAGEM_EDIT:
                if (alterado) {
                    EmpresaViewEdit.aviso("Registro alterado com sucesso!");
                }
                break;
        }

    }

    public void inserir(String id, String descricao) {
        empresa.getInformacaoObrigatoria().setCpfCnpj(Generator.cnpj());
        empresa.getInformacaoObrigatoria().getClassificacao().setId(id);
        empresa.getInformacaoObrigatoria().getClassificacao().setDescricao(descricao);

        EmpresaViewHome.incluirRegistro();
        EmpresaViewInsert.isDisplayedCheck();
        EmpresaViewInsert.documento(empresa.getInformacaoObrigatoria().getCpfCnpj());
        EmpresaViewInsert.classificacao(empresa.getInformacaoObrigatoria().getClassificacao().getDescricao());
        EmpresaViewInsert.pesquisar();
        EmpresaViewInsert.informacaoObrigatoria(empresa.getInformacaoObrigatoria());
        EmpresaViewInsert.informacaoComplementar(empresa.getInformacaoComplementar());
        EmpresaViewInsert.salvar();
    }

}
