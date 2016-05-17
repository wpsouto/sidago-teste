package gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.view;

import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.containers.AquisicaoMudasPageContainerHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.entity.AquisicaoMudas;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class AquisicaoMudasViewHome extends BaseViewHomeImpl {

	public AquisicaoMudasViewHome(Object entity) {
		super(entity, AquisicaoMudasPageContainerHome.class);
	}

	private AquisicaoMudas getEntity() {
		return (AquisicaoMudas) entity;
	}

	private AquisicaoMudasPageContainerHome getContainer() {
		return (AquisicaoMudasPageContainerHome) container;
	}

	@Override
	public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "CPF CNPJ ORIGEM", getEntity().getUnidadeProducao().getTermoFiscalizacao().getPropriedade().getPessoa().getCpfCnpj());
		getContainer().cpfCnpjOrigem.sendKeys(getEntity().getUnidadeProducao().getTermoFiscalizacao().getPropriedade().getPessoa().getCpfCnpj());

		log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
		getContainer().pesquisar.click();
	}

	public void aprovacao() {
		log.debug(Constants.MGS_SELECIONADO, "APROVAR");
		BrowserDriver.waitForElement(getContainer().document);
		getContainer().document.click();
	}


}
