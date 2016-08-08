package gov.goias.agrodefesa.defesaSanitariaVegetal.certificadoFitossanitarioOrigem.containers;

import gov.goias.agrodefesa.base.containers.PageContainerInsert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CertificadoFitossanitarioOrigemPageContainerInsert extends PageContainerInsert {

    @FindBy(how = How.ID, using = "div_pesquisar_propriedade")
    public WebElement propriedadeHome;

    @FindBy(how = How.ID, using = "cnpjcpf")
    public WebElement cnpjCpf;

    @FindBy(how = How.LINK_TEXT, using = "Realizar Pesquisa")
    public WebElement realizarPesquisa;

    @FindBy(how = How.LINK_TEXT, using = "Adicionar Produto")
    public WebElement adicionarProduto;

    @FindBy(how = How.ID, using = "div_produtos")
    public WebElement adicionarProdutoHome;

    @FindBy(how = How.ID, using = "id_unidadeproducao")
    public WebElement codigoUP;

    @FindBy(how = How.ID, using = "id_produtoup")
    public WebElement produtoUP;

    @FindBy(how = How.ID, using = "qt_produto")
    public WebElement quantidade;

    @FindBy(how = How.ID, using = "dt_iniciocolheita")
    public WebElement inicioColheita;

    @FindBy(how = How.ID, using = "dt_finalcolheita")
    public WebElement fimColheita;

    @FindBy(how = How.NAME, using = "st_certificacao")
    public WebElement certificacao;

    @FindBy(how = How.NAME, using = "id_dare")
    public WebElement dare;

}
