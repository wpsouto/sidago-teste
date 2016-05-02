package gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.view;

import gov.goias.agrodefesa.base.view.BaseView;
import gov.goias.agrodefesa.base.view.InsertView;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.containers.CadastroLotePageContainerInsert;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.entity.CadastroLote;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class CadastroLoteViewInsert extends BaseView implements InsertView {

    public CadastroLoteViewInsert(Object entity) {
        super(entity, CadastroLotePageContainerInsert.class);
    }

    private CadastroLote getEntity() {
        return (CadastroLote) entity;

    }

    private CadastroLotePageContainerInsert getContainer() {
        return (CadastroLotePageContainerInsert) container;

    }
    
    public void builder(){
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
        BrowserDriver.selectByIndexWait(getContainer().cultivar, 2);

        log.debug(Constants.MGS_INSERIDO, "TIPO DE PRODUTO/UNIDADE", getEntity().getTipoProduto());
        BrowserDriver.selectByIndexWait(getContainer().tipoProduto, 2);

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }

    public void aviso() {
        log.debug(Constants.MGS_MENSAGEM, Constants.REGISTRO_INSERIDO_COM_SUCESSO);
        BrowserDriver.waitForText(getContainer().aviso, Constants.REGISTRO_INSERIDO_COM_SUCESSO);
        getContainer().ok.click();
    }


}
