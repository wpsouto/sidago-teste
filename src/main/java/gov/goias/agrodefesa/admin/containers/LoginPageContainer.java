package gov.goias.agrodefesa.admin.containers;

import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageContainer {

	@FindBy(how = How.ID, using = "usuario")
    private WebElement home;
	
	@FindBy(how = How.ID, using = "usuario")
    public WebElement usernameInput;

	@FindBy(how = How.ID, using = "senha")
    public WebElement passwordInput;
	
	@FindBy(how = How.ID, using = "login")
    public WebElement submitButton;

    public void loginHome(){
        if (BrowserDriver.isElementPresent("link_logout")){
            BrowserDriver.getCurrentDriver().findElement(By.id("link_logout")).click();
            BrowserDriver.closeAlert();
        }
        BrowserDriver.waitForElement(home);
        home.isDisplayed();
    }

    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submitButton.click();
    }

}
