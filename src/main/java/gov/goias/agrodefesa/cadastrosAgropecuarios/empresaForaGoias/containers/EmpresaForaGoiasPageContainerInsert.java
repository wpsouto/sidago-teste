package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.containers;

import gov.goias.agrodefesa.base.containers.PageContainerInsert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmpresaForaGoiasPageContainerInsert extends PageContainerInsert {

    @FindBy(how = How.ID, using = "numero")
    public WebElement numeroDocumento;

    @FindBy(how = How.ID, using = "id_classificacao_foragoias")
    public WebElement classificacao;

}
