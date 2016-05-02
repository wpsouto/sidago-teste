package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.navigation;

import cucumber.api.PendingException;
import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.navigation.NavigationPessoa;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.entity.UnidadeProducao;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.view.UnidadeConsolidacaoViewEdit;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.view.UnidadeConsolidacaoViewHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.view.UnidadeConsolidacaoViewInsert;
import gov.goias.agrodefesa.utils.Constants;
import gov.goias.agrodefesa.utils.NavegacaoType;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationUnidadeConsolidacao extends NavigationBase {

    public NavigationUnidadeConsolidacao(NavegacaoType type) {
        super(type, UnidadeProducao.class, UnidadeConsolidacaoViewHome.class, UnidadeConsolidacaoViewInsert.class, UnidadeConsolidacaoViewEdit.class);

        Pessoa pessoa = ((NavigationPessoa) NavegacaoFactory.getNavigator().pageLoad(NavegacaoType.PESSOA)).getPessoa();
        //getEntity().setPessoa(pessoa);
    }

    public UnidadeProducao getEntity() {
        return (UnidadeProducao) entity;
    }

    @Override
    public void insert() {
/*
        if (StringUtils.isEmpty(getEntity().getPessoa().getCpfCnpj())) {
            throw new PendingException(String.format(Constants.MGS_DEPENDENCIA, "@Pessoa"));
        }
*/
        super.insert();

    }

}
