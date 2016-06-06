package gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.navigation;

import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.view.PessoaViewEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.view.PessoaViewHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.view.PessoaViewInsert;
import gov.goias.agrodefesa.utils.Generator;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
@Navigation(home = PessoaViewHome.class, insert = PessoaViewInsert.class, edit = PessoaViewEdit.class, entity = Pessoa.class)
@NavigationType(label = "Pessoa", modulo = NavegacaoType.CADASTROS_AGROPECUARIOS, url = "produtor")
public class NavigationPessoa extends NavigationBase {

    public Pessoa getEntity() {
        return (Pessoa) entity;
    }

    @Override
    public void insert() {
        getEntity().setCpfCnpj(Generator.cnpj());
        super.insert();
    }
}
