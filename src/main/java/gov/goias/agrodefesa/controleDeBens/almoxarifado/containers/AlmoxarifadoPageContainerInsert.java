package gov.goias.agrodefesa.controleDeBens.almoxarifado.containers;

import gov.goias.agrodefesa.base.containers.PageContainerInsert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AlmoxarifadoPageContainerInsert extends PageContainerInsert {

    @FindBy(how = How.ID, using = "ds_almoxarifado")
    public WebElement descricao;

    @FindBy(how = How.ID, using = "nomelotacao")
    public WebElement lotacao;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-2\"]/li[1]")
    public WebElement lotacaoAutoComplete;

    @FindBy(how = How.ID, using = "nome_gestor")
    public WebElement gestor;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-1\"]/li[1]")
    public WebElement gestorAutoComplete;

    @FindBy(how = How.ID, using = "nome_almoxarifado_pai")
    public WebElement almoxarifadoPai;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-3\"]/li[1]")
    public WebElement almoxarifadoPaiAutoComplete;

}
