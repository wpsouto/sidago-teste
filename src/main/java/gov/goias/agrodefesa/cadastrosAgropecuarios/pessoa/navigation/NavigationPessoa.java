package gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.navigation;

import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.utils.Generator;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationPessoa extends NavigationBase {

    public NavigationPessoa(NavegacaoType type) {
        super(type);
    }

    public Pessoa getEntity() {
        return (Pessoa) entity;
    }

    @Override
    public void insert() {
        getEntity().setCpfCnpj(Generator.cnpj());
        super.insert();
    }
}
