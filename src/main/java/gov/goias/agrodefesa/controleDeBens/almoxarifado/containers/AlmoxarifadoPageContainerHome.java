package gov.goias.agrodefesa.controleDeBens.almoxarifado.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AlmoxarifadoPageContainerHome {

    @FindBy(how = How.ID, using = "ds_almoxarifado")
    public WebElement home;

    @FindBy(how = How.ID, using = "ds_almoxarifado")
    public WebElement descricao;

    @FindBy(how = How.ID, using = "no_lotacao")
    public WebElement lotacao;

    @FindBy(how = How.XPATH, using = "//*[@id=\"icons\"]/li[1]/span")
    public WebElement incluirRegistro;

    @FindBy(how = How.ID, using = "bt_pesquisar")
    public WebElement pesquisar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]")
    public WebElement gridRow;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[7]/div/ul/li[2]")
    public WebElement alterar;

}
