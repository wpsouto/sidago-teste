package gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.view;

import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.entity.DelegacaoAtividade;
import gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.containers.PrestacaoDeContasPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class PrestacaoDeContasViewHome extends BaseViewHomeImpl {

    public PrestacaoDeContasViewHome(Object entity) {
        super(entity, PrestacaoDeContasPageContainerHome.class);
    }

    private DelegacaoAtividade getEntity() {
        return (DelegacaoAtividade) entity;
    }

    private PrestacaoDeContasPageContainerHome getContainer() {
        return (PrestacaoDeContasPageContainerHome) container;
    }

    @Override
    public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "NUMERO", getEntity().getNumeroDiaria());
        getContainer().numeroDaDiaria.sendKeys(getEntity().getNumeroDiaria());

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
    }

    @Override
    public void alterar() {
        log.debug(Constants.MGS_SELECIONADO, "FAZER PRESTAÇÃO DE CONTAS");
        BrowserDriver.waitForText(getContainer().gridRow, getEntity().getNumeroDiaria());
        getContainer().pencil.click();
    }

}
