package gov.goias.agrodefesa.controleDeBens.transferencia.view;

import gov.goias.agrodefesa.base.view.BaseView;
import gov.goias.agrodefesa.base.view.HomeView;
import gov.goias.agrodefesa.controleDeBens.transferencia.containers.TransferenciaPageContainerHome;
import gov.goias.agrodefesa.controleDeBens.transferencia.entity.Transferencia;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class TransferenciaViewHome extends BaseView implements HomeView {

    public TransferenciaViewHome(Object entity) {
        super(entity, TransferenciaPageContainerHome.class);
    }

    private Transferencia getEntity() {
        return (Transferencia) entity;
    }

    private TransferenciaPageContainerHome getContainer() {
        return (TransferenciaPageContainerHome) container;
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
        log.debug(Constants.MGS_INSERIDO, "NUMERO PATRIMONIO", getEntity().getPatrimonio().getNumeroPatrimonio());
        getContainer().numeroPatrimonio.sendKeys(getEntity().getPatrimonio().getNumeroPatrimonio());
        BrowserDriver.waitForElement(getContainer().numeroPatrimonioAutoComplete);
        getContainer().numeroPatrimonioAutoComplete.click();
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
        log.debug(Constants.MGS_SELECIONADO, "CONFIRMAR REGISTRO");
        getContainer().check.click();
        getContainer().confirmar.click();
    }

/*
	public static void isDisplayedGridPesquisar() {
        BrowserDriver.waitForElement(container.gridRow);
        container.gridRow.isDisplayed();
        Assert.assertEquals(container.numeroPatrimonio.getAttribute("value"), container.gridRow.getText());
	}

	public static void confirmar() {
		container.confirmar.click();
        BrowserDriver.waitForElement(container.confirmarMsg);
        container.confirmarMsg.click();
	}

    public static void confirmarMsg() {
        BrowserDriver.closeAlert();
    }
*/
}
