package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.containers;

import gov.goias.agrodefesa.base.containers.PageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UnidadeProducaoPageContainerInsert extends PageContainerInsert {

    @FindBy(how = How.ID, using = "id_upidentificacao")
    public WebElement identificacao;

    @FindBy(how = How.ID, using = "div_pesquisar_propriedade")
    public WebElement propriedadeHome;

    @FindBy(how = How.ID, using = "cnpjcpf")
    public WebElement cnpj;

    @FindBy(how = How.LINK_TEXT, using = "Realizar Pesquisa")
    public WebElement realizarPesquisa;

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

    @FindBy(how = How.ID, using = "bo_areacertificada")
    public WebElement areaCertificada;

    @FindBy(how = How.ID, using = "vl_latitude")
    public WebElement latitude;

    @FindBy(how = How.ID, using = "vl_longitude")
    public WebElement longitude;

    @FindBy(how = How.ID, using = "ds_localidadedolivro")
    public WebElement localidadeLivro;

    @FindBy(how = How.ID, using = "nu_serie")
    public WebElement serie;

    @FindBy(how = How.ID, using = "nu_termo")
    public WebElement numero;
}
