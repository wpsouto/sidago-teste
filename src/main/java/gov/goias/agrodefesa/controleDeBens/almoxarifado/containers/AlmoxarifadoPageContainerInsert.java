package gov.goias.agrodefesa.controleDeBens.almoxarifado.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AlmoxarifadoPageContainerInsert {

    @FindBy(how = How.ID, using = "nome_almoxarifado_pai")
    public WebElement home;

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

    @FindBy(how = How.ID, using = "bt_inserir")
    public WebElement salvar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"aviso\"]/div/p/strong")
    public WebElement aviso;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Ok']")
    public WebElement ok;

}
