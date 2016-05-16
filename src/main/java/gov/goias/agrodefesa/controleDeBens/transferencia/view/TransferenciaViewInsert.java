package gov.goias.agrodefesa.controleDeBens.transferencia.view;

import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.controleDeBens.transferencia.containers.TransferenciaPageContainerInsert;
import gov.goias.agrodefesa.controleDeBens.transferencia.entity.Transferencia;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class TransferenciaViewInsert extends BaseViewInsertImpl {

    public TransferenciaViewInsert(Object entity) {
        super(entity, TransferenciaPageContainerInsert.class);
    }

    private Transferencia getEntity() {
        return (Transferencia) entity;
    }

    private TransferenciaPageContainerInsert getContainer() {
        return (TransferenciaPageContainerInsert) container;
    }

    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        log.debug(Constants.MGS_INSERIDO, "NUMERO PATRIMONIO", getEntity().getPatrimonio().getNumeroPatrimonio());
        getContainer().numeroPatrimonio.sendKeys(getEntity().getPatrimonio().getNumeroPatrimonio());
        BrowserDriver.waitForElement(getContainer().numeroPatrimonioAutoComplete);
        getContainer().numeroPatrimonioAutoComplete.click();

        log.debug(Constants.MGS_INSERIDO, "DESTINO PATRIMONIO", getEntity().getDestino());
        getContainer().destinoPatrimonio.sendKeys(getEntity().getDestino());
        BrowserDriver.waitForElement(getContainer().destinoPatrimonioAutoComplete);
        getContainer().destinoPatrimonioAutoComplete.click();

        log.debug(Constants.MGS_INSERIDO, "CONSERVACAO", getEntity().getConservacao());
        BrowserDriver.selectByVisibleText(getContainer().conservacao, getEntity().getConservacao());

        log.debug(Constants.MGS_INSERIDO, "MANUTENCAO", getEntity().getManutencao());
        BrowserDriver.selectByVisibleText(getContainer().manutencao, getEntity().getManutencao());

        log.debug(Constants.MGS_INSERIDO, "OBSERVACAO", getEntity().getObservacao());
        getContainer().observacao.sendKeys(getEntity().getObservacao());

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }

}
