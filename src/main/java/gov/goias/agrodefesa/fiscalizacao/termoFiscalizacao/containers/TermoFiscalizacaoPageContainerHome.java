package gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TermoFiscalizacaoPageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "dt_criacaotermofiscalizacao")
    public WebElement dataCriacao;

    @FindBy(how = How.CSS, using = "a.ui-state-default.ui-state-highlight")
    public WebElement now;

    public void now(WebElement datePicker){
        datePicker.click();
        BrowserDriver.waitForElement(now);
        now.click();
        BrowserDriver.waitForElementIsNotPresent(By.cssSelector("a.ui-state-default.ui-state-highlight"));
    }

}
