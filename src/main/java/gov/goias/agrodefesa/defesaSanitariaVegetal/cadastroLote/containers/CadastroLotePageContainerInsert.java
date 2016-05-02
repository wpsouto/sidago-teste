package gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.containers;

import gov.goias.agrodefesa.base.containers.PageContainerInsert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CadastroLotePageContainerInsert extends PageContainerInsert {

    @FindBy(how = How.ID, using = "numero_uc")
    public WebElement cnpj;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-1\"]/li[1]")
    public WebElement cnpjAutoComplete;

    @FindBy(how = How.ID, using = "id_produto")
    public WebElement produto;

    @FindBy(how = How.ID, using = "id_cultivar")
    public WebElement cultivar;

    @FindBy(how = How.ID, using = "id_subproduto")
    public WebElement tipoProduto;



}
