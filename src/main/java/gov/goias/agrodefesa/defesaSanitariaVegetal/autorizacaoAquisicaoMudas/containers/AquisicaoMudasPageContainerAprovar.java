package gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.containers;

import gov.goias.agrodefesa.base.containers.PageContainerBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AquisicaoMudasPageContainerAprovar extends PageContainerBase {

    @FindBy(how = How.ID, using = "boxDelete")
    public WebElement home;

    @FindBy(how = How.ID, using = "ds_observacao")
    public WebElement observacao;

    @FindBy(how = How.CSS, using = "#div-tela_aprovacao_autaquimudas > div.control-group > div.controls > #st_aprovacao")
    public WebElement situacao;

    @FindBy(how = How.ID, using = "mensagem")
    public WebElement aviso;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Salvar']")
    public WebElement salvar;

}
