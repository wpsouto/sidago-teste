package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmpresaPageContainerHome extends PageContainerHome{

    @FindBy(how = How.ID, using = "numero")
    public WebElement documento;

}
