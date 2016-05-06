package gov.goias.agrodefesa.controleDeBens.almoxarifado.view;

import gov.goias.agrodefesa.base.view.BaseView;
import gov.goias.agrodefesa.base.view.EditView;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.containers.AlmoxarifadoPageContainerEdit;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class AlmoxarifadoViewEdit extends BaseView implements EditView {

    public AlmoxarifadoViewEdit(Object entity) {
        super(entity, AlmoxarifadoPageContainerEdit.class);
    }

/*
    private Patrimonio getEntity() {
        return (Patrimonio) entity;
    }
*/

    private AlmoxarifadoPageContainerEdit getContainer() {
        return (AlmoxarifadoPageContainerEdit) container;
    }

    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.waitForElement(getContainer().salvar);
        getContainer().salvar.click();
    }

    public void aviso() {
        log.debug(Constants.MGS_MENSAGEM, Constants.REGISTRO_ALTERADO_COM_SUCESSO);
        BrowserDriver.waitForText(getContainer().aviso, Constants.REGISTRO_ALTERADO_COM_SUCESSO);
        getContainer().ok.click();
    }

}
