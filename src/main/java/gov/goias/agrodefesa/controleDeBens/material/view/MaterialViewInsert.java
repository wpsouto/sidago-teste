package gov.goias.agrodefesa.controleDeBens.material.view;

import gov.goias.agrodefesa.base.view.BaseView;
import gov.goias.agrodefesa.base.view.InsertView;
import gov.goias.agrodefesa.controleDeBens.material.containers.MaterialPageContainerInsert;
import gov.goias.agrodefesa.controleDeBens.material.entity.Material;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class MaterialViewInsert extends BaseView implements InsertView {

    public MaterialViewInsert(Object entity) {
        super(entity, MaterialPageContainerInsert.class);
    }

    private Material getEntity() {
        return (Material) entity;
    }

    private MaterialPageContainerInsert getContainer() {
        return (MaterialPageContainerInsert) container;
    }

    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        log.debug(Constants.MGS_INSERIDO, "NOME MATERIAL", getEntity().getNome());
        getContainer().nomeMaterial.sendKeys(getEntity().getNome());

        log.debug(Constants.MGS_INSERIDO, "TIPO MATERIAL", getEntity().getTipoMaterial());
        BrowserDriver.selectByVisibleText(getContainer().tipoMaterial, getEntity().getTipoMaterial());

        log.debug(Constants.MGS_INSERIDO, "UNIDADE MEDIDA", getEntity().getUnidadeMedida());
        BrowserDriver.selectByVisibleText(getContainer().unidadeMedida, getEntity().getUnidadeMedida());

        log.debug(Constants.MGS_INSERIDO, "ESTOQUE MINIMO", getEntity().getEstoqueMinimo());
        getContainer().estoqueMinimo.sendKeys(getEntity().getEstoqueMinimo());

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }

    public void aviso() {
        log.debug(Constants.MGS_MENSAGEM, Constants.REGISTRO_INSERIDO_COM_SUCESSO);
        BrowserDriver.waitForText(getContainer().aviso, Constants.REGISTRO_INSERIDO_COM_SUCESSO);
        getContainer().ok.click();
    }

    public void salvarTodosCamposVazios() {
        getContainer().salvar.click();
        BrowserDriver.screenshot();

        BrowserDriver.waitForText(getContainer().validacao, Constants.MGS_ERRO_VALIDAR_INSERIR);
        getContainer().ok.click();
        BrowserDriver.waitForText(getContainer().nomeMaterialErro, Constants.MGS_ERRO_CAMPO_OBRIGATORIO);
        BrowserDriver.waitForText(getContainer().tipoMaterialErro, Constants.MGS_ERRO_CAMPO_OBRIGATORIO);
        BrowserDriver.waitForText(getContainer().unidadeMedidaErro, Constants.MGS_ERRO_CAMPO_OBRIGATORIO);
    }

}
