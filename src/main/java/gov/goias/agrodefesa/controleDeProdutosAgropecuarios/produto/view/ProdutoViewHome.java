package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.view;

import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.containers.ProdutoPageContainerHome;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.entity.ProdutoAnimal;
import gov.goias.agrodefesa.utils.Constants;

public class ProdutoViewHome extends BaseViewHomeImpl {

	public ProdutoViewHome(Object entity) {
		super(entity, ProdutoPageContainerHome.class);
	}

	private ProdutoAnimal getEntity() {
		return (ProdutoAnimal) entity;
	}

	private ProdutoPageContainerHome getContainer() {
		return (ProdutoPageContainerHome) container;
	}

	@Override
	public void pesquisar() {
		log.debug(Constants.MGS_INSERIDO, "NOME INGREDIENTE", getEntity().getNomeProduto());
        getContainer().nome.sendKeys(getEntity().getNomeProduto());

		log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
		getContainer().pesquisar.click();
	}
}
