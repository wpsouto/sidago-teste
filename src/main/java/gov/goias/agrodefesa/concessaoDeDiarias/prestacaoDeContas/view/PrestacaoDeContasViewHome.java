package gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.entity.DelegacaoAtividade;
import gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.containers.PrestacaoDeContasPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = PrestacaoDeContasPageContainerHome.class)
public class PrestacaoDeContasViewHome extends BaseViewHomeImpl {

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
