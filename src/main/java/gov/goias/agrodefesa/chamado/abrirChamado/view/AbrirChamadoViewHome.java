package gov.goias.agrodefesa.chamado.abrirChamado.view;

import gov.goias.agrodefesa.base.view.BaseView;
import gov.goias.agrodefesa.base.view.HomeView;
import gov.goias.agrodefesa.chamado.abrirChamado.containers.AbrirChamadoPageContainerHome;
import gov.goias.agrodefesa.chamado.abrirChamado.entity.Chamado;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class AbrirChamadoViewHome extends BaseView implements HomeView {

    public AbrirChamadoViewHome(Object entity) {
        super(entity, AbrirChamadoPageContainerHome.class);
    }

    private Chamado getEntity() {
        return (Chamado) entity;
    }

    private AbrirChamadoPageContainerHome getContainer() {
        return (AbrirChamadoPageContainerHome) container;
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
        log.debug(Constants.MGS_INSERIDO, "CLASSIFICACAO", getEntity().getClassificacao());
        getContainer().classificacao.sendKeys(getEntity().getClassificacao());
        BrowserDriver.waitForElement(getContainer().classificacaoAutoComplete);
        getContainer().classificacaoAutoComplete.click();

        log.debug(Constants.MGS_INSERIDO, "SOLICITANTE", getEntity().getSolicitante());
        getContainer().solicitante.sendKeys(getEntity().getSolicitante());
        BrowserDriver.waitForElement(getContainer().solicitanteAutoComplete);
        getContainer().solicitanteAutoComplete.click();

        log.debug(Constants.MGS_INSERIDO, "TECNICO", getEntity().getTecnico());
        getContainer().tecnico.sendKeys(getEntity().getTecnico());
        BrowserDriver.waitForElement(getContainer().tecnicoAutoComplete);
        getContainer().tecnicoAutoComplete.click();

        log.debug(Constants.MGS_INSERIDO, "SUPORTE", getEntity().getTipoSuporte());
        BrowserDriver.selectByVisibleText(getContainer().suporte, getEntity().getTipoSuporte());

        log.debug(Constants.MGS_INSERIDO, "CONTATO", getEntity().getTipoContato());
        BrowserDriver.selectByVisibleText(getContainer().contato, getEntity().getTipoContato());

        log.debug(Constants.MGS_INSERIDO, "SITUACAO", getEntity().getSituacao());
        BrowserDriver.selectByVisibleText(getContainer().contato, getEntity().getSituacao());

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        BrowserDriver.scrollDown();
        getContainer().pesquisar.click();
        BrowserDriver.waitForElement(getContainer().gridNumeroChamado);

        log.debug(Constants.MGS_INSERIDO, "NUMERO CHAMADO", getContainer().gridNumeroChamado.getText());
        getEntity().setNumeroChamado(getContainer().gridNumeroChamado.getText());

    }

    @Override
    public void alterar() {

    }

    @Override
    public void confirm() {

    }


}
