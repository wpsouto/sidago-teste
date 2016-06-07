package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.containers.ProdutoPageContainerHome;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.entity.ProdutoAnimal;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = ProdutoPageContainerHome.class)
public class ProdutoViewHome extends BaseViewHomeImpl {

    private ProdutoAnimal getEntity() {
        return (ProdutoAnimal) entity;
    }

    private ProdutoPageContainerHome getContainer() {
        return (ProdutoPageContainerHome) container;
    }

    @Override
    public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "NOME INGREDIENTE", getEntity().getNomeProduto());
        getContainer().nome.sendKeys(getEntity().getNomeProduto());

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
    }
}
