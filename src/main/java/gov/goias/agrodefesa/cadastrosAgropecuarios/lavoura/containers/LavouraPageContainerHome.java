package gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LavouraPageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "nu_inscricaoestadual")
    public WebElement inscricaoEstadual;

}
