package gov.goias.agrodefesa.defesaSanitariaVegetal.certificadoFitossanitarioOrigem.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.defesaSanitariaVegetal.certificadoFitossanitarioOrigem.containers.CertificadoFitossanitarioOrigemPageContainerInsert;
import gov.goias.agrodefesa.defesaSanitariaVegetal.certificadoFitossanitarioOrigem.entity.CertificadoFitossanitarioOrigem;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = CertificadoFitossanitarioOrigemPageContainerInsert.class)
public class CertificadoFitossanitarioOrigemViewInsert extends BaseViewInsertImpl {

    private CertificadoFitossanitarioOrigem getEntity() {
        return (CertificadoFitossanitarioOrigem) entity;
    }

    protected CertificadoFitossanitarioOrigemPageContainerInsert getContainer() {
        return (CertificadoFitossanitarioOrigemPageContainerInsert) container;
    }

    @Override
    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
        BrowserDriver.waitForElement(getContainer().propriedadeHome);
        getContainer().cnpjCpf.sendKeys(getEntity().getUnidadeProducao().getTermoFiscalizacao().getPropriedade().getPessoa().getCpfCnpj());
        getContainer().realizarPesquisa.click();
        BrowserDriver.waitForElement(getContainer().selecionar);
        getContainer().selecionar.click();
        BrowserDriver.waitForElementIsNotPresent(getContainer().propriedadeHome);

        log.debug(Constants.MGS_SELECIONADO, "ADICIONAR PRODUTO");
        getContainer().adicionarProduto.click();
        BrowserDriver.waitForElement(getContainer().adicionarProdutoHome);
        BrowserDriver.waitForSelectByIndex(getContainer().codigoUP, 1);
        BrowserDriver.waitForSelectByIndex(getContainer().produtoUP, 1);
        getContainer().quantidade.clear();
        getContainer().quantidade.sendKeys(getEntity().getQuantidade());
        now(getContainer().inicioColheita);
        now(getContainer().fimColheita);
        getContainer().confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(getContainer().adicionarProdutoHome);

        getContainer().certificacao.click();
        getContainer().dare.sendKeys(getEntity().getDare().getNumero());

        salvar();
    }

}
