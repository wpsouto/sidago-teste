package gov.goias.agrodefesa.admin.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageContainer {

	@FindBy(how = How.XPATH, using = "//*[@id=\"cabecalho-identificacao\"]/ul/li[2]")
    public WebElement homePageTitle;

    @FindBy(how = How.ID, using = "link_logout")
    public WebElement logout;

}
