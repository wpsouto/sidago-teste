package gov.goias.agrodefesa.controleDeBens.patrimonio.view;

import gov.goias.agrodefesa.base.view.BaseView;
import gov.goias.agrodefesa.base.view.HomeView;
import gov.goias.agrodefesa.controleDeBens.patrimonio.containers.PatrimonioPageContainerHome;
import gov.goias.agrodefesa.controleDeBens.patrimonio.entity.Patrimonio;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class PatrimonioViewHome extends BaseView implements HomeView {

    public PatrimonioViewHome(Object entity) {
        super(entity, PatrimonioPageContainerHome.class);
    }

    private Patrimonio getEntity() {
        return (Patrimonio) entity;
    }

    private PatrimonioPageContainerHome getContainer() {
        return (PatrimonioPageContainerHome) container;
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
        log.debug(Constants.MGS_INSERIDO, "NUMERO PATRIMONIO", getEntity().getNumeroPatrimonio());
        getContainer().numeroPatrimonio.sendKeys(getEntity().getNumeroPatrimonio());
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

    }

}
