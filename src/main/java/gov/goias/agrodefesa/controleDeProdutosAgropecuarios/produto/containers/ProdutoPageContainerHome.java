package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProdutoPageContainerHome {

    @FindBy(how = How.ID, using = "bt_pesquisar")
    public WebElement home;

    @FindBy(how = How.ID, using = "ds_nome")
    public WebElement nome;

    @FindBy(how = How.XPATH, using = "//*[@id=\"icons\"]/li[1]/span")
    public WebElement incluirRegistro;

    @FindBy(how = How.ID, using = "bt_pesquisar")
    public WebElement pesquisar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]")
    public WebElement gridRow;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[5]/div/ul/li[2]")
    public WebElement alterar;



}
