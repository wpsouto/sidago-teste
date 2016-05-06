package gov.goias.agrodefesa.controleDeBens.almoxarifado.view;

import gov.goias.agrodefesa.base.view.BaseView;
import gov.goias.agrodefesa.base.view.InsertView;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.containers.AlmoxarifadoPageContainerInsert;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.entity.Almoxarifado;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class AlmoxarifadoViewInsert extends BaseView implements InsertView {

    public AlmoxarifadoViewInsert(Object entity) {
        super(entity, AlmoxarifadoPageContainerInsert.class);
    }

    private Almoxarifado getEntity() {
        return (Almoxarifado) entity;
    }

    private AlmoxarifadoPageContainerInsert getContainer() {
        return (AlmoxarifadoPageContainerInsert) container;
    }

    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        log.debug(Constants.MGS_INSERIDO, "DESCRICAO", getEntity().getDescricao());
        getContainer().descricao.sendKeys(getEntity().getDescricao());

        log.debug(Constants.MGS_INSERIDO, "LOTACAO", getEntity().getLotacao());
        getContainer().lotacao.sendKeys(getEntity().getLotacao());
        BrowserDriver.waitForElement(getContainer().lotacaoAutoComplete);
        getContainer().lotacaoAutoComplete.click();

        log.debug(Constants.MGS_INSERIDO, "GESTOR", getEntity().getGestor());
        getContainer().gestor.sendKeys(getEntity().getGestor());
        BrowserDriver.waitForElement(getContainer().gestorAutoComplete);
        getContainer().gestorAutoComplete.click();

        log.debug(Constants.MGS_INSERIDO, "ALMOXARIFADO PAI", getEntity().getAlmoxarifadoPai());
        getContainer().almoxarifadoPai.sendKeys(getEntity().getAlmoxarifadoPai());
        BrowserDriver.waitForElement(getContainer().almoxarifadoPaiAutoComplete);
        getContainer().almoxarifadoPaiAutoComplete.click();

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }

    public void aviso() {
        log.debug(Constants.MGS_MENSAGEM, Constants.REGISTRO_INSERIDO_COM_SUCESSO);
        BrowserDriver.waitForText(getContainer().aviso, Constants.REGISTRO_INSERIDO_COM_SUCESSO);
        getContainer().ok.click();
    }

}
