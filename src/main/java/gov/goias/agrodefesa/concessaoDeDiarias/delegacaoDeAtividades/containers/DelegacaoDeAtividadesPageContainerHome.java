package gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.containers;

import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DelegacaoDeAtividadesPageContainerHome {

    @FindBy(how = How.ID, using = "numero")
    public WebElement home;

    @FindBy(how = How.ID, using = "numero")
    public WebElement numero;

    @FindBy(how = How.ID, using = "solicitante")
    public WebElement nomeDoServidor;

    @FindBy(how = How.ID, using = "dt_inicio")
    public WebElement dataSaida;

    @FindBy(how = How.ID, using = "dt_final")
    public WebElement dataChegada;

    @FindBy(how = How.XPATH, using = "//*[@id=\"icons\"]/li[1]/span")
    public WebElement incluirRegistro;

    @FindBy(how = How.ID, using = "bt_limparpesquisa")
    public WebElement limpar;

    @FindBy(how = How.ID, using = "bt_pesquisar")
    public WebElement pesquisar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[3]")
    public WebElement gridNomeServidor;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[2]")
    public WebElement gridNumero;


}
