package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.containers.EmpresaForaGoiasPageContainerInsert;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.entity.EmpresaForaGoias;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = EmpresaForaGoiasPageContainerInsert.class)
public class EmpresaForaGoiasViewInsert extends BaseViewInsertImpl {

    private EmpresaForaGoias getEntity() {
        return (EmpresaForaGoias) entity;
    }

    private EmpresaForaGoiasPageContainerInsert getContainer() {
        return (EmpresaForaGoiasPageContainerInsert) container;
    }

    @Override
    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        log.debug(Constants.MGS_INSERIDO, "NUMERO DOCUMENTO", getEntity().getEmpresa().getInformacaoObrigatoria().getCpfCnpj());
        getContainer().numeroDocumento.sendKeys(getEntity().getEmpresa().getInformacaoObrigatoria().getCpfCnpj());

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
        BrowserDriver.waitForElement(getContainer().selecionar);
        getContainer().selecionar.click();

        log.debug(Constants.MGS_INSERIDO, "CLASSIFICACAO", getEntity().getClassificacao().getDescricao());
        BrowserDriver.selectByVisibleText(getContainer().classificacao, getEntity().getClassificacao().getDescricao());

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }

}
