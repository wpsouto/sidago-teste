package gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.navigation;

import cucumber.api.PendingException;
import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.entity.CadastroLote;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.view.CadastroLoteViewEdit;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.view.CadastroLoteViewHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.view.CadastroLoteViewInsert;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.entity.UnidadeConsolidacao;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.navigation.NavigationUnidadeConsolidacao;
import gov.goias.agrodefesa.utils.Constants;
import gov.goias.agrodefesa.utils.NavegacaoType;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationCadastroLote extends NavigationBase {

    public NavigationCadastroLote(NavegacaoType type) {
        super(type);

        UnidadeConsolidacao unidadeConsolidacao = ((NavigationUnidadeConsolidacao) NavegacaoFactory.getNavigator().pageLoad(NavegacaoType.UNIDADE_CONSOLIDACAO)).getEntity();
        getEntity().setUnidadeConsolidacao(unidadeConsolidacao);
    }

    public CadastroLote getEntity() {
        return (CadastroLote) entity;
    }

    @Override
    public void insert() {
        if (StringUtils.isEmpty(getEntity().getUnidadeConsolidacao().getPessoa().getCpfCnpj())) {
            throw new PendingException(String.format(Constants.MGS_DEPENDENCIA, "@UnidadeConsolidacao"));
        }
        super.insert();

    }

}
