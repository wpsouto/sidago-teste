package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.navigation;

import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.entity.UnidadeProducao;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.entity.TermoFiscalizacao;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationUnidadeProducao extends NavigationBase {

    public NavigationUnidadeProducao(NavegacaoType type) {
        super(type);
    }

    public UnidadeProducao getEntity() {
        return (UnidadeProducao) entity;
    }

    @Override
    public void insert() {
        TermoFiscalizacao termoFiscalizacao = (TermoFiscalizacao) dependencia(TermoFiscalizacao.class, "@TermoFiscalizacao");
        getEntity().setTermoFiscalizacao(termoFiscalizacao);

        super.insert();
    }

}
