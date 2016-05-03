package gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TermoFiscalizacaoPageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "dt_criacaotermofiscalizacao")
    public WebElement dataCriacao;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[2]")
    public WebElement serie;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[3]")
    public WebElement numero;

}
