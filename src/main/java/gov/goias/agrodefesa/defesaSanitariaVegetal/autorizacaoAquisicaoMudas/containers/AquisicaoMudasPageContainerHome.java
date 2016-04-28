package gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AquisicaoMudasPageContainerHome {

    @FindBy(how = How.ID, using = "bt_pesquisar")
    public WebElement home;

    @FindBy(how = How.XPATH, using = "//*[@id=\"icons\"]/li[1]/span")
    public WebElement incluirRegistro;

    @FindBy(how = How.ID, using = "bt_pesquisar")
    public WebElement pesquisar;

    @FindBy(how = How.CSS, using = "#listagemOperacao > #icons > li.ui-state-default.ui-corner-all > span.ui-icon.ui-icon-document")
    public WebElement aprovar;

    @FindBy(how = How.ID, using = "origem")
    public WebElement cpfCnpjOrigem;


}