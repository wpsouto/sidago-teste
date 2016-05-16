package gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PrestacaoDeContasPageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "numero")
    public WebElement numeroDaDiaria;

}
