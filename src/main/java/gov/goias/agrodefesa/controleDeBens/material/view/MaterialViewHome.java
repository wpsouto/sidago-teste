package gov.goias.agrodefesa.controleDeBens.material.view;

import gov.goias.agrodefesa.base.view.BaseView;
import gov.goias.agrodefesa.base.view.HomeView;
import gov.goias.agrodefesa.controleDeBens.material.containers.MaterialPageContainerHome;
import gov.goias.agrodefesa.controleDeBens.material.entity.Material;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class MaterialViewHome extends BaseView implements HomeView {

    public MaterialViewHome(Object entity) {
        super(entity, MaterialPageContainerHome.class);
    }

    private Material getEntity() {
        return (Material) entity;
    }

    private MaterialPageContainerHome getContainer() {
        return (MaterialPageContainerHome) container;
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
        log.debug(Constants.MGS_INSERIDO, "NOME MATERIAL", getEntity().getNome());
        getContainer().nomeMaterial.sendKeys(getEntity().getNome());

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
