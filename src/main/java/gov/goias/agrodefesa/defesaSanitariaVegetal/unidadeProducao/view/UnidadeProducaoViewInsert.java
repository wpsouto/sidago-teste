package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.view;

import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.containers.UnidadeProducaoPageContainerInsert;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.entity.UnidadeProducao;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class UnidadeProducaoViewInsert extends BaseViewInsertImpl {

    public UnidadeProducaoViewInsert(Object entity) {
        super(entity, UnidadeProducaoPageContainerInsert.class);
    }

    private UnidadeProducao getEntity() {
        return (UnidadeProducao) entity;
    }

    private UnidadeProducaoPageContainerInsert getContainer() {
        return (UnidadeProducaoPageContainerInsert) container;
    }


    @Override
    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);
        getContainer().home.isDisplayed();

        log.debug(Constants.MGS_INSERIDO, "IDENTIFICACAO", getEntity().getIdentificacao());
        getContainer().identificacao.sendKeys(getEntity().getIdentificacao());

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
        BrowserDriver.waitForElement(getContainer().propriedadeHome);
        getContainer().cnpj.sendKeys(getEntity().getTermoFiscalizacao().getPropriedade().getPessoa().getCpfCnpj());
        getContainer().realizarPesquisa.click();
        BrowserDriver.waitForElement(getContainer().selecionar);
        getContainer().selecionar.click();
        BrowserDriver.waitForElementIsNotPresent(getContainer().propriedadeHome);

        log.debug(Constants.MGS_SELECIONADO, "ADICIONAR PRODUTO");
        getContainer().adicionarProduto.click();
        BrowserDriver.waitForElement(getContainer().adicionarProdutoHome);
        BrowserDriver.waitForSelectByIndex(getContainer().produto, 1);
        BrowserDriver.waitForSelectByIndex(getContainer().cultivar, 1);
        BrowserDriver.waitForSelectByIndex(getContainer().tipoProduto, 1);
        getContainer().estimativaProducao.sendKeys(getEntity().getProduto().getEstimativaProducao());
        getContainer().now(getContainer().dataPrevistoPlantio);
        getContainer().now(getContainer().previsaoInicioColheita);
        getContainer().now(getContainer().previsaoFimColheita);
        getContainer().areaPlantada.sendKeys(getEntity().getProduto().getAreaPlantada());
        getContainer().confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(getContainer().adicionarProdutoHome);

        BrowserDriver.selectByVisibleText(getContainer().sistemaCultivo, getEntity().getSistemaCultivo());
        BrowserDriver.selectByVisibleText(getContainer().origemSemente, getEntity().getOrigemSemente());
        BrowserDriver.selectByVisibleText(getContainer().areaCertificada, getEntity().getAreaCertificada());

        getContainer().latitude.clear();
        getContainer().latitude.sendKeys(getEntity().getLatitude());
        getContainer().longitude.clear();
        getContainer().longitude.sendKeys(getEntity().getLongitude());
        getContainer().localidadeLivro.sendKeys(getEntity().getLocalidadeLivro());

        getContainer().serie.sendKeys(getEntity().getTermoFiscalizacao().getSerie());
        getContainer().numero.sendKeys(getEntity().getTermoFiscalizacao().getNumero());

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }


}
