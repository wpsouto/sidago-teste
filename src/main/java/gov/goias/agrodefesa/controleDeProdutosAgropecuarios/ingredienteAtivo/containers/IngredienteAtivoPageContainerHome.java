package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IngredienteAtivoPageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "no_ingredienteativo")
    public WebElement ingrediente;

}
