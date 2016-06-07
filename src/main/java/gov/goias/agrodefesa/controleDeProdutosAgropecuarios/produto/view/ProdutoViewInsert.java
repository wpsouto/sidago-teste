package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.containers.ProdutoPageContainerInsert;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.entity.ProdutoAnimal;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = ProdutoPageContainerInsert.class)
public class ProdutoViewInsert extends BaseViewInsertImpl {

    private ProdutoAnimal getEntity() {
        return (ProdutoAnimal) entity;
    }

    private ProdutoPageContainerInsert getContainer() {
        return (ProdutoPageContainerInsert) container;
    }

    @Override
    public void builder() {
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        log.debug(Constants.MGS_INSERIDO, "CLASSIFICACAO", getEntity().getClassificacao());
        BrowserDriver.selectByVisibleText(getContainer().classificacao, getEntity().getClassificacao());

        log.debug(Constants.MGS_INSERIDO, "NOME PRODUTO", getEntity().getNomeProduto());
        getContainer().nome.sendKeys(getEntity().getNomeProduto());

        log.debug(Constants.MGS_SELECIONADO, "ADICIONAR SUBPRODUTO/UNIDADE");
        getContainer().adicionarSubproduto.click();

        BrowserDriver.waitForElement(getContainer().adicionarSubprodutoHome);
        log.debug(Constants.MGS_INSERIDO, "UNIDADE DE MEDIDA", getEntity().getUnidadeMedida());
        BrowserDriver.selectByVisibleText(getContainer().unidadeDeMedida, getEntity().getUnidadeMedida());
        getContainer().confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(getContainer().adicionarSubprodutoHome);

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }
}
