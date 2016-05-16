package gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.view;

import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.containers.PropriedadePageContainerHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.entity.Propriedade;
import gov.goias.agrodefesa.utils.Constants;

public class PropriedadeViewHome  extends BaseViewHomeImpl {

	public PropriedadeViewHome(Object entity) {
		super(entity, PropriedadePageContainerHome.class);
	}

	private Propriedade getEntity() {
		return (Propriedade) entity;
	}

	private PropriedadePageContainerHome getContainer() {
		return (PropriedadePageContainerHome) container;
	}

	@Override
	public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "CNPJ/CPF", getEntity().getPessoa().getCpfCnpj());
        getContainer().cnpjCpf.sendKeys(getEntity().getPessoa().getCpfCnpj());

		log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
		getContainer().pesquisar.click();
	}

}
