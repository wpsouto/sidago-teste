package gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.containers;

import gov.goias.agrodefesa.base.containers.PageContainerInsert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AquisicaoMudasPageContainerInsert extends PageContainerInsert {

    @FindBy(how = How.ID, using = "pessoaorigem")
    public WebElement cnpjCpfOrigem;

    @FindBy(how = How.LINK_TEXT, using = "Pesquisar")
    public WebElement pesquisarOrigem;

    @FindBy(how = How.ID, using = "boxPesquisar-pessoaorigem")
    public WebElement pesquisarHomeOrigem;

    @FindBy(how = How.ID, using = "nu_registroestabelecimentoorigem")
    public WebElement registroRenasem;

    @FindBy(how = How.ID, using = "ds_emailsolicitante")
    public WebElement eMailOrigem;

    @FindBy(how = How.ID, using = "ds_telefonesolicitante")
    public WebElement telefoneOrigem;

    @FindBy(how = How.ID, using = "tipo_destino")
    public WebElement tipoDestino;

    @FindBy(how = How.ID, using = "pessoadestinoprodutorrural")
    public WebElement cnpjCpfDestino;

    @FindBy(how = How.CSS, using = "a.btn.pesquisar_pessoa_basico-pessoadestinoprodutorrural")
    public WebElement pesquisarDestino;

    @FindBy(how = How.ID, using = "boxPesquisar-pessoadestinoprodutorrural")
    public WebElement pesquisarHomeDestino;

    @FindBy(how = How.XPATH, using = "//*[@id=\"id_propriedadedestino\"]/option[2]")
    public WebElement propriedadeDestino;

    @FindBy(how = How.ID, using = "ds_telefonedestino")
    public WebElement telefoneDestino;

    @FindBy(how = How.LINK_TEXT, using = "Adicionar Transportador")
    public WebElement adicionarTransportador;

    @FindBy(how = How.ID, using = "div_id_transportador")
    public WebElement adicionarTransportadorHome;

    @FindBy(how = How.ID, using = "id_tipotransporte")
    public WebElement tipoTransporte;

    @FindBy(how = How.LINK_TEXT, using = "Adicionar Mudas")
    public WebElement adicionarMudas;

    @FindBy(how = How.ID, using = "div_produtos")
    public WebElement adicionarMudasHome;

    @FindBy(how = How.ID, using = "id_produto")
    public WebElement produto;

    @FindBy(how = How.XPATH, using = "//*[@id=\"id_cultivar\"]/option[2]")
    public WebElement cultivar;

    @FindBy(how = How.ID, using = "id_subproduto")
    public WebElement tipoProduto;

    @FindBy(how = How.ID, using = "qt_produto")
    public WebElement quantidade;

    @FindBy(how = How.ID, using = "id_embalagem")
    public WebElement embalagem;

    @FindBy(how = How.ID, using = "id_metodopropagacao")
    public WebElement metodoPropagacao;

}
