package gov.goias.agrodefesa.concessaoDeDiarias.cienciaDoServidor.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CienciaDoServidorPageContainerHome {

    @FindBy(how = How.ID, using = "numero")
    public WebElement home;

    @FindBy(how = How.ID, using = "numero")
    public WebElement numero;

    @FindBy(how = How.ID, using = "bt_pesquisar")
    public WebElement pesquisar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[2]")
    public WebElement gridNumero;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[6]/div/ul/li")
    public WebElement ciencia;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Concordo']")
    public WebElement concordo;


}
