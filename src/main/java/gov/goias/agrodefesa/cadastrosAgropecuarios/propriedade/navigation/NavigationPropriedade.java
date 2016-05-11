package gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.navigation;

import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.entity.Propriedade;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationPropriedade extends NavigationBase {

    public NavigationPropriedade(NavegacaoType type) {
        super(type);
    }

    public Propriedade getEntity() {
        return (Propriedade) entity;
    }

    @Override
    public void insert() {
        Pessoa pessoa = (Pessoa) dependencia(Pessoa.class, "@Pessoa");
        getEntity().setPessoa(pessoa);

        super.insert();
    }

}
