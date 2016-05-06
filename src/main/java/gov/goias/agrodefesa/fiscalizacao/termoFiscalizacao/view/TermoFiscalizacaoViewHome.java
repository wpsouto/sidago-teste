package gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.view;

import gov.goias.agrodefesa.base.view.BaseView;
import gov.goias.agrodefesa.base.view.HomeView;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.containers.TermoFiscalizacaoPageContainerHome;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.entity.TermoFiscalizacao;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class TermoFiscalizacaoViewHome extends BaseView implements HomeView {

    public TermoFiscalizacaoViewHome(Object entity) {
        super(entity, TermoFiscalizacaoPageContainerHome.class);
    }

    private TermoFiscalizacao getEntity() {
        return (TermoFiscalizacao) entity;

    }

    private TermoFiscalizacaoPageContainerHome getContainer() {
        return (TermoFiscalizacaoPageContainerHome) container;

    }

    public void isDisplayedCheck(){
		log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(getContainer().home);
        getContainer().home.isDisplayed();
	}

    @Override
    public void incluir(){
        log.debug(Constants.MGS_SELECIONADO, "INCLUIR REGISTRO");
        getContainer().incluirRegistro.click();
    }

    @Override
    public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "DATA CRIACAO");
        getContainer().now(getContainer().dataCriacao);
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
        BrowserDriver.waitForElement(getContainer().serie);
        log.debug(Constants.MGS_INSERIDO, "SERIE", getContainer().serie.getText());
        getEntity().setSerie(getContainer().serie.getText());
        log.debug(Constants.MGS_INSERIDO, "NUMERO", getContainer().numero.getText());
        getEntity().setNumero(getContainer().numero.getText());

	}

    @Override
    public void alterar() {

    }

    @Override
    public void confirm() {

    }


}
