package gov.goias.agrodefesa.denuncia.abrirDenuncia.view;

import gov.goias.agrodefesa.denuncia.abrirDenuncia.containers.AbrirDenunciaPageContainerHome;
import gov.goias.agrodefesa.padrao.view.ViewHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class AbrirDenunciaViewHome extends ViewHome {
	//private static final Logger log = LoggerFactory.getLogger(AbrirDenunciaViewHome.class);
	//private static AbrirDenunciaPageContainerHome page;

    public AbrirDenunciaViewHome() {
         super(AbrirDenunciaPageContainerHome.class);
    }

    public void isDisplayedCheck(){
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(((AbrirDenunciaPageContainerHome) container).home);
        ((AbrirDenunciaPageContainerHome) container).home.isDisplayed();
	}

    public void incluirRegistro(){
        log.debug(Constants.MGS_SELECIONADO, "INCLUIR REGISTRO");
        BrowserDriver.waitForElement(((AbrirDenunciaPageContainerHome) container).incluirRegistro);
        ((AbrirDenunciaPageContainerHome) container).incluirRegistro.click();
    }

	public void tipoInfracao(String valor){
        log.debug(Constants.MGS_INSERIDO, "TIPO INFRACAO", valor);
        BrowserDriver.scrollUp();
		((AbrirDenunciaPageContainerHome) container).tipoInfracao.sendKeys(valor.split("-")[1].trim());
        BrowserDriver.waitForElement(((AbrirDenunciaPageContainerHome) container).tipoInfracaoAutoComplete);
        ((AbrirDenunciaPageContainerHome) container).tipoInfracaoAutoComplete.click();
	}

    public void pesquisar() {
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
		((AbrirDenunciaPageContainerHome) container).pesquisar.click();
	}

	public void isDisplayedGridPesquisar() {
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(((AbrirDenunciaPageContainerHome) container).gridRow);
		((AbrirDenunciaPageContainerHome) container).gridRow.isDisplayed();
	}

	public void alterar() {
        log.debug(Constants.MGS_SELECIONADO, "ALTERAR");
        BrowserDriver.waitForElement(((AbrirDenunciaPageContainerHome) container).alterar);
        BrowserDriver.scroll(((AbrirDenunciaPageContainerHome) container).alterar);
        ((AbrirDenunciaPageContainerHome) container).alterar.click();
	}

}
