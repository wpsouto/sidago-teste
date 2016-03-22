package gov.goias.agrodefesa.controleDeBens.material.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MaterialHomePageContainer {

	// Pesquisar

    @FindBy(how = How.ID, using = "no_material")
    public WebElement home;

	@FindBy(how = How.ID, using = "no_material")
    public WebElement nomeMaterial;

    @FindBy(how = How.ID, using = "bt_pesquisar")
    public WebElement pesquisar;

    @FindBy(how = How.ID, using = "bt_limparpesquisa")
    public WebElement limpar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"icons\"]/li[1]/span")
    public WebElement incluirRegistro;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]")
    public WebElement gridRow;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[6]/div/ul/li[2]")
    public WebElement alterar;



}
