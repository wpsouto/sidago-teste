package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.navigation;

import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.entity.Ingrediente;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationIngredienteAtivo extends NavigationBase {

    public NavigationIngredienteAtivo(NavegacaoType type) {
        super(type);
    }

    public Ingrediente getEntity() {
        return (Ingrediente) entity;
    }

}
