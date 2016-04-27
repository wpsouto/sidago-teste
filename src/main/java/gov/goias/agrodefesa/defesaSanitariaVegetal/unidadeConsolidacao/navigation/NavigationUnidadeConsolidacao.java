package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.navigation;

import cucumber.api.PendingException;
import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.navigation.NavigationPessoa;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.entity.UnidadeConsolidacao;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.view.UnidadeConsolidacaoViewEdit;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.view.UnidadeConsolidacaoViewHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.view.UnidadeConsolidacaoViewInsert;
import gov.goias.agrodefesa.utils.Constants;
import gov.goias.agrodefesa.utils.NavegacaoType;
import gov.goias.agrodefesa.utils.ResourceFactory;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationUnidadeConsolidacao extends NavigationBase {

    private UnidadeConsolidacao entity = ResourceFactory.init(UnidadeConsolidacao.class);

    public NavigationUnidadeConsolidacao(NavegacaoType type) {
        super(type);

        Pessoa pessoa = ((NavigationPessoa) NavegacaoFactory.getNavigator().pageLoad(NavegacaoType.PESSOA)).getPessoa();
        this.entity.setPessoa(pessoa);

        home = new UnidadeConsolidacaoViewHome(this.entity);
        insert = new UnidadeConsolidacaoViewInsert(this.entity);
        edit = new UnidadeConsolidacaoViewEdit(this.entity);
    }

    public UnidadeConsolidacao getEntity() {
        return entity;
    }

    @Override
    public void insert() {
        if (StringUtils.isEmpty(this.entity.getPessoa().getCpfCnpj())) {
            throw new PendingException(String.format(Constants.MGS_DEPENDENCIA, "@Pessoa"));
        }
        super.insert();

    }

}
