package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProdutoPageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "ds_nome")
    public WebElement nome;

}
