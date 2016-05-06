package gov.goias.agrodefesa.controleDeBens.material.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MaterialPageContainerHome extends PageContainerHome {

	@FindBy(how = How.ID, using = "no_material")
    public WebElement nomeMaterial;

}
