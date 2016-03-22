package gov.goias.agrodefesa.controleDeBens.material.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MaterialInsertPageContainer {

    @FindBy(how = How.ID, using = "tp_material")
    public WebElement home;

    @FindBy(how = How.ID, using = "no_material")
    public WebElement nomeMaterial;

    @FindBy(how = How.ID, using = "erro-no_material")
    public WebElement nomeMaterialErro;

    @FindBy(how = How.ID, using = "tp_material")
    public WebElement tipoMaterial;

    @FindBy(how = How.ID, using = "erro-tp_material")
    public WebElement tipoMaterialErro;

    @FindBy(how = How.ID, using = "no_unidademedida")
    public WebElement unidadeMedida;

    @FindBy(how = How.ID, using = "erro-no_unidademedida")
    public WebElement unidadeMedidaErro;

    @FindBy(how = How.ID, using = "qt_estoqueminimoestado")
    public WebElement estoqueMinimo;

    @FindBy(how = How.XPATH, using = "//*[@id=\"caixaSalvar\"]/button[1]")
    public WebElement limpar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bt_inserir\"]")
    public WebElement salvar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"aviso\"]/div/p/strong")
    public WebElement aviso;

    @FindBy(how = How.XPATH, using = "//*[@id=\"validacao\"]/h3")
    public WebElement validacao;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Ok']")
    public WebElement ok;

}
