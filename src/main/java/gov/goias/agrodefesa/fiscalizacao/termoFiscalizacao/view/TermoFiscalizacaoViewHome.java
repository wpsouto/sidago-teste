package gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.containers.TermoFiscalizacaoPageContainerHome;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.entity.TermoFiscalizacao;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = TermoFiscalizacaoPageContainerHome.class)
public class TermoFiscalizacaoViewHome extends BaseViewHomeImpl {

    private TermoFiscalizacao getEntity() {
        return (TermoFiscalizacao) entity;

    }

    private TermoFiscalizacaoPageContainerHome getContainer() {
        return (TermoFiscalizacaoPageContainerHome) container;

    }

    @Override
    public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "DATA CRIACAO");
        now(getContainer().dataCriacao);
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
        BrowserDriver.waitForElement(getContainer().serie);
        log.debug(Constants.MGS_INSERIDO, "SERIE", getContainer().serie.getText());
        getEntity().setSerie(getContainer().serie.getText());
        log.debug(Constants.MGS_INSERIDO, "NUMERO", getContainer().numero.getText());
        getEntity().setNumero(getContainer().numero.getText());

	}

}
