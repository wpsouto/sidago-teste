package gov.goias.agrodefesa.base.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageContainerBase {

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Ok']")
    public WebElement ok;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Confirmar']")
    public WebElement confirmar;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Concordo']")
    public WebElement concordo;

    @FindBy(how = How.CSS, using = "a.ui-state-default.ui-state-highlight")
    public WebElement now;

}
