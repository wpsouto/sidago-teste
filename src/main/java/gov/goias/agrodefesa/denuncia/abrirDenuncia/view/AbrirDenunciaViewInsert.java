package gov.goias.agrodefesa.denuncia.abrirDenuncia.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.containers.AbrirDenunciaPageContainerInsert;
import gov.goias.agrodefesa.denuncia.abrirDenuncia.entity.AbrirDenuncia;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = AbrirDenunciaPageContainerInsert.class)
public class AbrirDenunciaViewInsert extends BaseViewInsertImpl {

    private AbrirDenuncia getEntity() {
        return (AbrirDenuncia) entity;
    }

    private AbrirDenunciaPageContainerInsert getContainer() {
        return (AbrirDenunciaPageContainerInsert) container;
    }


    @Override
    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);
        getContainer().home.isDisplayed();

        log.debug(Constants.MGS_INSERIDO, "TIPO INFRACAO", getEntity().getTipoInfracao());
        BrowserDriver.selectByVisibleText(getContainer().tipoInfracao, getEntity().getTipoInfracao());

        log.debug(Constants.MGS_INSERIDO, "ASSUNTO", getEntity().getAssunto());
        getContainer().assunto.clear();
        getContainer().assunto.sendKeys(getEntity().getAssunto());

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }

}
