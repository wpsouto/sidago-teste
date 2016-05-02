package gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.view;

import gov.goias.agrodefesa.base.view.BaseView;
import gov.goias.agrodefesa.base.view.InsertView;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.containers.TermoFiscalizacaoPageContainerInsert;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.entity.TermoFiscalizacao;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.openqa.selenium.By;

public class TermoFiscalizacaoViewInsert extends BaseView implements InsertView {

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

        log.debug(Constants.MGS_INSERIDO, "PROGRAMA");
        BrowserDriver.waitForElement(getContainer().programa);
        getContainer().programa.click();
        BrowserDriver.waitForElement(getContainer().programaAutoComplete);
        getContainer().programaAutoComplete.click();

        log.debug(Constants.MGS_INSERIDO, "OBJETIVO");
        BrowserDriver.waitForSelectOptions(getContainer().objetivoID);
        getContainer().objetivoCHZN.click();
        BrowserDriver.waitForClickable(getContainer().objetivoAutoComplete);
        getContainer().objetivoAutoComplete.click();

        log.debug(Constants.MGS_INSERIDO, "SUBOBJETIVO");
        BrowserDriver.waitForSelectOptions(getContainer().suObjetivoID);
        getContainer().subObjetivoCHZN.click();
        BrowserDriver.waitForElement(getContainer().subObjetivoAutoComplete);
        getContainer().subObjetivoAutoComplete.click();

        log.debug(Constants.MGS_INSERIDO, "PRODUTO");
        BrowserDriver.waitForSelectOptions(getContainer().produtoID);
        getContainer().produtoCHZN.click();
        BrowserDriver.waitForElement(getContainer().produtoAutoComplete);
        getContainer().produtoAutoComplete.click();

        log.debug(Constants.MGS_SELECIONADO, "CONFIRMAR");
        getContainer().confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(By.id("div_id_termoobjetivofiscalizacao"));

        log.debug(Constants.MGS_INSERIDO, "SITUACAO ENCONTRADA", getEntity().getSituacaoEncontrada());
        getContainer().situacaoEncontrada.sendKeys(getEntity().getSituacaoEncontrada());

        log.debug(Constants.MGS_INSERIDO, "ORIENTACOES", getEntity().getOrientacoes());
        getContainer().orientacoes.sendKeys(getEntity().getOrientacoes());

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
        getContainer().sim.click();
    }

    public void aviso() {
        log.debug(Constants.MGS_MENSAGEM, Constants.REGISTRO_INSERIDO_COM_SUCESSO);
        BrowserDriver.waitForText(getContainer().aviso, Constants.REGISTRO_INSERIDO_COM_SUCESSO);
        getContainer().ok.click();
    }

}
