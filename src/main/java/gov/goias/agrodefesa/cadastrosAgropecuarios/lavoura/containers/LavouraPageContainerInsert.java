package gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.containers;

import gov.goias.agrodefesa.base.containers.PageContainerInsert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LavouraPageContainerInsert extends PageContainerInsert {

    @FindBy(how = How.ID, using = "aviso")
    public WebElement home;

    @FindBy(how = How.XPATH, using = "//*[@id=\"listasefaz\"]/tbody/tr[2]/td[1]")
    public WebElement listaSefaz;

    @FindBy(how = How.LINK_TEXT, using = "Adicionar Produto")
    public WebElement adicionarProduto;

    @FindBy(how = How.ID, using = "div_produtos")
    public WebElement adicionarProdutoHome;

    @FindBy(how = How.ID, using = "id_produto")
    public WebElement produto;

    @FindBy(how = How.ID, using = "id_cultivar")
    public WebElement cultivar;

    @FindBy(how = How.ID, using = "id_subproduto")
    public WebElement tipoProduto;

    @FindBy(how = How.ID, using = "nu_estimativaproducao")
    public WebElement estimativaProducao;

    @FindBy(how = How.ID, using = "dt_plantio")
    public WebElement dataPrevistoPlantio;

    @FindBy(how = How.ID, using = "dt_iniciosafra")
    public WebElement previsaoInicioColheita;

    @FindBy(how = How.ID, using = "dt_fimsafra")
    public WebElement previsaoFimColheita;

    @FindBy(how = How.ID, using = "vl_area_produto")
    public WebElement areaPlantada;

    @FindBy(how = How.ID, using = "id_sistemacultivo")
    public WebElement sistemaCultivo;

    @FindBy(how = How.ID, using = "id_origemsemente")
    public WebElement origemSemente;

}
