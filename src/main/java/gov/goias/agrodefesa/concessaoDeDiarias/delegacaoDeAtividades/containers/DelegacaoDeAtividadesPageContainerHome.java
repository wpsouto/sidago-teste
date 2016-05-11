package gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DelegacaoDeAtividadesPageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "numero")
    public WebElement numero;

    @FindBy(how = How.ID, using = "solicitante")
    public WebElement nomeDoServidor;

    @FindBy(how = How.ID, using = "dt_inicio")
    public WebElement dataSaida;

    @FindBy(how = How.ID, using = "dt_final")
    public WebElement dataChegada;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[2]")
    public WebElement gridNumero;


}
