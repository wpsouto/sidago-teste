package gov.goias.agrodefesa.concessaoDeDiarias.cienciaDoServidor.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CienciaDoServidorPageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "numero")
    public WebElement numero;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[2]")
    public WebElement gridNumero;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[6]/div/ul/li")
    public WebElement ciencia;

}
