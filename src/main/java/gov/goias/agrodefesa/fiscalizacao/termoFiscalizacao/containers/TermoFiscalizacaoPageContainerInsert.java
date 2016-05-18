package gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.containers;

import gov.goias.agrodefesa.base.containers.PageContainerInsert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TermoFiscalizacaoPageContainerInsert extends PageContainerInsert {

    @FindBy(how = How.ID, using = "tp_documentotermo")
    public WebElement tipoTermoFiscalizacao;

    @FindBy(how = How.ID, using = "tp_caracterizacao")
    public WebElement caracterizacaoFiscalizacao;

    @FindBy(how = How.ID, using = "id_municipio_fiscalizado")
    public WebElement municipioFiscalizado;

    @FindBy(how = How.ID, using = "bo_tipo")
    public WebElement identificao;

    @FindBy(how = How.ID, using = "codigo")
    public WebElement cpfCnpj;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-4\"]/li[1]")
    public WebElement cpfCnpjAutoComplete;

    @FindBy(how = How.LINK_TEXT, using = "Adicionar Objetivos da Fiscalização")
    public WebElement adicionarObjetivos;

    @FindBy(how = How.ID, using = "div_id_termoobjetivofiscalizacao")
    public WebElement homeAdicionarObjetivos;

    @FindBy(how = How.ID, using = "id_programafiscalizacao")
    public WebElement programa;

    @FindBy(how = How.ID, using = "id_objetivofiscalizacao")
    public WebElement objetivo;

    @FindBy(how = How.ID, using = "id_subobjetivofiscalizacao")
    public WebElement suObjetivo;

    @FindBy(how = How.ID, using = "id_produto")
    public WebElement produto;

    @FindBy(how = How.ID, using = "ds_historicosituacao")
    public WebElement situacaoEncontrada;

    @FindBy(how = How.ID, using = "ds_orientacoes")
    public WebElement orientacoes;

}
