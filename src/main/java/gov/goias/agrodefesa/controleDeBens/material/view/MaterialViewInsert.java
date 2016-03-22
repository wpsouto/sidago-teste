package gov.goias.agrodefesa.controleDeBens.material.view;

import gov.goias.agrodefesa.controleDeBens.material.containers.MaterialInsertPageContainer;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class MaterialViewInsert {
    private static final Logger LOGGER = Logger.getLogger(MaterialViewInsert.class.getName());
	private static final MaterialInsertPageContainer conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), MaterialInsertPageContainer.class);

    public static void isDisplayedCheck(){
		LOGGER.info("Verificando pagina Material - Incluir Registro e exibida");
		BrowserDriver.waitForElement(conteiner.tipoMaterial);
		conteiner.home.isDisplayed();
	}

    public static void nomeMaterial(String valor){
        LOGGER.info("Inserindo valor no campo Nome");
        conteiner.nomeMaterial.clear();
        conteiner.nomeMaterial.sendKeys(valor);
    }

    public static void checkErroNomeMaterial(){
        LOGGER.info("Validando erro no campo Nome Material");
        BrowserDriver.waitForElement(conteiner.nomeMaterialErro);
        Assert.assertEquals(conteiner.nomeMaterialErro.getText(), Constants.ERRO_CAMPO_OBRIGATORIO);
    }

    public static void tipoMaterial(String valor) {
        LOGGER.info("Inserindo valor no campo Tipo Material");
        BrowserDriver.getDropDownOption(conteiner.tipoMaterial, valor).click();
    }

    public static void checkErroTipoMaterial(){
        LOGGER.info("Validando erro no campo Tipo Material");
        BrowserDriver.waitForElement(conteiner.tipoMaterialErro);
        Assert.assertEquals(conteiner.tipoMaterialErro.getText(), Constants.ERRO_CAMPO_OBRIGATORIO);
    }

    public static void unidadeMedida(String valor) {
        LOGGER.info("Inserindo valor no campo Unidade Medida");
        BrowserDriver.getDropDownOption(conteiner.unidadeMedida, valor).click();
    }

    public static void checkErroUniadeMedida(){
        LOGGER.info("Validando erro no campo Unidade Medida");
        BrowserDriver.waitForElement(conteiner.unidadeMedidaErro);
        Assert.assertEquals(conteiner.unidadeMedidaErro.getText(), Constants.ERRO_CAMPO_OBRIGATORIO);
    }

    public static void estoqueMinimo(String valor) {
        LOGGER.info("Inserindo valor no campo Estoque Minimo");
        conteiner.estoqueMinimo.clear();
        conteiner.estoqueMinimo.sendKeys(valor);
    }

    public static void salvar() {
        LOGGER.info("Salvando os dados");
        BrowserDriver.waitForElement(conteiner.salvar);
        conteiner.salvar.click();
    }

    public static void aviso(String valor) {
        LOGGER.info("Mensagem de aviso");
        BrowserDriver.waitForElement(conteiner.aviso);
        Assert.assertEquals(conteiner.aviso.getText(), valor);
        conteiner.ok.click();
    }

    public static void validacao(String valor) {
        LOGGER.info("Mensagem de validação");
        BrowserDriver.waitForElement(conteiner.validacao);
        Assert.assertEquals(conteiner.validacao.getText(), valor);
    }

}
