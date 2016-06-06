package gov.goias.agrodefesa.controleDeBens.almoxarifado.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.containers.AlmoxarifadoPageContainerInsert;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.entity.Almoxarifado;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = AlmoxarifadoPageContainerInsert.class)
public class AlmoxarifadoViewInsert extends BaseViewInsertImpl {

    private Almoxarifado getEntity() {
        return (Almoxarifado) entity;
    }

    protected AlmoxarifadoPageContainerInsert getContainer() {
        return (AlmoxarifadoPageContainerInsert) container;
    }

    @Override
    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        log.debug(Constants.MGS_INSERIDO, "DESCRICAO", getEntity().getDescricao());
        getContainer().descricao.sendKeys(getEntity().getDescricao());

        log.debug(Constants.MGS_INSERIDO, "LOTACAO", getEntity().getLotacao());
        getContainer().lotacao.sendKeys(getEntity().getLotacao());
        BrowserDriver.waitForElement(getContainer().lotacaoAutoComplete);
        getContainer().lotacaoAutoComplete.click();

        log.debug(Constants.MGS_INSERIDO, "GESTOR", getEntity().getGestor());
        getContainer().gestor.sendKeys(getEntity().getGestor());
        BrowserDriver.waitForElement(getContainer().gestorAutoComplete);
        getContainer().gestorAutoComplete.click();

        log.debug(Constants.MGS_INSERIDO, "ALMOXARIFADO PAI", getEntity().getAlmoxarifadoPai());
        getContainer().almoxarifadoPai.sendKeys(getEntity().getAlmoxarifadoPai());
        BrowserDriver.waitForElement(getContainer().almoxarifadoPaiAutoComplete);
        getContainer().almoxarifadoPaiAutoComplete.click();

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }

}
