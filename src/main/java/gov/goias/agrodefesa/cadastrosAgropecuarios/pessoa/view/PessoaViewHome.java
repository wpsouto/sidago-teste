package gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.containers.PessoaPageContainerHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = PessoaPageContainerHome.class)
public class PessoaViewHome  extends BaseViewHomeImpl {

	private Pessoa getEntity() {
		return (Pessoa) entity;
	}

	private PessoaPageContainerHome getContainer() {
		return (PessoaPageContainerHome) container;
	}

	@Override
	public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "CPF/CNPJ", getEntity().getCpfCnpj());
        getContainer().cpfCnpj.sendKeys(getEntity().getCpfCnpj());
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
		getContainer().pesquisar.click();
	}


}
