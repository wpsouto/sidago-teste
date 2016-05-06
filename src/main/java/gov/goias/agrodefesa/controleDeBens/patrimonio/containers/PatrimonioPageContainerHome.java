package gov.goias.agrodefesa.controleDeBens.patrimonio.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PatrimonioPageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "nu_patrimonio")
    public WebElement numeroPatrimonio;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-2\"]/li[1]")
    public WebElement numeroPatrimonioAutoComplete;

    @FindBy(how = How.ID, using = "nome_lotacao")
    public WebElement lotacao;

}
