package gov.goias.agrodefesa.controleDeBens.almoxarifado.view;

import gov.goias.agrodefesa.base.view.BaseView;
import gov.goias.agrodefesa.base.view.HomeView;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.containers.AlmoxarifadoPageContainerHome;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.entity.Almoxarifado;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class AlmoxarifadoViewHome extends BaseView implements HomeView {

	public AlmoxarifadoViewHome(Object entity) {
		super(entity, AlmoxarifadoPageContainerHome.class);
	}

	private Almoxarifado getEntity() {
		return (Almoxarifado) entity;
	}

	private AlmoxarifadoPageContainerHome getContainer() {
		return (AlmoxarifadoPageContainerHome) container;
	}

	public void isDisplayedCheck(){
		log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(getContainer().home);
		getContainer().home.isDisplayed();
	}

	@Override
	public void incluir(){
		log.debug(Constants.MGS_SELECIONADO, "INCLUIR REGISTRO");
		getContainer().incluirRegistro.click();
	}

	@Override
	public void pesquisar() {
		log.debug(Constants.MGS_INSERIDO, "DESCRICAO", getEntity().getDescricao());
		getContainer().descricao.sendKeys(getEntity().getDescricao());
		getContainer().lotacao.sendKeys(getEntity().getLotacao());
		log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
		getContainer().pesquisar.click();
	}

	@Override
	public void alterar() {
		log.debug(Constants.MGS_SELECIONADO, "ALTERAR REGISTRO");
		getContainer().pencil.click();
	}

	@Override
	public void confirm() {

	}

}
