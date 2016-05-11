package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.view;

import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.containers.UnidadeProducaoPageContainerHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.entity.UnidadeProducao;
import gov.goias.agrodefesa.utils.Constants;

public class UnidadeProducaoViewHome extends BaseViewHomeImpl {

    public UnidadeProducaoViewHome(Object entity) {
        super(entity, UnidadeProducaoPageContainerHome.class);
    }

    private UnidadeProducao getEntity() {
        return (UnidadeProducao) entity;
    }

    private UnidadeProducaoPageContainerHome getContainer() {
        return (UnidadeProducaoPageContainerHome) container;
    }

    @Override
    public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "CPF PRODUTOR", getEntity().getTermoFiscalizacao().getPropriedade().getPessoa().getCpfCnpj());
        getContainer().cnpjProdutor.sendKeys(getEntity().getTermoFiscalizacao().getPropriedade().getPessoa().getCpfCnpj());

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
    }

}
