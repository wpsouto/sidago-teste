package gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PrestacaoDeContasPageContainerHome {

    @FindBy(how = How.ID, using = "numero")
    public WebElement home;

    @FindBy(how = How.ID, using = "numero")
    public WebElement numeroDaDiaria;

    @FindBy(how = How.ID, using = "bt_pesquisar")
    public WebElement pesquisar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[2]")
    public WebElement gridNumero;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[8]/div/ul/li[1]")
    public WebElement gridPrestarContas;

}
