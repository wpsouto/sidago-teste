package gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.view;

import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.containers.CadastroLotePageContainerHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.entity.CadastroLote;
import gov.goias.agrodefesa.utils.Constants;

public class CadastroLoteViewHome extends BaseViewHomeImpl {

    public CadastroLoteViewHome(Object entity) {
        super(entity, CadastroLotePageContainerHome.class);
    }

    private CadastroLote getEntity() {
        return (CadastroLote) entity;

    }

    private CadastroLotePageContainerHome getContainer() {
        return (CadastroLotePageContainerHome) container;

    }

    @Override
    public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "NOME UC",getEntity().getUnidadeConsolidacao().getPessoa().getCpfCnpj());
        getContainer().nomeUC.sendKeys(getEntity().getUnidadeConsolidacao().getPessoa().getCpfCnpj());

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
    }
}
