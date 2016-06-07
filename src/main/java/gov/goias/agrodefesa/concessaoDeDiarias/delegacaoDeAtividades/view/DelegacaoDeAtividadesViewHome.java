package gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.containers.DelegacaoDeAtividadesPageContainerHome;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.entity.DelegacaoAtividade;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = DelegacaoDeAtividadesPageContainerHome.class)
public class DelegacaoDeAtividadesViewHome extends BaseViewHomeImpl {

    private DelegacaoAtividade getEntity() {
        return (DelegacaoAtividade) entity;
    }

    private DelegacaoDeAtividadesPageContainerHome getContainer() {
        return (DelegacaoDeAtividadesPageContainerHome) container;
    }

    @Override
    public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "NOME SERVIDOR", getEntity().getServidorDesignado());
        getContainer().nomeDoServidor.sendKeys(getEntity().getServidorDesignado());

        log.debug(Constants.MGS_INSERIDO, "DATA SAIDA", getEntity().getDataSaida());
        getContainer().dataSaida.clear();
        getContainer().dataSaida.sendKeys(getEntity().getDataSaida());

        log.debug(Constants.MGS_INSERIDO, "DATA CHEGADA", getEntity().getDataChegada());
        getContainer().dataChegada.clear();
        getContainer().dataChegada.sendKeys(getEntity().getDataChegada());

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();

        BrowserDriver.waitForElement(getContainer().gridNumero);
        getEntity().setNumeroDiaria(getContainer().gridNumero.getText());
    }

}
