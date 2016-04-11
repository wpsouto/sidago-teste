package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmpresaPageContainerAprovacao {

    @FindBy(how = How.ID, using = "aprovar")
    public WebElement home;

    @FindBy(how = How.XPATH, using = "//*[@id=\"divEdicao\"]/table/tbody")
    public WebElement table;

/*
    @FindBy(how = How.ID, using = "aprovar")
    public WebElement aprovar;
*/

}
