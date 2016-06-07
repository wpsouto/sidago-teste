package gov.goias.agrodefesa.concessaoDeDiarias.cienciaDoServidor.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.concessaoDeDiarias.cienciaDoServidor.containers.CienciaDoServidorPageContainerHome;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.entity.DelegacaoAtividade;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = CienciaDoServidorPageContainerHome.class)
public class CienciaDoServidorViewHome extends BaseViewHomeImpl {

    private DelegacaoAtividade getEntity() {
        return (DelegacaoAtividade) entity;
    }

    private CienciaDoServidorPageContainerHome getContainer() {
        return (CienciaDoServidorPageContainerHome) container;
    }

    @Override
    public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "NUMERO", getEntity().getNumeroDiaria());
        getContainer().numero.sendKeys(getEntity().getNumeroDiaria());

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
    }

    @Override
    public void confirm() {
        log.debug(Constants.MGS_SELECIONADO, "DAR CIENCIA");
        BrowserDriver.waitForElement(getContainer().comment);
        getContainer().comment.click();

        log.debug(Constants.MGS_SELECIONADO, "CONCORDAR");
        BrowserDriver.waitForElement(getContainer().concordo);
        getContainer().concordo.click();
    }

}
