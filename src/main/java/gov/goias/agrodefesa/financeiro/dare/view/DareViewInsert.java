package gov.goias.agrodefesa.financeiro.dare.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.financeiro.dare.containers.DarePageContainerInsert;
import gov.goias.agrodefesa.financeiro.dare.entity.Dare;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = DarePageContainerInsert.class)
public class DareViewInsert extends BaseViewInsertImpl {

    private Dare getEntity() {
        return (Dare) entity;
    }

    private DarePageContainerInsert getContainer() {
        return (DarePageContainerInsert) container;
    }

    public void builder() {
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);
        getContainer().home.isDisplayed();

        log.debug(Constants.MGS_INSERIDO, "PRODUTOR/CPF", getEntity().getPessoa().getCpfCnpj());
        autoComplete(getEntity().getPessoa().getCpfCnpj(), getContainer().produtorCPF, getContainer().produtorCPFAutoComplete);

        log.debug(Constants.MGS_SELECIONADO, "ADICIONAR COBRANÇAS");
        getContainer().adicionarCobranca.click();
        BrowserDriver.waitForElement(getContainer().adicionarCobrancaHome);

        BrowserDriver.waitForElement(getContainer().areaVegetal);
        getContainer().areaVegetal.click();
        BrowserDriver.waitForElement(getContainer().emissaoDePermissoes);
        getContainer().emissaoDePermissoes.click();
        BrowserDriver.waitForElement(getContainer().certificadoFitossanitarioOrigem);
        getContainer().certificadoFitossanitarioOrigem.click();

        log.debug(Constants.MGS_INSERIDO, "QUANTIDADE", getEntity().getQuantidade());
        getContainer().quantidade.clear();

        getContainer().quantidade.sendKeys(getEntity().getQuantidade());

        log.debug(Constants.MGS_INSERIDO, "OBSERVAÇÃO", getEntity().getObservacao());
        getContainer().observacao.sendKeys(getEntity().getObservacao());

        getContainer().confirmar.click();

        BrowserDriver.waitForElementIsNotPresent(getContainer().adicionarCobrancaHome);

        salvar();
    }

    @Override
    public void aviso() {
        log.debug(Constants.MGS_MENSAGEM, Constants.REGISTRO_INSERIDO_COM_SUCESSO);
        BrowserDriver.waitForText(getContainer().aviso, Constants.REGISTRO_INSERIDO_COM_SUCESSO);
        getContainer().ok.click();
    }
}