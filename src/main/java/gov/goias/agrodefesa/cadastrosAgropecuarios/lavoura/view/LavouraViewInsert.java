package gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.containers.LavouraPageContainerInsert;
import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.entity.Lavoura;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = LavouraPageContainerInsert.class)
public class LavouraViewInsert extends BaseViewInsertImpl {

    private Lavoura getEntity() {
        return (Lavoura) entity;
    }

    private LavouraPageContainerInsert getContainer() {
        return (LavouraPageContainerInsert) container;
    }

    @Override
    public void builder() {
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        log.debug(Constants.MGS_SELECIONADO, "LISTA SEFAZ");
        BrowserDriver.waitForElement(getContainer().listaSefaz);
        getContainer().listaSefaz.click();
        BrowserDriver.waitForElementIsNotPresent(getContainer().listaSefaz);

        adicionarProduto();

        log.debug(Constants.MGS_INSERIDO, "SISTEMA CULTIVO", getEntity().getSistemaCultivo());
        BrowserDriver.selectByVisibleText(getContainer().sistemaCultivo, getEntity().getSistemaCultivo());

        log.debug(Constants.MGS_INSERIDO, "ORIGEM SEMENTE", getEntity().getOrigemSemente());
        BrowserDriver.selectByVisibleText(getContainer().origemSemente, getEntity().getOrigemSemente());

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }


    public void adicionarProduto() {
        log.debug(Constants.MGS_SELECIONADO, "ADICIONAR PRODUTO");

        BrowserDriver.scrollTo(getContainer().adicionarProduto);
        getContainer().adicionarProduto.click();
        BrowserDriver.waitForElement(getContainer().adicionarProdutoHome);
        BrowserDriver.selectByVisibleText(getContainer().produto, getEntity().getProduto().getProduto());
        BrowserDriver.selectByVisibleText(getContainer().cultivar, getEntity().getProduto().getCultivar());
        BrowserDriver.selectByVisibleText(getContainer().tipoProduto, getEntity().getProduto().getTipoProduto());
        getContainer().estimativaProducao.sendKeys(getEntity().getProduto().getEstimativaProducao());
        now(getContainer().dataPrevistoPlantio);
        now(getContainer().dataPrevistoPlantio);
        now(getContainer().previsaoInicioColheita);
        now(getContainer().previsaoFimColheita);
        getContainer().areaPlantada.sendKeys(getEntity().getProduto().getAreaPlantada());
        getContainer().confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(getContainer().adicionarProdutoHome);
    }
}
