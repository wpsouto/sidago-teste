package gov.goias.agrodefesa.base.view;

import gov.goias.agrodefesa.base.containers.PageContainerEdit;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

/**
 * Created by usuario on 26/04/16.
 * *
 */
public class BaseViewEditImpl extends BaseViewImpl implements EditView {

    private PageContainerEdit getContainer() {
        return (PageContainerEdit) container;
    }

    @Override
    public void builder() {
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        salvar();
    }

    public void salvar(){
        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.scrollTo(getContainer().salvar);
        getContainer().salvar.click();
    }

    @Override
    public void aviso() {
        log.debug(Constants.MGS_MENSAGEM, Constants.REGISTRO_ALTERADO_COM_SUCESSO);
        BrowserDriver.waitForText(getContainer().aviso, Constants.REGISTRO_ALTERADO_COM_SUCESSO);
        getContainer().ok.click();
    }
}
