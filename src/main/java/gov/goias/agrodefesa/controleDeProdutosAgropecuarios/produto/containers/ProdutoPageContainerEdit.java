package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProdutoPageContainerEdit {

    @FindBy(how = How.ID, using = "bt_alterar")
    public WebElement home;

    @FindBy(how = How.ID, using = "ds_nome")
    public WebElement nomeDoProduto;

    @FindBy(how = How.ID, using = "bt_alterar")
    public WebElement salvar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"aviso\"]/div/p/strong")
    public WebElement aviso;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Ok']")
    public WebElement ok;


}
