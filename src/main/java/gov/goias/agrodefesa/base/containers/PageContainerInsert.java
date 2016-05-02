package gov.goias.agrodefesa.base.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageContainerInsert  {

    @FindBy(how = How.ID, using = "bt_inserir")
    public WebElement home;

    @FindBy(how = How.ID, using = "bt_inserir")
    public WebElement salvar;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Confirmar']")
    public WebElement confirmar;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Ok']")
    public WebElement ok;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Sim']")
    public WebElement sim;

    @FindBy(how = How.ID, using = "aviso")
    public WebElement aviso;

    @FindBy(how = How.LINK_TEXT, using = "Pesquisar")
    public WebElement pesquisar;

    @FindBy(how = How.LINK_TEXT, using = "Selecionar")
    public WebElement selecionar;


}
