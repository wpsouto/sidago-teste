package gov.goias.agrodefesa.denuncia.abrirDenuncia.view;

import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.containers.AbrirDenunciaPageContainerHome;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.entity.AbrirDenuncia;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class AbrirDenunciaViewHome extends BaseViewHomeImpl {

    public AbrirDenunciaViewHome(Object entity) {
        super(entity, AbrirDenunciaPageContainerHome.class);
    }

    private AbrirDenuncia getEntity() {
        return (AbrirDenuncia) entity;
    }

    private AbrirDenunciaPageContainerHome getContainer() {
        return (AbrirDenunciaPageContainerHome) container;
    }

    @Override
    public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "TIPO INFRACAO", getEntity().getTipoInfracao());
        BrowserDriver.scrollUp();
        getContainer().tipoInfracao.sendKeys(getEntity().getTipoInfracao().split("-")[1].trim());
        BrowserDriver.waitForElement(getContainer().tipoInfracaoAutoComplete);
        getContainer().tipoInfracaoAutoComplete.click();

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
    }

}
