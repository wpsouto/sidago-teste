package gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.view;

import gov.goias.agrodefesa.base.view.BaseViewEditImpl;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.entity.DelegacaoAtividade;
import gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.containers.PrestacaoDeContasPageContainerEdit;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class PrestacaoDeContasViewEdit extends BaseViewEditImpl {

    public PrestacaoDeContasViewEdit(Object entity) {
        super(entity, PrestacaoDeContasPageContainerEdit.class);
    }

    private DelegacaoAtividade getEntity() {
        return (DelegacaoAtividade) entity;
    }

    private PrestacaoDeContasPageContainerEdit getContainer() {
        return (PrestacaoDeContasPageContainerEdit) container;
    }

    @Override
    public void builder() {
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        log.debug(Constants.MGS_INSERIDO, "ATIVIDADES DESENVOLVIDAS", getEntity().getAtividades());
        getContainer().atividades.sendKeys(getEntity().getAtividades());

        BrowserDriver.uploadFile(getContainer().upload);

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        getContainer().salvar.click();
    }


}
