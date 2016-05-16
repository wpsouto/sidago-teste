package gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.containers;

import gov.goias.agrodefesa.base.containers.PageContainerEdit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PrestacaoDeContasPageContainerEdit  extends PageContainerEdit {

    @FindBy(how = How.ID, using = "ds_atividades")
    public WebElement atividades;

    @FindBy(how = How.XPATH, using = "//input[@type='file']")
    public WebElement upload;

}
