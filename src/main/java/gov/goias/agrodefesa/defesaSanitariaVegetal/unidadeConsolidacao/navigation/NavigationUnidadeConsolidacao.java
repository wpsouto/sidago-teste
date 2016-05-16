package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.navigation;

import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.entity.UnidadeConsolidacao;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationUnidadeConsolidacao extends NavigationBase {

    public NavigationUnidadeConsolidacao(NavegacaoType type) {
        super(type);
    }

    public UnidadeConsolidacao getEntity() {
        return (UnidadeConsolidacao) entity;
    }

    @Override
    public void insert() {
        Pessoa pessoa = (Pessoa) dependencia(Pessoa.class, "@Pessoa");
        getEntity().setPessoa(pessoa);

        super.insert();
    }

}
