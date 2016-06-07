package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.containers.EmpresaClassificacaoPageContainerInsert;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.entity.Classificacao;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = EmpresaClassificacaoPageContainerInsert.class)
public class EmpresaClassificacaoViewInsert extends BaseViewInsertImpl {

    private Classificacao getEntity() {
        return (Classificacao) entity;
    }

    private EmpresaClassificacaoPageContainerInsert getContainer() {
        return (EmpresaClassificacaoPageContainerInsert) container;
    }

    @Override
    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        log.debug(Constants.MGS_INSERIDO, "TIPO CLASSIFICACAO", getEntity().getTipo_classificacao());
        BrowserDriver.selectByVisibleText(getContainer().tipoClassificacao, getEntity().getTipo_classificacao());

        log.debug(Constants.MGS_INSERIDO, "CLASSIFICACAO", getEntity().getDescricao());
        getContainer().classificacao.sendKeys(getEntity().getDescricao());

        log.debug(Constants.MGS_INSERIDO, "IDENTIFICACAO", getEntity().getIdentificacao());
        BrowserDriver.selectByVisibleText(getContainer().identificao, getEntity().getIdentificacao());

        salvar();
    }
}
