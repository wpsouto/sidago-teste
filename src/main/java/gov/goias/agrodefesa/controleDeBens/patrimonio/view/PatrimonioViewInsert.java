package gov.goias.agrodefesa.controleDeBens.patrimonio.view;

import gov.goias.agrodefesa.base.view.BaseView;
import gov.goias.agrodefesa.base.view.InsertView;
import gov.goias.agrodefesa.controleDeBens.patrimonio.containers.PatrimonioPageContainerInsert;
import gov.goias.agrodefesa.controleDeBens.patrimonio.entity.Patrimonio;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class PatrimonioViewInsert extends BaseView implements InsertView {

    public PatrimonioViewInsert(Object entity) {
        super(entity, PatrimonioPageContainerInsert.class);
    }

    private Patrimonio getEntity() {
        return (Patrimonio) entity;
    }

    private PatrimonioPageContainerInsert getContainer() {
        return (PatrimonioPageContainerInsert) container;
    }

    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        log.debug(Constants.MGS_INSERIDO, "NUMERO PATRIMONIO AGRODEFESA", getEntity().getNumeroPatrimonio());
        getContainer().numeroPatrimonioAgrodefesa.sendKeys(getEntity().getNumeroPatrimonio());

        log.debug(Constants.MGS_INSERIDO, "DESCRICAO", getEntity().getDescricao());
        getContainer().descricao.sendKeys(getEntity().getDescricao());

        log.debug(Constants.MGS_INSERIDO, "FORNECEDOR", getEntity().getFornecedor());
        getContainer().fornecedor.sendKeys(getEntity().getFornecedor());
        BrowserDriver.waitForElement(getContainer().fornecedorAutoComplete);
        getContainer().fornecedorAutoComplete.click();

        log.debug(Constants.MGS_INSERIDO, "ORIGEM RECURSO", getEntity().getOrigemRecurso());
        BrowserDriver.selectByVisibleText(getContainer().origemRecurso, getEntity().getOrigemRecurso());

        log.debug(Constants.MGS_INSERIDO, "TIPO AQUISICAO", getEntity().getTipoAquisicao());
        BrowserDriver.selectByVisibleText(getContainer().tipoAquisicao, getEntity().getTipoAquisicao());

        log.debug(Constants.MGS_INSERIDO, "ESPECIE", getEntity().getEspecie());
        BrowserDriver.selectByVisibleText(getContainer().especie, getEntity().getEspecie());

        log.debug(Constants.MGS_INSERIDO, "CONSERVACAO", getEntity().getConservacao());
        BrowserDriver.selectByVisibleText(getContainer().conservacao, getEntity().getConservacao());

        log.debug(Constants.MGS_INSERIDO, "LOTACAO", getEntity().getLotacao());
        getContainer().lotacao.sendKeys(getEntity().getLotacao());
        BrowserDriver.waitForElement(getContainer().lotacaoAutoComplete);
        getContainer().lotacaoAutoComplete.click();

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }

    public void aviso() {
        log.debug(Constants.MGS_MENSAGEM, Constants.REGISTRO_INSERIDO_COM_SUCESSO);
        BrowserDriver.waitForText(getContainer().aviso, Constants.REGISTRO_INSERIDO_COM_SUCESSO);
        getContainer().ok.click();
    }


}
