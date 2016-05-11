package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.containers;

import gov.goias.agrodefesa.base.containers.PageContainerInsert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProdutoPageContainerInsert extends PageContainerInsert {

    @FindBy(how = How.ID, using = "ds_classificacaoproduto")
    public WebElement classificacao;

    @FindBy(how = How.ID, using = "ds_nome")
    public WebElement nome;

    @FindBy(how = How.LINK_TEXT, using = "Adicionar Subproduto/Unidade")
    public WebElement adicionarSubproduto;

    @FindBy(how = How.ID, using = "div_id_subproduto")
    public WebElement adicionarSubprodutoHome;

    @FindBy(how = How.ID, using = "id_unidademedida")
    public WebElement unidadeDeMedida;

}
