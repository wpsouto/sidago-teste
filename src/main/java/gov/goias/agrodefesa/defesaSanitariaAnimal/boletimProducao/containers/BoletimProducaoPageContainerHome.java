package gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BoletimProducaoPageContainerHome {

    @FindBy(how = How.ID, using = "bt_pesquisar")
    public WebElement home;

    @FindBy(how = How.XPATH, using = "//*[@id=\"icons\"]/li[1]/span")
    public WebElement incluirRegistro;

    @FindBy(how = How.ID, using = "doc_produtor")
    public WebElement cpfCnpjProdutor;

    @FindBy(how = How.ID, using = "bt_pesquisar")
    public WebElement pesquisar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]")
    public WebElement gridRow;

    @FindBy(how = How.CSS, using = "#listagemOperacao > #icons > li.ui-state-default.ui-corner-all > span.ui-icon.ui-icon-close")
    public WebElement cancelar;

    @FindBy(how = How.ID, using = "boxDelete")
    public WebElement boxDelete;

    @FindBy(how = How.XPATH, using = "//button[@type='button']")
    public WebElement cancelarBoletimProducao;

    @FindBy(how = How.XPATH, using = "//*[@id=\"boxDelete\"]/h3[1]")
    public WebElement mesagem;

}
