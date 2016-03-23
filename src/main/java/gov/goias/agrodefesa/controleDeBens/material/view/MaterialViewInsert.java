package gov.goias.agrodefesa.controleDeBens.material.view;

import gov.goias.agrodefesa.controleDeBens.material.containers.MaterialInsertPageContainer;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class MaterialViewInsert {
	private static final MaterialInsertPageContainer conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), MaterialInsertPageContainer.class);

    public static void isDisplayedCheck(){
		BrowserDriver.waitForElement(conteiner.tipoMaterial);
		conteiner.home.isDisplayed();
	}

    public static void nomeMaterial(String valor){
        conteiner.nomeMaterial.clear();
        conteiner.nomeMaterial.sendKeys(valor);
    }

    public static void checkErroNomeMaterial(){
        BrowserDriver.waitForElement(conteiner.nomeMaterialErro);
        Assert.assertEquals(conteiner.nomeMaterialErro.getText(), Constants.ERRO_CAMPO_OBRIGATORIO);
    }

    public static void tipoMaterial(String valor) {
        BrowserDriver.selectByVisibleText(conteiner.tipoMaterial, valor);
    }

    public static void checkErroTipoMaterial(){
        BrowserDriver.waitForElement(conteiner.tipoMaterialErro);
        Assert.assertEquals(conteiner.tipoMaterialErro.getText(), Constants.ERRO_CAMPO_OBRIGATORIO);
    }

    public static void unidadeMedida(String valor) {
        BrowserDriver.selectByVisibleText(conteiner.unidadeMedida, valor);
    }

    public static void checkErroUniadeMedida(){
        BrowserDriver.waitForElement(conteiner.unidadeMedidaErro);
        Assert.assertEquals(conteiner.unidadeMedidaErro.getText(), Constants.ERRO_CAMPO_OBRIGATORIO);
    }

    public static void estoqueMinimo(String valor) {
        conteiner.estoqueMinimo.clear();
        conteiner.estoqueMinimo.sendKeys(valor);
    }

    public static void salvar() {
        BrowserDriver.waitForElement(conteiner.salvar);
        conteiner.salvar.click();
    }

    public static void aviso(String valor) {
        BrowserDriver.waitForElement(conteiner.aviso);
        Assert.assertEquals(conteiner.aviso.getText(), valor);
        conteiner.ok.click();
    }

    public static void validacao(String valor) {
        BrowserDriver.waitForElement(conteiner.validacao);
        Assert.assertEquals(conteiner.validacao.getText(), valor);
    }

}
