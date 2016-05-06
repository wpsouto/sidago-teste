package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.view;

import gov.goias.agrodefesa.base.view.BaseView;
import gov.goias.agrodefesa.base.view.HomeView;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.containers.UnidadeConsolidacaoPageContainerHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.entity.UnidadeConsolidacao;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class UnidadeConsolidacaoViewHome extends BaseView implements HomeView {

    public UnidadeConsolidacaoViewHome(Object entity) {
        super(entity, UnidadeConsolidacaoPageContainerHome.class);
    }

    private UnidadeConsolidacao getEntity() {
        return (UnidadeConsolidacao) entity;

    }

    private UnidadeConsolidacaoPageContainerHome getContainer() {
        return (UnidadeConsolidacaoPageContainerHome) container;

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
        isDisplayedCheck();

        log.debug(Constants.MGS_INSERIDO, "CNPJ",getEntity().getPessoa().getCpfCnpj());
        getContainer().cnpj.sendKeys(getEntity().getPessoa().getCpfCnpj());
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
	}

	public void alterar() {
		log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(getContainer().pencil);
        getContainer().pencil.click();
	}

    @Override
    public void confirm() {

    }


}
