package gov.goias.agrodefesa.base.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageContainerEdit extends PageContainerBase {

    @FindBy(how = How.ID, using = "bt_alterar")
    public WebElement home;

    @FindBy(how = How.ID, using = "bt_alterar")
    public WebElement salvar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"aviso\"]/div/p/strong")
    public WebElement aviso;

}
