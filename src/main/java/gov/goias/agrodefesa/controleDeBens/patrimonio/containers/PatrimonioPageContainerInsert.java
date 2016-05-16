package gov.goias.agrodefesa.controleDeBens.patrimonio.containers;

import gov.goias.agrodefesa.base.containers.PageContainerInsert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PatrimonioPageContainerInsert extends PageContainerInsert {

    @FindBy(how = How.ID, using = "num_patrimonio")
    public WebElement numeroPatrimonioAgrodefesa;

    @FindBy(how = How.ID, using = "num_patrimonio_mapa")
    public WebElement numeroPatrimonioMapa;

    @FindBy(how = How.ID, using = "ds_patrimonio")
    public WebElement descricao;

    @FindBy(how = How.ID, using = "nome_fornecedor")
    public WebElement fornecedor;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-3\"]/li[1]")
    public WebElement fornecedorAutoComplete;

    @FindBy(how = How.ID, using = "dt_aquisicao")
    public WebElement dataAquisicao;

    @FindBy(how = How.ID, using = "nu_notafiscal")
    public WebElement notaFiscal;

    @FindBy(how = How.ID, using = "vl_aquisicao")
    public WebElement valor;

    @FindBy(how = How.ID, using = "origem_recurso")
    public WebElement origemRecurso;

    @FindBy(how = How.ID, using = "tipo_aquisicao")
    public WebElement tipoAquisicao;

    @FindBy(how = How.ID, using = "especie")
    public WebElement especie;

    @FindBy(how = How.ID, using = "conservacao")
    public WebElement conservacao;

    @FindBy(how = How.ID, using = "nu_controle")
    public WebElement numeroControle;

    @FindBy(how = How.ID, using = "nu_chassi")
    public WebElement chassi;

    @FindBy(how = How.ID, using = "nu_serie")
    public WebElement serie;

    @FindBy(how = How.ID, using = "nu_processo")
    public WebElement processo;

    @FindBy(how = How.ID, using = "nome_lotacao")
    public WebElement lotacao;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-1\"]/li[1]")
    public WebElement lotacaoAutoComplete;

}
