package gov.goias.agrodefesa.chamado.abrirChamado.containers;

import gov.goias.agrodefesa.base.containers.PageContainerInsert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AbrirChamadoPageContainerInsert extends PageContainerInsert {

    @FindBy(how = How.ID, using = "nome_pessoa")
    public WebElement solicitante;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-2\"]/li[1]")
    public WebElement solicitanteAutoComplete;

    @FindBy(how = How.ID, using = "tipo_classificacao")
    public WebElement tipoSuporte;

    @FindBy(how = How.ID, using = "nome_classificacao_chzn")
    public WebElement classificacao;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nome_classificacao_chzn\"]/div/ul/li[2]")
    public WebElement classificacaoInput;

    @FindBy(how = How.ID, using = "tipo_contato")
    public WebElement tipoContato;

    @FindBy(how = How.ID, using = "ds_problema")
    public WebElement problema;

    @FindBy(how = How.ID, using = "adotar_chamado")
    public WebElement adotarChamado;


}
