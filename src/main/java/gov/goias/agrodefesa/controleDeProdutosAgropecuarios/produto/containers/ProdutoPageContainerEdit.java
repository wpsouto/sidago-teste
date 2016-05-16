package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.containers;

import gov.goias.agrodefesa.base.containers.PageContainerEdit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProdutoPageContainerEdit extends PageContainerEdit {

    @FindBy(how = How.ID, using = "ds_nome")
    public WebElement nomeDoProduto;

}
