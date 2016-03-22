package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProdutoPageContainerInsert {

    @FindBy(how = How.ID, using = "bt_inserir")
    public WebElement home;

    @FindBy(how = How.ID, using = "ds_classificacaoproduto")
    public WebElement classificacao;

    @FindBy(how = How.ID, using = "ds_nome")
    public WebElement nome;

    @FindBy(how = How.LINK_TEXT, using = "Adicionar Subproduto/Unidade")
    public WebElement adicionar;

    @FindBy(how = How.ID, using = "id_unidademedida")
    public WebElement unidadeDeMedida;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Confirmar']")
    public WebElement confirmar;

    @FindBy(how = How.ID, using = "bt_inserir")
    public WebElement salvar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"aviso\"]/div/p/strong")
    public WebElement aviso;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Ok']")
    public WebElement ok;

}
