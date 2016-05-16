package gov.goias.agrodefesa.controleDeBens.almoxarifado.containers;

import gov.goias.agrodefesa.base.containers.PageContainerEdit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AlmoxarifadoPageContainerEdit extends PageContainerEdit {

    @FindBy(how = How.ID, using = "ds_almoxarifado")
    public WebElement descricao;

}
