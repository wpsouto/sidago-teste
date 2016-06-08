package gov.goias.agrodefesa.financeiro.dare.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.financeiro.dare.containers.DarePageContainerHome;
import gov.goias.agrodefesa.financeiro.dare.entity.Dare;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import gov.goias.agrodefesa.utils.DBPostgresql;

@View(pageContainer = DarePageContainerHome.class)
public class DareViewHome extends BaseViewHomeImpl {

    private Dare getEntity() {
        return (Dare) entity;
    }

    private DarePageContainerHome getContainer() {
        return (DarePageContainerHome) container;
    }

    public void isDisplayedCheck() {
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);
        getContainer().home.isDisplayed();
    }

    public void incluir() {
        log.debug(Constants.MGS_SELECIONADO, "INCLUIR REGISTRO");
        getContainer().incluirRegistro.click();
    }

    public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "CPF/CNPJ", getEntity().getPessoa().getCpfCnpj());
        getContainer().cpf.sendKeys(getEntity().getPessoa().getCpfCnpj());
        BrowserDriver.waitForElement(getContainer().cpfAutoComplete);
        getContainer().cpfAutoComplete.click();
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
        BrowserDriver.waitForElement(getContainer().numero);
        log.debug(Constants.MGS_INSERIDO, "NUMERO", getContainer().numero.getText());
        getEntity().setNumero(getContainer().numero.getText());
        log.debug(Constants.MGS_MENSAGEM, "Alterando DARE situação para pago");
        DBPostgresql.executeUpdate(String.format("UPDATE agrofin.boleto SET situacao = 'p' WHERE id = %s", getEntity().getNumero()));
    }

}
