package gov.goias.agrodefesa.controleDeBens.transferencia.containers;

import gov.goias.agrodefesa.base.containers.PageContainerInsert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TransferenciaPageContainerInsert extends PageContainerInsert{

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

}
