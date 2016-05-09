package gov.goias.agrodefesa.base.containers;

import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageContainerBase {

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Ok']")
    public WebElement ok;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Confirmar']")
    public WebElement confirmar;

    @FindBy(how = How.CSS, using = "a.ui-state-default.ui-state-highlight")
    private WebElement now;

    public void now(WebElement datePicker){
        //datePicker.clear();
        //BrowserDriver.waitForElement(datePicker);
        datePicker.click();
        BrowserDriver.waitForElement(this.now);
        this.now.click();
        BrowserDriver.waitForElementIsNotPresent(this.now);
    }

}
