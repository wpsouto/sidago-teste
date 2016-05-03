package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UnidadeProducaoPageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "cpf_produtor")
    public WebElement cnpjProdutor;


}
