package gov.goias.agrodefesa.controleDeBens.tranferencia.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TransferenciaPageContainerHome {

    @FindBy(how = How.ID, using = "nu_patrimonio")
    public WebElement home;

    @FindBy(how = How.ID, using = "nu_patrimonio")
    public WebElement numeroPatrimonio;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-2\"]/li[1]")
    public WebElement numeroPatrimonioAutoComplete;

    @FindBy(how = How.XPATH, using = "//*[@id=\"icons\"]/li[1]/span")
    public WebElement incluirRegistro;

    @FindBy(how = How.ID, using = "bt_limparpesquisa")
    public WebElement limpar;

    @FindBy(how = How.ID, using = "bt_pesquisar")
    public WebElement pesquisar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[2]")
    public WebElement gridRow;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[11]/div/ul/li[5]")
    public WebElement confirmar;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/div[11]/div/button[1]/span")
    public WebElement confirmarMsg;

}
