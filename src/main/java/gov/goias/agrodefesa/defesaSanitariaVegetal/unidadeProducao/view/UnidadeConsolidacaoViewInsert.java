package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.view;

import gov.goias.agrodefesa.base.view.BaseView;
import gov.goias.agrodefesa.base.view.InsertView;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.containers.UnidadeConsolidacaoPageContainerInsert;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.entity.UnidadeProducao;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class UnidadeConsolidacaoViewInsert extends BaseView implements InsertView {

    public UnidadeConsolidacaoViewInsert(Object entity) {
        super(entity, UnidadeConsolidacaoPageContainerInsert.class);
    }

    private UnidadeProducao getEntity() {
        return (UnidadeProducao) entity;

    }

    private UnidadeConsolidacaoPageContainerInsert getContainer() {
        return (UnidadeConsolidacaoPageContainerInsert) container;

    }
    
    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);
        getContainer().home.isDisplayed();

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
        BrowserDriver.waitForElement(getContainer().pessoaHome);
/*
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

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
*/
        getContainer().salvar.click();
    }

    public void aviso() {
        log.debug(Constants.MGS_MENSAGEM, Constants.REGISTRO_INSERIDO_COM_SUCESSO);
        BrowserDriver.waitForText(getContainer().aviso, Constants.REGISTRO_INSERIDO_COM_SUCESSO);
        getContainer().ok.click();
    }

}
