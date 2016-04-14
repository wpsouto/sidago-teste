package gov.goias.agrodefesa.denuncia.abrirDenuncia.view;

import gov.goias.agrodefesa.denuncia.abrirDenuncia.containers.AbrirDenunciaPageContainerHome;
import gov.goias.agrodefesa.padrao.view.BaseView;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class AbrirDenunciaViewHome extends BaseView {
    
    private AbrirDenunciaPageContainerHome containerHome;
    
    public AbrirDenunciaViewHome() {
        super(AbrirDenunciaPageContainerHome.class);
        this.containerHome = ((AbrirDenunciaPageContainerHome) container);
    }

    public void isDisplayedCheck(){
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(containerHome.home);
        containerHome.home.isDisplayed();
	}

    public void incluirRegistro(){
        log.debug(Constants.MGS_SELECIONADO, "INCLUIR REGISTRO");
        BrowserDriver.waitForElement(containerHome.incluirRegistro);
        containerHome.incluirRegistro.click();
    }

	public void tipoInfracao(String valor){
        log.debug(Constants.MGS_INSERIDO, "TIPO INFRACAO", valor);
        BrowserDriver.scrollUp();
        containerHome.tipoInfracao.sendKeys(valor.split("-")[1].trim());
        BrowserDriver.waitForElement(containerHome.tipoInfracaoAutoComplete);
        containerHome.tipoInfracaoAutoComplete.click();
	}

    public void pesquisar() {
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        containerHome.pesquisar.click();
	}

	public void isDisplayedGridPesquisar() {
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(containerHome.gridRow);
        containerHome.gridRow.isDisplayed();
	}

	public void alterar() {
        log.debug(Constants.MGS_SELECIONADO, "ALTERAR");
        BrowserDriver.waitForElement(containerHome.alterar);
        BrowserDriver.scroll(containerHome.alterar);
        containerHome.alterar.click();
	}

}
