package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewEditImpl;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.containers.EmpresaClassificacaoPageContainerEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.entity.Classificacao;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = EmpresaClassificacaoPageContainerEdit.class)
public class EmpresaClassificacaoViewEdit extends BaseViewEditImpl {

    private Classificacao getEntity() {
        return (Classificacao) entity;
    }

    private EmpresaClassificacaoPageContainerEdit getContainer() {
        return (EmpresaClassificacaoPageContainerEdit) container;
    }

    @Override
    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        log.debug(Constants.MGS_INSERIDO, "CLASSIFICACAO", getEntity().getDescricao());
        getContainer().classificacao.sendKeys(getEntity().getDescricao());

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        getContainer().salvar.click();
    }

}
