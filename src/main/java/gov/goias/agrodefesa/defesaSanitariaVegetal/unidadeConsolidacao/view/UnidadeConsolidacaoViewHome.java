package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.view;

import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.containers.UnidadeConsolidacaoPageContainerHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.entity.UnidadeConsolidacao;
import gov.goias.agrodefesa.utils.Constants;

public class UnidadeConsolidacaoViewHome extends BaseViewHomeImpl {

    public UnidadeConsolidacaoViewHome(Object entity) {
        super(entity, UnidadeConsolidacaoPageContainerHome.class);
    }

    private UnidadeConsolidacao getEntity() {
        return (UnidadeConsolidacao) entity;

    }

    private UnidadeConsolidacaoPageContainerHome getContainer() {
        return (UnidadeConsolidacaoPageContainerHome) container;

    }

    @Override
    public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "CNPJ",getEntity().getPessoa().getCpfCnpj());
        getContainer().cnpj.sendKeys(getEntity().getPessoa().getCpfCnpj());

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
    }

}
