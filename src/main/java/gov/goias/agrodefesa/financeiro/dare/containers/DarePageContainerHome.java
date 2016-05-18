package gov.goias.agrodefesa.financeiro.dare.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DarePageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "cpf")
    public WebElement cpf;


}