package gov.goias.agrodefesa.controleDeBens.patrimonio.view;

import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.controleDeBens.patrimonio.containers.PatrimonioPageContainerHome;
import gov.goias.agrodefesa.controleDeBens.patrimonio.entity.Patrimonio;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class PatrimonioViewHome extends BaseViewHomeImpl {

    public PatrimonioViewHome(Object entity) {
        super(entity, PatrimonioPageContainerHome.class);
    }

    private Patrimonio getEntity() {
        return (Patrimonio) entity;
    }

    private PatrimonioPageContainerHome getContainer() {
        return (PatrimonioPageContainerHome) container;
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

}
