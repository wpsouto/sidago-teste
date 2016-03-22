package gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LavouraPageContainerInsert {

    @FindBy(how = How.ID, using = "aviso")
    public WebElement home;

    @FindBy(how = How.XPATH, using = "//*[@id=\"listasefaz\"]/tbody/tr[2]/td[1]")
    public WebElement listaSefaz;

    @FindBy(how = How.LINK_TEXT, using = "Adicionar Produto")
    public WebElement adicionarProduto;

    @FindBy(how = How.ID, using = "id_produto")
    public WebElement produto;

    @FindBy(how = How.ID, using = "id_cultivar")
    public WebElement cultivar;

    @FindBy(how = How.ID, using = "id_subproduto")
    public WebElement tipoProduto;

    @FindBy(how = How.ID, using = "nu_estimativaproducao")
    public WebElement estimativaProducao;

    @FindBy(how = How.CSS, using = "a.ui-state-default.ui-state-highlight")
    public WebElement dataAtual;

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

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Confirmar']")
    public WebElement confirmar;

    @FindBy(how = How.ID, using = "bt_inserir")
    public WebElement salvar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"aviso\"]/div/p/strong")
    public WebElement aviso;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Ok']")
    public WebElement ok;

}
