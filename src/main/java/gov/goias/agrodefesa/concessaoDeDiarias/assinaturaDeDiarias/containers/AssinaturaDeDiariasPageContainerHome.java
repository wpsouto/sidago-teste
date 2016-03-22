package gov.goias.agrodefesa.concessaoDeDiarias.assinaturaDeDiarias.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AssinaturaDeDiariasPageContainerHome {

    @FindBy(how = How.ID, using = "nu_diaria")
    public WebElement home;

    @FindBy(how = How.ID, using = "nu_diaria")
    public WebElement numeroDaDiaria;

    @FindBy(how = How.ID, using = "bt_pesquisar")
    public WebElement pesquisar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"conteudo\"]/div[1]/table/tbody/tr[1]/td[3]")
    public WebElement gridNumero;

    @FindBy(how = How.XPATH, using = "//*[@id=\"conteudo\"]/div[1]/table/tbody/tr[1]/td[2]/div/span")
    public WebElement gridInformacoesDetalhadas;

    @FindBy(how = How.ID, using = "assinar_diaria")
    public WebElement assinar;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Ok']")
    public WebElement confirmar;


}
