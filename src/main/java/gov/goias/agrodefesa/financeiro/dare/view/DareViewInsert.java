package gov.goias.agrodefesa.financeiro.dare.view;

import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.financeiro.dare.containers.DarePageContainerInsert;
import gov.goias.agrodefesa.financeiro.dare.entity.Dare;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class DareViewInsert extends BaseViewInsertImpl {

    public DareViewInsert(Object entity) {
        //super(entity, DarePageContainerInsert.class);
    }

    private Dare getEntity() {
        return (Dare) entity;
    }

    private DarePageContainerInsert getContainer() {
        return (DarePageContainerInsert) container;
    }
    
    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);
        getContainer().home.isDisplayed();

        log.debug(Constants.MGS_INSERIDO, "PRODUTOR/CPF", getEntity().getPessoa().getCpfCnpj());
        autoComplete(getEntity().getPessoa().getCpfCnpj(), getContainer().produtorCPF, getContainer().produtorCPFAutoComplete);

        log.debug(Constants.MGS_SELECIONADO, "ADICIONAR COBRANÇAS");
        getContainer().adicionarCobranca.click();
        BrowserDriver.waitForElement(getContainer().adicionarCobrancaHome);

        BrowserDriver.waitForElementIsNotPresent(getContainer().adicionarCobrancaHome);

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
