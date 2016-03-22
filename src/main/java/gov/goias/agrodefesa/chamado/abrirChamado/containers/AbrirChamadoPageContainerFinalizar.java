package gov.goias.agrodefesa.chamado.abrirChamado.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AbrirChamadoPageContainerFinalizar {

    @FindBy(how = How.ID, using = "rs_solucao")
    public WebElement home;

    @FindBy(how = How.ID, using = "rs_solucao")
    public WebElement resumo;

    @FindBy(how = How.ID, using = "ds_solucao")
    public WebElement descricao;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Confirmar']")
    public WebElement confirmar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"aviso\"]/div/p/strong")
    public WebElement aviso;

}
