package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.navigation;

import gov.goias.agrodefesa.base.Navigation;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.entity.ProdutoAnimal;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.view.ProdutoViewEdit;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.view.ProdutoViewHome;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.view.ProdutoViewInsert;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
@Navigation(home = ProdutoViewHome.class, insert = ProdutoViewInsert.class, edit = ProdutoViewEdit.class, entity = ProdutoAnimal.class)
public class NavigationProduto extends NavigationBase {

    public NavigationProduto(NavegacaoType type) {
        super(type);
    }

    public ProdutoAnimal getEntity() {
        return (ProdutoAnimal) entity;
    }

}
