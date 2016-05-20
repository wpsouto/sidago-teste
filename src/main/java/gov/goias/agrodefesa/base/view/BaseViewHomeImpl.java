package gov.goias.agrodefesa.base.view;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import gov.goias.agrodefesa.controleDeBens.material.containers.MaterialPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

/**
 * Created by usuario on 26/04/16.
 */
public class BaseViewHomeImpl extends BaseViewImpl implements HomeView {

    public BaseViewHomeImpl(Class<?> pageClassToProxy) {
        super(pageClassToProxy);
    }

    public BaseViewHomeImpl(Object entity, Class<?> pageClassToProxy) {
        super(entity, pageClassToProxy);
    }

    private PageContainerHome getContainer() {
        return (PageContainerHome) container;
    }

    @Override
    public void isDisplayedCheck() {
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);
        getContainer().home.isDisplayed();
    }

    @Override
    public void incluir() {
        log.debug(Constants.MGS_SELECIONADO, "INCLUIR REGISTRO");
        getContainer().incluirRegistro.click();
    }

    @Override
    public void pesquisar() {

    }

    @Override
    public void alterar() {
        log.debug(Constants.MGS_SELECIONADO, "ALTERAR REGISTRO");
        BrowserDriver.waitForElement(getContainer().pencil);
        getContainer().pencil.click();
    }

    @Override
    public void confirm() {

    }
}
