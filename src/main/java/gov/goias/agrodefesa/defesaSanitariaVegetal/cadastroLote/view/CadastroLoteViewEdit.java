package gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.view;

import gov.goias.agrodefesa.base.view.BaseView;
import gov.goias.agrodefesa.base.view.EditView;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.containers.CadastroLotePageContainerEdit;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.entity.CadastroLote;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class CadastroLoteViewEdit extends BaseView implements EditView {

    public CadastroLoteViewEdit(Object entity) {
        super(entity, CadastroLotePageContainerEdit.class);
    }

    private CadastroLote getEntity() {
        return (CadastroLote) entity;

    }

    private CadastroLotePageContainerEdit getContainer() {
        return (CadastroLotePageContainerEdit) container;

    }

    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);
        getContainer().home.isDisplayed();

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.waitForElement(getContainer().salvar);
//        getContainer().salvar.click();
        getContainer().salvar.click();
    }

    public void aviso() {
        log.debug(Constants.MGS_MENSAGEM, Constants.REGISTRO_ALTERADO_COM_SUCESSO);
        BrowserDriver.waitForText(getContainer().aviso, Constants.REGISTRO_ALTERADO_COM_SUCESSO);
        getContainer().ok.click();
    }


}
