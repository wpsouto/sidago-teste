package gov.goias.agrodefesa.defesaSanitariaVegetal.certificadoFitossanitarioOrigem.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CertificadoFitossanitarioOrigemPageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "no_fantasia")
    public WebElement nomePropriedade;

}
