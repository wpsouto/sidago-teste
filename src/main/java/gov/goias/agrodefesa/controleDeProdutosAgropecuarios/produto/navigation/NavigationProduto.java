package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.navigation;

import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.entity.ProdutoAnimal;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationProduto extends NavigationBase {

    public NavigationProduto(NavegacaoType type) {
        super(type);
    }

    public ProdutoAnimal getEntity() {
        return (ProdutoAnimal) entity;
    }

}
