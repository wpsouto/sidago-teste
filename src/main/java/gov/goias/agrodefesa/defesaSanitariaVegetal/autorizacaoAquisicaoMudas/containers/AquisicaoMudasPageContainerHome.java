package gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AquisicaoMudasPageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "origem")
    public WebElement cpfCnpjOrigem;


}
