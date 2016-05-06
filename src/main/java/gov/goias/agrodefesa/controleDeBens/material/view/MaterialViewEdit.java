package gov.goias.agrodefesa.controleDeBens.material.view;

import gov.goias.agrodefesa.base.view.BaseView;
import gov.goias.agrodefesa.base.view.EditView;
import gov.goias.agrodefesa.controleDeBens.material.containers.MaterialPageContainerEdit;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class MaterialViewEdit extends BaseView implements EditView {

    public MaterialViewEdit(Object entity) {
        super(entity, MaterialPageContainerEdit.class);
    }

/*
    private Patrimonio getEntity() {
        return (Patrimonio) entity;
    }
*/

    private MaterialPageContainerEdit getContainer() {
        return (MaterialPageContainerEdit) container;
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
