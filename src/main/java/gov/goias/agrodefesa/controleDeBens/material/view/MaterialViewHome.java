package gov.goias.agrodefesa.controleDeBens.material.view;

import gov.goias.agrodefesa.controleDeBens.material.containers.MaterialHomePageContainer;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class MaterialViewHome {
    private static final Logger LOGGER = Logger.getLogger(MaterialViewHome.class.getName());
    private static final MaterialHomePageContainer container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), MaterialHomePageContainer.class);

    public static void isDisplayedCheck() {
        LOGGER.info("Verificando página de Material é exibida");
        BrowserDriver.waitForElement(container.home);
        container.home.isDisplayed();
    }

    public static void incluirRegistro() {
        LOGGER.info("Exibindo Incluir Registro Material");
        BrowserDriver.waitForElement(container.incluirRegistro);
        container.incluirRegistro.click();
    }

    public static void nomeMaterial(String valor) {
        LOGGER.info("Inserindo valor no campo Nome");
        container.nomeMaterial.clear();
        container.nomeMaterial.sendKeys(valor);
    }

    public static void pesquisar() {
        LOGGER.info("Pesquisando");
        container.pesquisar.click();
    }

    public static void isDisplayedGridPesquisar() {
        LOGGER.info("Validando Pesquisa");
        BrowserDriver.waitForElement(container.gridRow);
        container.gridRow.isDisplayed();
    }

    public static void alterar() {
        LOGGER.info("Click em gridAlterar");
        container.alterar.click();
    }

}
