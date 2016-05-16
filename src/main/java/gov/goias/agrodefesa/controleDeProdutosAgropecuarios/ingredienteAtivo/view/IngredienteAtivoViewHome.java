package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.view;

import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.containers.IngredienteAtivoPageContainerHome;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.entity.Ingrediente;
import gov.goias.agrodefesa.utils.Constants;

public class IngredienteAtivoViewHome extends BaseViewHomeImpl {

	public IngredienteAtivoViewHome(Object entity) {
		super(entity, IngredienteAtivoPageContainerHome.class);
	}

	private Ingrediente getEntity() {
		return (Ingrediente) entity;
	}

	private IngredienteAtivoPageContainerHome getContainer() {
		return (IngredienteAtivoPageContainerHome) container;
	}

	@Override
	public void pesquisar() {
		log.debug(Constants.MGS_INSERIDO, "NOME INGREDIENTE", getEntity().getNome());
        getContainer().ingrediente.sendKeys(getEntity().getNome());

		log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
		getContainer().pesquisar.click();
	}

}
