package gov.goias.agrodefesa.concessaoDeDiarias.prestacaoDeContas.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PrestacaoDeContasPageContainerEdit {

    @FindBy(how = How.ID, using = "ds_atividades")
    public WebElement home;

    @FindBy(how = How.ID, using = "ds_atividades")
    public WebElement atividades;

    @FindBy(how = How.XPATH, using = "//input[@type='file']")
    public WebElement teste;

    @FindBy(how = How.XPATH, using = "//input[@value='Escolher Arquivos...']")
    public WebElement arquivos;

    @FindBy(how = How.ID, using = "bt_alterar")
    public WebElement salvar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"aviso\"]/div/p/strong")
    public WebElement aviso;

}
