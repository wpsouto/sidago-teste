package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.containers;

import gov.goias.agrodefesa.base.containers.PageContainerEdit;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmpresaPageContainerEdit extends PageContainerEdit {

    @FindBy(how = How.ID, using = "bt_salvarsemenviar")
    public WebElement home;

    @FindBy(how = How.LINK_TEXT, using = "Informação Obrigatória")
    public WebElement informacaoObrigatoria;

    @FindBy(how = How.ID, using = "id_classificacao")
    public WebElement classificacao;

    @FindBy(how = How.ID, using = "nu_capacidadealojamento")
    public WebElement capacidadeAlojamento;

    @FindBy(how = How.ID, using = "nu_servicoinspecao")
    public WebElement numeroServicoInspecao;

    @FindBy(how = How.ID, using = "nu_renasem")
    public WebElement numeroRenasem;

    @FindBy(how = How.ID, using = "nu_litrosleitedia")
    public WebElement qtdLitrosLeite;

    @FindBy(how = How.ID, using = "nu_animaisprocessadosdia")
    public WebElement qtdAnimaisProcessados;

    @FindBy(how = How.ID, using = "nu_animaisconfinados")
    public WebElement qtdAnimaisConfinados;

    @FindBy(how = How.ID, using = "ds_porte")
    public WebElement porteEmpresa;

    @FindBy(how = How.LINK_TEXT, using = "Anexar Documentos")
    public WebElement anexarDocumentos;

    @FindBy(how = How.ID, using = "arquivosfaltantes")
    public WebElement arquivosFaltantes;

    @FindBy(how = How.XPATH, using = "//*[@id=\"accordion_1\"]/section[2]/h2/div/a")
    public WebElement credenciamentoInicial;

    @FindBy(how = How.LINK_TEXT, using = "Adicionar Anexo")
    public WebElement adicionarAnexo;

    @FindBy(how = How.ID, using = "id_documentorequerido")
    public WebElement tipoDocumento;

    @FindBy(how = How.ID, using = "dt_vencimento")
    public WebElement dataVencimento;

    @FindBy(how = How.ID, using = "doc_2016")
    public WebElement file;

    @FindBy(how = How.ID, using = "bt_enviarcadastro")
    public WebElement enviarCadastro;

    @FindBy(how = How.ID, using = "bt_salvarsemenviar")
    public WebElement salvar;


}
