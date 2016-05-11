package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.view;

import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.containers.ProdutoPageContainerInsert;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.entity.ProdutoaAnimal;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class ProdutoViewInsert extends BaseViewInsertImpl {

    public ProdutoViewInsert(Object entity) {
        super(entity, ProdutoPageContainerInsert.class);
    }

    private ProdutoaAnimal getEntity() {
        return (ProdutoaAnimal) entity;
    }

    private ProdutoPageContainerInsert getContainer() {
        return (ProdutoPageContainerInsert) container;
    }

    @Override
    public void builder(){
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
