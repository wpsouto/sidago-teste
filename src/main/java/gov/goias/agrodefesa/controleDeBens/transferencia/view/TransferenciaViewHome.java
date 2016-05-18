package gov.goias.agrodefesa.controleDeBens.transferencia.view;

import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.controleDeBens.transferencia.containers.TransferenciaPageContainerHome;
import gov.goias.agrodefesa.controleDeBens.transferencia.entity.Transferencia;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class TransferenciaViewHome extends BaseViewHomeImpl {

    public TransferenciaViewHome(Object entity) {
        super(entity, TransferenciaPageContainerHome.class);
    }

    private Transferencia getEntity() {
        return (Transferencia) entity;
    }

    private TransferenciaPageContainerHome getContainer() {
        return (TransferenciaPageContainerHome) container;
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
    public void confirm() {
        log.debug(Constants.MGS_SELECIONADO, "CONFIRMAR REGISTRO");
        BrowserDriver.waitForElement(getContainer().check);
        getContainer().check.click();

        BrowserDriver.waitForElement(getContainer().confirmar);
        getContainer().confirmar.click();
    }

}
