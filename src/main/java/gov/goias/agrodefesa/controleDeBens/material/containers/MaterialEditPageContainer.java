package gov.goias.agrodefesa.controleDeBens.material.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MaterialEditPageContainer {

    @FindBy(how = How.ID, using = "tp_material")
    public WebElement home;

    @FindBy(how = How.ID, using = "no_material")
    public WebElement nomeMaterial;

    @FindBy(how = How.ID, using = "bt_alterar")
    public WebElement salvar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"aviso\"]/div/p/strong")
    public WebElement aviso;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Ok']")
    public WebElement ok;


}
