package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.navigation;

import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.entity.Classificacao;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationEmpresaClassificacao extends NavigationBase {

    public NavigationEmpresaClassificacao(NavegacaoType type) {
        super(type);
    }

    public Classificacao getEntity() {
        return (Classificacao) entity;
    }

}
