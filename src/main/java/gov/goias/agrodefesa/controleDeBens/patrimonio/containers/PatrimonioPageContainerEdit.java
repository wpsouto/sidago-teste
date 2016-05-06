package gov.goias.agrodefesa.controleDeBens.patrimonio.containers;

import gov.goias.agrodefesa.base.containers.PageContainerEdit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PatrimonioPageContainerEdit extends PageContainerEdit {

    @FindBy(how = How.ID, using = "ds_patrimonio")
    public WebElement descricao;

}
