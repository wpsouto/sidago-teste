package gov.goias.agrodefesa.financeiro.dare.navigation;

import cucumber.api.PendingException;
import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.financeiro.dare.entity.UnidadeProducao;
import gov.goias.agrodefesa.financeiro.dare.view.UnidadeProducaoViewEdit;
import gov.goias.agrodefesa.financeiro.dare.view.UnidadeProducaoViewHome;
import gov.goias.agrodefesa.financeiro.dare.view.UnidadeProducaoViewInsert;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.entity.TermoFiscalizacao;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.navigation.NavigationTermoFiscalizacao;
import gov.goias.agrodefesa.utils.Constants;
import gov.goias.agrodefesa.utils.NavegacaoType;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationUnidadeProducao extends NavigationBase {

    public NavigationUnidadeProducao(NavegacaoType type) {
        super(type, UnidadeProducao.class, UnidadeProducaoViewHome.class, UnidadeProducaoViewInsert.class, UnidadeProducaoViewEdit.class);
    }

    public UnidadeProducao getEntity() {
        return (UnidadeProducao) entity;
    }

    @Override
    public void insert() {
        TermoFiscalizacao termoFiscalizacao = ((NavigationTermoFiscalizacao) NavegacaoFactory.getNavigator().pageLoad(NavegacaoType.TERMO_FISCALIZACAO)).getEntity();
        getEntity().setTermoFiscalizacao(termoFiscalizacao);

        if (StringUtils.isEmpty(getEntity().getTermoFiscalizacao().getPropriedade().getPessoa().getCpfCnpj())) {
            throw new PendingException(String.format(Constants.MGS_DEPENDENCIA, "@TermoFiscalizacao"));
        }
        super.insert();
    }

}
