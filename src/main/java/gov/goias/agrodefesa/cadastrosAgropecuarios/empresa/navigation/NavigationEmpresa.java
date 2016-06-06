package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.navigation;

import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.entity.Empresa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view.EmpresaViewAprovacao;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view.EmpresaViewEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view.EmpresaViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view.EmpresaViewInsert;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.Generator;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 * *
 */
@Navigation(home = EmpresaViewHome.class, insert = EmpresaViewInsert.class, edit = EmpresaViewEdit.class, entity = Empresa.class)
@NavigationType(label = "Empresa", modulo = NavegacaoType.CADASTROS_AGROPECUARIOS, url = "empresas")
public class NavigationEmpresa extends NavigationBase {

/*
    private EmpresaViewAprovacao empresaViewAprovacao;

    public NavigationEmpresa() {
        empresaViewAprovacao = new EmpresaViewAprovacao(getEntity());
    }
*/

    public Empresa getEntity() {
        return (Empresa) entity;
    }

    private void aprovar() {
        ((EmpresaViewHome) home).aprovar();
        EmpresaViewAprovacao empresaViewAprovacao = new EmpresaViewAprovacao(getEntity());
        empresaViewAprovacao.builder();
    }

    public void inserir(String id, String descricao) {
        getEntity().getInformacaoObrigatoria().setCpfCnpj(Generator.cnpj());
        getEntity().getInformacaoObrigatoria().getClassificacao().setId(id);
        getEntity().getInformacaoObrigatoria().getClassificacao().setDescricao(descricao);

        super.insert();
    }

    @Override
    public void edit() {
        super.search();
        if (getEntity().getAguardandoEnvioCadastro()) {
            home.alterar();
            edit.builder();
        }
    }

    @Override
    public void others(Action action) {
        switch (action) {
            case APPROVE:
                aprovar();
                break;
            case MENSAGEM_EDIT:
                if (getEntity().getAguardandoEnvioCadastro()) {
                    edit.aviso();
                }
                break;
            default:
                super.others(action);
        }
    }

}
