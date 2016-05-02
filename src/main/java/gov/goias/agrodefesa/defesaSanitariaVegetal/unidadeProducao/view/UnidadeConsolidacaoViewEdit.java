package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.view;

import gov.goias.agrodefesa.base.view.BaseView;
import gov.goias.agrodefesa.base.view.EditView;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.containers.UnidadeConsolidacaoPageContainerEdit;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.entity.UnidadeProducao;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class UnidadeConsolidacaoViewEdit extends BaseView implements EditView {

    public UnidadeConsolidacaoViewEdit(Object entity) {
        super(entity, UnidadeConsolidacaoPageContainerEdit.class);
    }

    private UnidadeProducao getEntity() {
        return (UnidadeProducao) entity;

    }

    private UnidadeConsolidacaoPageContainerEdit getContainer() {
        return (UnidadeConsolidacaoPageContainerEdit) container;

    }

    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);
        getContainer().home.isDisplayed();
/*

        log.debug(Constants.MGS_INSERIDO, "LOCALIDADE LIVRO", getEntity().getLocalidadeLivro());
        getContainer().localidadeLivro.sendKeys(getEntity().getLocalidadeLivro());
*/

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.waitForElement(getContainer().salvar);
        getContainer().salvar.click();
        getContainer().salvar.click();
    }

    public void aviso() {
        log.debug(Constants.MGS_MENSAGEM, Constants.REGISTRO_ALTERADO_COM_SUCESSO);
        BrowserDriver.waitForText(getContainer().aviso, Constants.REGISTRO_ALTERADO_COM_SUCESSO);
        getContainer().ok.click();
    }


}
