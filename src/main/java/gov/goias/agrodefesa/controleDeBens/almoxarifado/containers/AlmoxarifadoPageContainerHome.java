package gov.goias.agrodefesa.controleDeBens.almoxarifado.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AlmoxarifadoPageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "ds_almoxarifado")
    public WebElement descricao;

    @FindBy(how = How.ID, using = "no_lotacao")
    public WebElement lotacao;

}
