package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.view;

import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.containers.EmpresaForaGoiasPageContainerHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.entity.EmpresaForaGoias;
import gov.goias.agrodefesa.utils.Constants;

public class EmpresaForaGoiasViewHome extends BaseViewHomeImpl {


	public EmpresaForaGoiasViewHome(Object entity) {
		super(entity, EmpresaForaGoiasPageContainerHome.class);
	}

	private EmpresaForaGoias getEntity() {
		return (EmpresaForaGoias) entity;
	}

	private EmpresaForaGoiasPageContainerHome getContainer() {
		return (EmpresaForaGoiasPageContainerHome) container;
	}

	@Override
	public void pesquisar() {
		log.debug(Constants.MGS_INSERIDO, "CLASSIFICACAO", getEntity().getEmpresa().getInformacaoObrigatoria().getCpfCnpj());
		getContainer().cnpj.sendKeys(getEntity().getEmpresa().getInformacaoObrigatoria().getCpfCnpj());
		log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
		getContainer().pesquisar.click();
	}

}
