package gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PessoaPageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "cpfcnpj")
    public WebElement cpfCnpj;

}
