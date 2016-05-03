package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.view;

import gov.goias.agrodefesa.base.view.BaseView;
import gov.goias.agrodefesa.base.view.HomeView;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.containers.UnidadeProducaoPageContainerHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.entity.UnidadeProducao;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class UnidadeProducaoViewHome extends BaseView implements HomeView {

    public UnidadeProducaoViewHome(Object entity) {
        super(entity, UnidadeProducaoPageContainerHome.class);
    }

    private UnidadeProducao getEntity() {
        return (UnidadeProducao) entity;

    }

    private UnidadeProducaoPageContainerHome getContainer() {
        return (UnidadeProducaoPageContainerHome) container;

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
        log.debug(Constants.MGS_INSERIDO, "CPF PRODUTOR", getEntity().getTermoFiscalizacao().getPropriedade().getPessoa().getCpfCnpj());
        getContainer().cnpjProdutor.sendKeys(getEntity().getTermoFiscalizacao().getPropriedade().getPessoa().getCpfCnpj());
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
	}

	public void alterar() {
		log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(getContainer().pencil);
        getContainer().pencil.click();
	}


}
