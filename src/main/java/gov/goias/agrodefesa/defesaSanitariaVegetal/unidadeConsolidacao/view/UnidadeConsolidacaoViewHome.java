package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.containers.UnidadeConsolidacaoPageContainerHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.entity.UnidadeConsolidacao;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = UnidadeConsolidacaoPageContainerHome.class)
public class UnidadeConsolidacaoViewHome extends BaseViewHomeImpl {

    private UnidadeConsolidacao getEntity() {
        return (UnidadeConsolidacao) entity;

    }

    private UnidadeConsolidacaoPageContainerHome getContainer() {
        return (UnidadeConsolidacaoPageContainerHome) container;

    }

    @Override
    public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "CNPJ", getEntity().getPessoa().getCpfCnpj());
        getContainer().cnpj.sendKeys(getEntity().getPessoa().getCpfCnpj());

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
    }

}
