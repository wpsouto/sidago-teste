package gov.goias.agrodefesa.concessaoDeDiarias.assinaturaDeDiarias.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AssinaturaDeDiariasPageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "nu_diaria")
    public WebElement numeroDaDiaria;

    @FindBy(how = How.XPATH, using = "//*[@id=\"conteudo\"]/div[1]/table/tbody/tr")
    public WebElement gridRow;

    @FindBy(how = How.CSS, using = "span.ui-icon.ui-icon-zoomin")
    public WebElement gridInformacoesDetalhadas;

    @FindBy(how = How.ID, using = "boxDetalhar")
    public WebElement assinarHome;

    @FindBy(how = How.ID, using = "assinar_diaria")
    public WebElement assinar;


}
