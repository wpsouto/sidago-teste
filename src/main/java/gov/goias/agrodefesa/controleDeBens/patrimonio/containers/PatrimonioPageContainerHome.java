package gov.goias.agrodefesa.controleDeBens.patrimonio.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class PatrimonioPageContainerHome {

    @FindBy(how = How.ID, using = "nu_patrimonio")
    public WebElement home;

    @FindBy(how = How.ID, using = "nu_patrimonio")
    public WebElement numeroPatrimonio;

    @FindBy(how = How.ID, using = "//*[@id=\"ui-id-2\"]/li[1]")
    public WebElement numeroPatrimonioAutoComplete;

    @FindBy(how = How.ID, using = "nu_controle")
    public WebElement numeroControle;

    @FindBy(how = How.ID, using = "especie")
    public WebElement especie;

    @FindBy(how = How.ID, using = "tipo_aquisicao")
    public WebElement tipoAquisicao;

    @FindBy(how = How.ID, using = "nome_lotacao")
    public WebElement lotacao;

    @FindBy(how = How.ID, using = "bo_baixado")
    public WebElement situacao;

    @FindBy(how = How.XPATH, using = "//*[@id=\"icons\"]/li[1]/span")
    public WebElement incluirRegistro;

    @FindBy(how = How.ID, using = "bt_limparpesquisa")
    public WebElement limpar;

    @FindBy(how = How.ID, using = "bt_pesquisar")
    public WebElement pesquisar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[2]")
    public WebElement gridRow;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[8]/div/ul/li[2]")
    public WebElement alterar;

}
