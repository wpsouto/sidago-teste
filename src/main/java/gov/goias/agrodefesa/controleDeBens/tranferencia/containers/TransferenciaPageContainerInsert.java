package gov.goias.agrodefesa.controleDeBens.tranferencia.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TransferenciaPageContainerInsert {

    @FindBy(how = How.ID, using = "nome_lotacao")
    public WebElement home;

    @FindBy(how = How.ID, using = "nu_patrimonio")
    public WebElement numeroPatrimonio;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-2\"]/li[1]")
    public WebElement numeroPatrimonioAutoComplete;

    @FindBy(how = How.ID, using = "nome_lotacao")
    public WebElement destinoPatrimonio;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-1\"]/li[1]")
    public WebElement destinoPatrimonioAutoComplete;

    @FindBy(how = How.ID, using = "conservacao")
    public WebElement conservacao;

    @FindBy(how = How.ID, using = "bo_manutencao")
    public WebElement manutencao;

    @FindBy(how = How.ID, using = "ds_observacao")
    public WebElement observacao;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-1\"]/li[1]")
    public WebElement lotacaoAutoComplete;

    @FindBy(how = How.ID, using = "bt_inserir")
    public WebElement salvar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"aviso\"]/div/p/strong")
    public WebElement aviso;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Ok']")
    public WebElement ok;

}
