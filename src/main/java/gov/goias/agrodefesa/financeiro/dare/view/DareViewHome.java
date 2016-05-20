package gov.goias.agrodefesa.financeiro.dare.view;

import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.financeiro.dare.containers.DarePageContainerHome;
import gov.goias.agrodefesa.financeiro.dare.entity.Dare;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class DareViewHome extends BaseViewHomeImpl {

    public DareViewHome(Object entity) {
        super(entity, DarePageContainerHome.class);
    }

    private Dare getEntity() {
        return (Dare) entity;

    }

    private DarePageContainerHome getContainer() {
        return (DarePageContainerHome) container;

    }

    public void isDisplayedCheck(){
		log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(getContainer().home);
        getContainer().home.isDisplayed();
	}

    public void incluir(){
        log.debug(Constants.MGS_SELECIONADO, "INCLUIR REGISTRO");
        getContainer().incluirRegistro.click();
    }

    public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "CPF/CNPJ", getEntity().getPessoa().getCpfCnpj());
        getContainer().cpf.sendKeys(getEntity().getPessoa().getCpfCnpj());
        BrowserDriver.waitForElement(getContainer().cpfAutoComplete);
        getContainer().cpfAutoComplete.click();
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
	}

}
