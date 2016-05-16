package gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.containers;

import gov.goias.agrodefesa.base.containers.PageContainerInsert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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

    @FindBy(how = How.ID, using = "id_tipo_convenio")
    public WebElement fonteDeRecurso;

    @FindBy(how = How.ID, using = "id_acao")
    public WebElement acao;

    @FindBy(how = How.ID, using = "id_meta")
    public WebElement meta;

    @FindBy(how = How.ID, using = "id_realizacao")
    public WebElement realizacao;

    @FindBy(how = How.ID, using = "id_outralotacao")
    public WebElement empenho;

}
