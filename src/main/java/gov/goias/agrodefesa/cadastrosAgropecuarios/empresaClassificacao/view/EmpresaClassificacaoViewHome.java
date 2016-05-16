package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.view;

import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.containers.EmpresaClassificacaoPageContainerHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.entity.Classificacao;
import gov.goias.agrodefesa.utils.Constants;

public class EmpresaClassificacaoViewHome extends BaseViewHomeImpl {

    public EmpresaClassificacaoViewHome(Object entity) {
        super(entity, EmpresaClassificacaoPageContainerHome.class);
    }

    private Classificacao getEntity() {
        return (Classificacao) entity;
    }

    private EmpresaClassificacaoPageContainerHome getContainer() {
        return (EmpresaClassificacaoPageContainerHome) container;
    }

    @Override
    public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "CLASSIFICACAO", getEntity().getDescricao());
        getContainer().classificacao.sendKeys(getEntity().getDescricao());
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
    }

}
