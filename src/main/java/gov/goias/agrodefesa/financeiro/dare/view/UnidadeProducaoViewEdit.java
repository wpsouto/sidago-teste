package gov.goias.agrodefesa.financeiro.dare.view;

import gov.goias.agrodefesa.base.view.BaseView;
import gov.goias.agrodefesa.base.view.EditView;
import gov.goias.agrodefesa.financeiro.dare.containers.UnidadeProducaoPageContainerEdit;
import gov.goias.agrodefesa.financeiro.dare.entity.UnidadeProducao;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class UnidadeProducaoViewEdit extends BaseView implements EditView {

    public UnidadeProducaoViewEdit(Object entity) {
        super(entity, UnidadeProducaoPageContainerEdit.class);
    }

    private UnidadeProducao getEntity() {
        return (UnidadeProducao) entity;

    }

    private UnidadeProducaoPageContainerEdit getContainer() {
        return (UnidadeProducaoPageContainerEdit) container;

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
