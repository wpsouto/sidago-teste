package gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.containers;

import gov.goias.agrodefesa.base.containers.PageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DelegacaoDeAtividadesPageContainerInsert extends PageContainerInsert {

    @FindBy(how = How.ID, using = "servidor_solicitante")
    public WebElement servidorDesignado;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-1\"]/li[1]")
    public WebElement servidorDesignadoAutoComplete;

    @FindBy(how = How.ID, using = "id_meio_transporte")
    public WebElement meioTransporte;

    @FindBy(how = How.LINK_TEXT, using = "Adicionar Destino")
    public WebElement adicionarDestino;

    @FindBy(how = How.ID, using = "div_id_localidade")
    public WebElement adicionarDestinoHome;

    @FindBy(how = How.ID, using = "ts_inicio")
    public WebElement dataSaida;

    @FindBy(how = How.ID, using = "ts_final")
    public WebElement dataChegada;

    @FindBy(how = How.ID, using = "mm_objetivos")
    public WebElement descricaoServico;

    @FindBy(how = How.ID, using = "bo_compernoite")
    public WebElement comPernoite;

    @FindBy(how = How.ID, using = "bo_assessoria")
    public WebElement acompanhaAutoridade;

    @FindBy(how = How.ID, using = "id_recurso")
    public WebElement tipoRecurso;

    @FindBy(how = How.XPATH, using = "//*[@id=\"id_tipo_convenio\"]/option[2]")
    public WebElement fonteDeRecurso;

    @FindBy(how = How.XPATH, using = "//*[@id=\"id_acao\"]/option[9]")
    public WebElement acao;

    @FindBy(how = How.XPATH, using = "//*[@id=\"id_meta\"]/option[2]")
    public WebElement meta;

    @FindBy(how = How.XPATH, using = "//*[@id=\"id_realizacao\"]/option[2]")
    public WebElement realizacao;

    @FindBy(how = How.ID, using = "id_outralotacao")
    private WebElement empenho;

/*
    public void adicionarDestino(){
        adicionarDestino.click();
        BrowserDriver.waitForElement(confirmar).click();
    }

    public  void empenho(){
        Select select = new Select(empenho);
        select.selectByValue("973");
    }
*/
}
