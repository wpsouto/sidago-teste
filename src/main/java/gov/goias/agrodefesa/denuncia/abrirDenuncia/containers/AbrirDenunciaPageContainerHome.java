package gov.goias.agrodefesa.denuncia.abrirDenuncia.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AbrirDenunciaPageContainerHome {

    @FindBy(how = How.ID, using = "bt_pesquisar")
    public WebElement home;

    @FindBy(how = How.XPATH, using = "//*[@id=\"icons\"]/li[1]/span")
    public WebElement incluirRegistro;

    @FindBy(how = How.ID, using = "no_tipoinfracao")
    public WebElement tipoInfracao;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-3\"]/li[1]")
    public WebElement tipoInfracaoAutoComplete;

    @FindBy(how = How.ID, using = "bt_pesquisar")
    public WebElement pesquisar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]")
    public WebElement gridRow;

    @FindBy(how = How.CSS, using = "span.ui-icon.ui-icon-pencil")
    public WebElement alterar;

}
