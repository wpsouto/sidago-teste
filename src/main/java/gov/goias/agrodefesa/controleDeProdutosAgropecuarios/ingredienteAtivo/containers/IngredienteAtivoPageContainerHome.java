package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IngredienteAtivoPageContainerHome {

    @FindBy(how = How.ID, using = "bo_ativo")
    public WebElement home;

    @FindBy(how = How.ID, using = "no_ingredienteativo")
    public WebElement ingrediente;

    @FindBy(how = How.XPATH, using = "//*[@id=\"icons\"]/li[1]/span")
    public WebElement incluirRegistro;

    @FindBy(how = How.ID, using = "bt_pesquisar")
    public WebElement pesquisar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]")
    public WebElement gridRow;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[4]/div/ul/li[2]")
    public WebElement alterar;



}
