package gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BoletimProducaoPageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "doc_produtor")
    public WebElement cpfCnpjProdutor;

    @FindBy(how = How.ID, using = "boxDelete")
    public WebElement boxDelete;

    @FindBy(how = How.XPATH, using = "//button[@type='button']")
    public WebElement cancelarBoletimProducao;

}
