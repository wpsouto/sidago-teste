package gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.view;

import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.containers.AquisicaoMudasPageContainerInsert;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.entity.AquisicaoMudas;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class AquisicaoMudasViewInsert extends BaseViewInsertImpl {

    public AquisicaoMudasViewInsert(Object entity) {
        super(entity, AquisicaoMudasPageContainerInsert.class);
    }

    private AquisicaoMudas getEntity() {
        return (AquisicaoMudas) entity;
    }

    private AquisicaoMudasPageContainerInsert getContainer() {
        return (AquisicaoMudasPageContainerInsert) container;
    }

    @Override
    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        log.debug(Constants.MGS_INSERIDO, "NOME/CPF/CNPJ", getEntity().getUnidadeProducao().getTermoFiscalizacao().getPropriedade().getPessoa().getCpfCnpj());
        getContainer().cnpjCpfOrigem.sendKeys(getEntity().getUnidadeProducao().getTermoFiscalizacao().getPropriedade().getPessoa().getCpfCnpj());

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisarOrigem.click();
        BrowserDriver.waitForElement(getContainer().pesquisarHomeOrigem);
        getContainer().selecionar.click();
        BrowserDriver.waitForElementIsNotPresent(getContainer().pesquisarHomeOrigem);

        log.debug(Constants.MGS_INSERIDO, "REGISTRO RENASEM", getEntity().getRegistroEnasem());
        getContainer().registroRenasem.sendKeys(getEntity().getRegistroEnasem());

        log.debug(Constants.MGS_INSERIDO, "EMAIL ORIGEM", getEntity().getEmailOrigem());
        getContainer().eMailOrigem.sendKeys(getEntity().getEmailOrigem());

        log.debug(Constants.MGS_INSERIDO, "TELEFONE ORIGEM", getEntity().getTelefoneOrigem());
        getContainer().telefoneOrigem.clear();
        getContainer().telefoneOrigem.sendKeys(getEntity().getTelefoneOrigem());

        log.debug(Constants.MGS_INSERIDO, "TIPO DESTINO", getEntity().getTipoDestino());
        BrowserDriver.selectByVisibleText(getContainer().tipoDestino, getEntity().getTipoDestino());

        log.debug(Constants.MGS_INSERIDO, "NOME/CPF/CNPJ DESTINO", getEntity().getUnidadeProducao().getTermoFiscalizacao().getPropriedade().getPessoa().getCpfCnpj());
        getContainer().cnpjCpfDestino.sendKeys(getEntity().getUnidadeProducao().getTermoFiscalizacao().getPropriedade().getPessoa().getCpfCnpj());

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR DESTINO");
        getContainer().pesquisarDestino.click();
        BrowserDriver.waitForElement(getContainer().pesquisarHomeDestino);
        getContainer().selecionar.click();
        BrowserDriver.waitForElementIsNotPresent(getContainer().pesquisarHomeDestino);

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR DESTINO");
        BrowserDriver.waitForElement(getContainer().propriedadeDestino);
        getContainer().propriedadeDestino.click();

        log.debug(Constants.MGS_INSERIDO, "TELEFONE DESTINO", getEntity().getTelefoneDestino());
        getContainer().telefoneDestino.clear();
        getContainer().telefoneDestino.sendKeys(getEntity().getTelefoneDestino());

        adicionarTransportador();
        adicionarMudas();

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }

    public void adicionarTransportador() {
        log.debug(Constants.MGS_SELECIONADO, "ADICIONAR TRANSPORTADOR");
        getContainer().adicionarTransportador.click();
        BrowserDriver.waitForElement(getContainer().adicionarTransportadorHome);
        BrowserDriver.selectByVisibleText(getContainer().tipoTransporte, getEntity().getTransporte().getTipoTransporte());
        getContainer().confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(getContainer().adicionarTransportadorHome);
    }

    public void adicionarMudas() {
        log.debug(Constants.MGS_SELECIONADO, "ADICIONAR MUDAS");
        getContainer().adicionarMudas.click();
        BrowserDriver.waitForElement(getContainer().adicionarMudasHome);
        BrowserDriver.selectByVisibleText(getContainer().produto, getEntity().getMudas().getProduto());
        BrowserDriver.waitForElement(getContainer().cultivar).click();
        BrowserDriver.selectByVisibleText(getContainer().tipoProduto, getEntity().getMudas().getTipoProduto());
        getContainer().quantidade.clear();
        getContainer().quantidade.sendKeys(getEntity().getMudas().getQuantidade());
        BrowserDriver.selectByVisibleText(getContainer().embalagem, getEntity().getMudas().getEmbalagem());
        BrowserDriver.selectByVisibleText(getContainer().metodoPropagacao, getEntity().getMudas().getMetodoPropaganda());
        getContainer().confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(getContainer().adicionarMudasHome);
    }

}
