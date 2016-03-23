package gov.goias.agrodefesa.controleDeBens.material.view;

import gov.goias.agrodefesa.controleDeBens.material.containers.MaterialHomePageContainer;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.support.PageFactory;

public class MaterialViewHome {
    private static final MaterialHomePageContainer container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), MaterialHomePageContainer.class);

    public static void isDisplayedCheck() {
        BrowserDriver.waitForElement(container.home);
        container.home.isDisplayed();
    }

    public static void incluirRegistro() {
        BrowserDriver.waitForElement(container.incluirRegistro);
        container.incluirRegistro.click();
    }

    public static void nomeMaterial(String valor) {
        container.nomeMaterial.clear();
        container.nomeMaterial.sendKeys(valor);
    }

    public static void pesquisar() {
        container.pesquisar.click();
    }

    public static void isDisplayedGridPesquisar() {
        BrowserDriver.waitForElement(container.gridRow);
        container.gridRow.isDisplayed();
    }

    public static void alterar() {
        container.alterar.click();
    }

}
