package gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.view;

import gov.goias.agrodefesa.base.view.BaseView;
import gov.goias.agrodefesa.base.view.HomeView;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.containers.CadastroLotePageContainerHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.entity.CadastroLote;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class CadastroLoteViewHome extends BaseView implements HomeView {

    public CadastroLoteViewHome(Object entity) {
        super(entity, CadastroLotePageContainerHome.class);
    }

    private CadastroLote getEntity() {
        return (CadastroLote) entity;

    }

    private CadastroLotePageContainerHome getContainer() {
        return (CadastroLotePageContainerHome) container;

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

        log.debug(Constants.MGS_INSERIDO, "NOME UC",getEntity().getUnidadeConsolidacao().getPessoa().getCpfCnpj());
        getContainer().nomeUC.sendKeys(getEntity().getUnidadeConsolidacao().getPessoa().getCpfCnpj());
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
	}

	public void alterar() {
		log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(getContainer().pencil);
        getContainer().pencil.click();
	}


}
