package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmpresaPageContainerEdit {

    @FindBy(how = How.ID, using = "bt_salvarsemenviar")
    public WebElement home;

    @FindBy(how = How.ID, using = "bt_salvarsemenviar")
    public WebElement salvar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"aviso\"]/div/p/strong")
    public WebElement aviso;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Ok']")
    public WebElement ok;


}
