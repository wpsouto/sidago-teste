package gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.navigation;

import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.entity.CadastroLote;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.entity.UnidadeConsolidacao;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationCadastroLote extends NavigationBase {

    public NavigationCadastroLote(NavegacaoType type) {
        super(type);

    }

    public CadastroLote getEntity() {
        return (CadastroLote) entity;
    }

    @Override
    public void insert() {
        UnidadeConsolidacao unidadeConsolidacao = ( UnidadeConsolidacao) dependencia( UnidadeConsolidacao.class, "@UnidadeConsolidacao");
        getEntity().setUnidadeConsolidacao(unidadeConsolidacao);

        super.insert();

    }

}
