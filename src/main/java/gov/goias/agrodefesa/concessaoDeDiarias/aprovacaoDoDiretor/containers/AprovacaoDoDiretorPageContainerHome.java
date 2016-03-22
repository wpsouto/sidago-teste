package gov.goias.agrodefesa.concessaoDeDiarias.aprovacaoDoDiretor.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AprovacaoDoDiretorPageContainerHome {

    @FindBy(how = How.ID, using = "numero")
    public WebElement home;

    @FindBy(how = How.ID, using = "numero")
    public WebElement numero;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[3]")
    public WebElement gridRow;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[9]/div/ul/li[2]")
    public WebElement aprovar;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Concordo']")
    public WebElement concordo;

}
