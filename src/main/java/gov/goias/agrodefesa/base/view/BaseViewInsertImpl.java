package gov.goias.agrodefesa.base.view;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import gov.goias.agrodefesa.base.containers.PageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

/**
 * Created by usuario on 26/04/16.
 */
public class BaseViewInsertImpl extends BaseView implements InsertView {

    public BaseViewInsertImpl(Object entity, Class<?> pageClassToProxy) {
        super(entity, pageClassToProxy);
    }

    private PageContainerInsert getContainer() {
        return (PageContainerInsert) container;
    }

    @Override
    public void builder() {

    }

    @Override
    public void aviso() {
        log.debug(Constants.MGS_MENSAGEM, Constants.REGISTRO_INSERIDO_COM_SUCESSO);
        BrowserDriver.waitForText(getContainer().aviso, Constants.REGISTRO_INSERIDO_COM_SUCESSO);
        getContainer().ok.click();
    }
}
