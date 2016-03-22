package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IngredienteAtivoPageContainerInsert {

    @FindBy(how = How.ID, using = "bt_inserir")
    public WebElement home;

    @FindBy(how = How.ID, using = "no_ingredienteativo")
    public WebElement nomeIngrediente;

    @FindBy(how = How.ID, using = "bt_inserir")
    public WebElement salvar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"aviso\"]/div/p/strong")
    public WebElement aviso;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Ok']")
    public WebElement ok;

}
