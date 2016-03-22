package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmpresaForaGoiasPageContainerInsert {

    @FindBy(how = How.ID, using = "bt_inserir")
    public WebElement home;

    @FindBy(how = How.ID, using = "numero")
    public WebElement numeroDocumento;

    @FindBy(how = How.LINK_TEXT, using = "Pesquisar")
    public WebElement pesquisar;

    @FindBy(how = How.LINK_TEXT, using = "Selecionar")
    public WebElement selecionar;

    @FindBy(how = How.ID, using = "id_classificacao_foragoias")
    public WebElement classificacao;

    @FindBy(how = How.ID, using = "bt_inserir")
    public WebElement salvar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"aviso\"]/div/p/strong")
    public WebElement aviso;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Ok']")
    public WebElement ok;

}
