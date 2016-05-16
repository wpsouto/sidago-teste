package gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.view;

import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.containers.TermoFiscalizacaoPageContainerInsert;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.entity.TermoFiscalizacao;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class TermoFiscalizacaoViewInsert extends BaseViewInsertImpl {

    public TermoFiscalizacaoViewInsert(Object entity) {
        super(entity, TermoFiscalizacaoPageContainerInsert.class);
    }

    private TermoFiscalizacao getEntity() {
        return (TermoFiscalizacao) entity;

    }

    private TermoFiscalizacaoPageContainerInsert getContainer() {
        return (TermoFiscalizacaoPageContainerInsert) container;

    }
    
    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);
        getContainer().home.isDisplayed();

        log.debug(Constants.MGS_INSERIDO, "TIPO TERMO FISCALIZACAO", getEntity().getTipoTermoFiscalizacao());
        BrowserDriver.selectByVisibleText(getContainer().tipoTermoFiscalizacao, getEntity().getTipoTermoFiscalizacao());

        log.debug(Constants.MGS_INSERIDO, "CARACTERIZACAO FISCALIZACAO", getEntity().getCaracterizacaoFiscalizacao());
        BrowserDriver.selectByVisibleText(getContainer().caracterizacaoFiscalizacao, getEntity().getCaracterizacaoFiscalizacao());

        log.debug(Constants.MGS_INSERIDO, "IDENTIFICAO", getEntity().getIdentificacao());
        BrowserDriver.selectByVisibleText(getContainer().identificao, getEntity().getIdentificacao());

        log.debug(Constants.MGS_INSERIDO, "CPF/CNPJ/CODIGO", getEntity().getPropriedade().getPessoa().getCpfCnpj());
        getContainer().cpfCnpj.sendKeys(getEntity().getPropriedade().getPessoa().getCpfCnpj());
        BrowserDriver.waitForElement(getContainer().cpfCnpjAutoComplete);
        getContainer().cpfCnpjAutoComplete.click();

        log.debug(Constants.MGS_SELECIONADO, "ADICIONAR OBJETIVOS DA FISCALIZACAO");
        getContainer().adicionarObjetivos.click();
        BrowserDriver.waitForElement(getContainer().homeAdicionarObjetivos);

        BrowserDriver.scrollUp();
        log.debug(Constants.MGS_INSERIDO, "PROGRAMA", getEntity().getObjetivo().getPrograma());
        BrowserDriver.changeDisplay(getContainer().programa);
        BrowserDriver.waitForSelectByVisibleText(getContainer().programa, getEntity().getObjetivo().getPrograma());

        log.debug(Constants.MGS_INSERIDO, "OBJETIVO", getEntity().getObjetivo().getObjetivo());
        BrowserDriver.changeDisplay(getContainer().objetivo);
        BrowserDriver.waitForSelectByVisibleText(getContainer().objetivo, getEntity().getObjetivo().getObjetivo());

        log.debug(Constants.MGS_INSERIDO, "SUBOBJETIVO", getEntity().getObjetivo().getSubObjetivo());
        BrowserDriver.changeDisplay(getContainer().suObjetivo);
        BrowserDriver.waitForSelectByVisibleText(getContainer().suObjetivo, getEntity().getObjetivo().getSubObjetivo());

        log.debug(Constants.MGS_INSERIDO, "PRODUTO", getEntity().getObjetivo().getProduto());
        BrowserDriver.changeDisplay(getContainer().produto);
        BrowserDriver.waitForSelectByVisibleText(getContainer().produto, getEntity().getObjetivo().getProduto());

        log.debug(Constants.MGS_SELECIONADO, "CONFIRMAR");
        getContainer().confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(getContainer().homeAdicionarObjetivos);

        log.debug(Constants.MGS_INSERIDO, "SITUACAO ENCONTRADA", getEntity().getSituacaoEncontrada());
        getContainer().situacaoEncontrada.sendKeys(getEntity().getSituacaoEncontrada());

        log.debug(Constants.MGS_INSERIDO, "ORIENTACOES", getEntity().getOrientacoes());
        getContainer().orientacoes.sendKeys(getEntity().getOrientacoes());

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
        getContainer().sim.click();
    }

}
