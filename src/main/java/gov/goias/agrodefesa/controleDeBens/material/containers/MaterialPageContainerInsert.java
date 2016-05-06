package gov.goias.agrodefesa.controleDeBens.material.containers;

import gov.goias.agrodefesa.base.containers.PageContainerInsert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MaterialPageContainerInsert extends PageContainerInsert {

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

    @FindBy(how = How.ID, using = "validacao")
    public WebElement validacao;

}
