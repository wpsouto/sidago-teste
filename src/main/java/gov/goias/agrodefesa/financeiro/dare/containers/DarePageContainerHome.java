package gov.goias.agrodefesa.financeiro.dare.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DarePageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "cpf")
    public WebElement cpf;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-3\"]/li[1]")
    public WebElement cpfAutoComplete;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[2]")
    public WebElement numero;

}
