package gov.goias.agrodefesa.controleDeBens.almoxarifado.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AlmoxarifadoPageContainerEdit {

    @FindBy(how = How.ID, using = "nome_almoxarifado_pai")
    public WebElement home;

    @FindBy(how = How.ID, using = "ds_almoxarifado")
    public WebElement descricao;

    @FindBy(how = How.ID, using = "bt_alterar")
    public WebElement salvar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"aviso\"]/div/p/strong")
    public WebElement aviso;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Ok']")
    public WebElement ok;


}
