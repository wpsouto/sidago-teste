package gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.containers.CadastroLotePageContainerInsert;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.entity.CadastroLote;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = CadastroLotePageContainerInsert.class)
public class CadastroLoteViewInsert extends BaseViewInsertImpl {

    private CadastroLote getEntity() {
        return (CadastroLote) entity;
    }

    private CadastroLotePageContainerInsert getContainer() {
        return (CadastroLotePageContainerInsert) container;
    }

    @Override
    public void builder() {
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);
        getContainer().home.isDisplayed();

        log.debug(Constants.MGS_INSERIDO, "NOME UC/CNPJ", getEntity().getUnidadeConsolidacao().getPessoa().getCpfCnpj());
        getContainer().cnpj.clear();
        getContainer().cnpj.sendKeys(getEntity().getUnidadeConsolidacao().getPessoa().getCpfCnpj());
        BrowserDriver.waitForElement(getContainer().cnpjAutoComplete).click();

        log.debug(Constants.MGS_INSERIDO, "PRODUTO", getEntity().getProduto());
        BrowserDriver.selectByVisibleText(getContainer().produto, getEntity().getProduto());

        log.debug(Constants.MGS_INSERIDO, "CULTIVAR", getEntity().getCultivar());
        BrowserDriver.waitForSelectByIndex(getContainer().cultivar, 2);

        log.debug(Constants.MGS_INSERIDO, "TIPO DE PRODUTO/UNIDADE", getEntity().getTipoProduto());
        BrowserDriver.waitForSelectByIndex(getContainer().tipoProduto, 2);

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }

}
