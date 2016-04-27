package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UnidadeConsolidacaoPageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "cnpj")
    public WebElement cnpj;


}
