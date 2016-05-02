package gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CadastroLotePageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "nome")
    public WebElement nomeUC;


}
