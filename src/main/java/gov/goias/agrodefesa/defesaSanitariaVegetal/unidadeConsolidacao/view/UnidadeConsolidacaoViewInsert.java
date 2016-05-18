package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.view;

import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.containers.UnidadeConsolidacaoPageContainerInsert;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.entity.UnidadeConsolidacao;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class UnidadeConsolidacaoViewInsert extends BaseViewInsertImpl {

    public UnidadeConsolidacaoViewInsert(Object entity) {
        super(entity, UnidadeConsolidacaoPageContainerInsert.class);
    }

    private UnidadeConsolidacao getEntity() {
        return (UnidadeConsolidacao) entity;

    }

    private UnidadeConsolidacaoPageContainerInsert getContainer() {
        return (UnidadeConsolidacaoPageContainerInsert) container;

    }
    
    @Override
    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);
        getContainer().home.isDisplayed();

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
        BrowserDriver.waitForElement(getContainer().pessoaHome);
        getContainer().cnpj.sendKeys(getEntity().getPessoa().getCpfCnpj());
        getContainer().realizarPesquisa.click();
        BrowserDriver.waitForElement(getContainer().selecionar);
        getContainer().selecionar.click();

        log.debug(Constants.MGS_INSERIDO, "INSCRICAO ESTADUAL", getEntity().getInscricaoEstadual());
        BrowserDriver.waitForElement(getContainer().inscricaoEstadual);
        getContainer().inscricaoEstadual.clear();
        getContainer().inscricaoEstadual.sendKeys(getEntity().getInscricaoEstadual());

        log.debug(Constants.MGS_INSERIDO, "LATITUDE", getEntity().getLatitude());
        getContainer().latitude.clear();
        getContainer().latitude.sendKeys(getEntity().getLatitude());

        log.debug(Constants.MGS_INSERIDO, "LONGITUDE", getEntity().getLongitude());
        getContainer().longitude.clear();
        getContainer().longitude.sendKeys(getEntity().getLongitude());

        log.debug(Constants.MGS_INSERIDO, "LOCALIDADE LIVRO", getEntity().getLocalidadeLivro());
        getContainer().localidadeLivro.sendKeys(getEntity().getLocalidadeLivro());

        log.debug(Constants.MGS_INSERIDO, "CAPACIDADE ARMAZENAMENTO", getEntity().getCapacidadeArmazenamento());
        getContainer().capacidadeArmazenamento.sendKeys(getEntity().getCapacidadeArmazenamento());

        log.debug(Constants.MGS_INSERIDO, "RESPONSAVEL TECNICO (RT)", getEntity().getResponsavelTecnico());
        getContainer().rt.sendKeys(getEntity().getResponsavelTecnico());
        BrowserDriver.waitForElement(getContainer().rt);
        getContainer().rtAutoComplete.click();

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }

}
