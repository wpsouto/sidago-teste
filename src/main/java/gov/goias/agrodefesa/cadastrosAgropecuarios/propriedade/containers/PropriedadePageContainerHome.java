package gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PropriedadePageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "cnpjcpf")
    public WebElement cnpjCpf;

}
