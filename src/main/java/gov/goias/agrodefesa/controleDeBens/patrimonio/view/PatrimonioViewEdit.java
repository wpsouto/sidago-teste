package gov.goias.agrodefesa.controleDeBens.patrimonio.view;

import gov.goias.agrodefesa.base.view.BaseView;
import gov.goias.agrodefesa.base.view.EditView;
import gov.goias.agrodefesa.controleDeBens.patrimonio.containers.PatrimonioPageContainerEdit;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class PatrimonioViewEdit extends BaseView implements EditView{

    public PatrimonioViewEdit(Object entity) {
        super(entity, PatrimonioPageContainerEdit.class);
    }

/*
    private Patrimonio getEntity() {
        return (Patrimonio) entity;
    }
*/

    private PatrimonioPageContainerEdit getContainer() {
        return (PatrimonioPageContainerEdit) container;
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
