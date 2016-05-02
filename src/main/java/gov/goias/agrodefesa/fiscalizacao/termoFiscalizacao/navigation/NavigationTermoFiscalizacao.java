package gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.navigation;

import cucumber.api.PendingException;
import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.navigation.NavigationPessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.entity.Propriedade;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.navigation.NavigationPropriedade;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.entity.TermoFiscalizacao;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.view.TermoFiscalizacaoViewHome;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.view.TermoFiscalizacaoViewInsert;
import gov.goias.agrodefesa.utils.Constants;
import gov.goias.agrodefesa.utils.NavegacaoType;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationTermoFiscalizacao extends NavigationBase {

    public NavigationTermoFiscalizacao(NavegacaoType type) {
        super(type, TermoFiscalizacao.class, TermoFiscalizacaoViewHome.class, TermoFiscalizacaoViewInsert.class, null);

        Propriedade propriedade = ((NavigationPropriedade) NavegacaoFactory.getNavigator().pageLoad(NavegacaoType.PROPRIEDADE)).getPropriedade();
        getEntity().setPropriedade(propriedade);
    }

    public TermoFiscalizacao getEntity() {
        return (TermoFiscalizacao) entity;
    }

    @Override
    public void insert() {

        if (StringUtils.isEmpty(getEntity().getPropriedade().getPessoa().getCpfCnpj())) {
            throw new PendingException(String.format(Constants.MGS_DEPENDENCIA, "@Propriedade"));
        }
        super.insert();

    }

}
