package gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.containers;

import gov.goias.agrodefesa.base.containers.PageContainerInsert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PropriedadePageContainerInsert extends PageContainerInsert {

    @FindBy(how = How.ID, using = "produtor")
    public WebElement home;

    @FindBy(how = How.ID, using = "produtor")
    public WebElement produtor;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-1\"]/li[1]")
    public WebElement produtorAutoComplete;

    @FindBy(how = How.XPATH, using = "//*[@id=\"pesquisar_cpf_cnpj\"]/img")
    public WebElement pesquisarSEFAZ;

    @FindBy(how = How.LINK_TEXT, using = "clique aqui")
    public WebElement cliqueAqui;

    @FindBy(how = How.ID, using = "no_propriedade")
    public WebElement nomePropriedade;

    @FindBy(how = How.ID, using = "tp_contribuintepropriedade")
    public WebElement tipoDeContribuinte;

    @FindBy(how = How.ID, using = "tp_condicaopropriedade")
    public WebElement condicaoDePropriedade;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ulFk\"]/li/span")
    public WebElement adicionarEndereco;

    @FindBy(how = How.ID, using = "div_id_endereco")
    public WebElement adicionarEnderecoHome;

    @FindBy(how = How.ID, using = "id_enderecotipo")
    public WebElement tipoEndereco;

    @FindBy(how = How.ID, using = "nr_cep")
    public WebElement cep;

    @FindBy(how = How.ID, using = "no_bairro")
    public WebElement bairro;

    @FindBy(how = How.ID, using = "no_logradouro")
    public WebElement endereco;

    @FindBy(how = How.ID, using = "ds_complemento")
    public WebElement complemento;

    @FindBy(how = How.ID, using = "ds_roteiro")
    public WebElement roteiro;

    @FindBy(how = How.LINK_TEXT, using = "Adicionar Responsável Técnico")
    public WebElement adicionarResponsavelTecnico;

    @FindBy(how = How.ID, using = "div_id_rt")
    public WebElement responsavelTecnicoHome;

    @FindBy(how = How.ID, using = "nome_rt")
    public WebElement nomeResponsavelTecnico;

    @FindBy(how = How.XPATH, using = "/html/body/ul[2]/li[1]")
    public WebElement nomeResponsavelTecnicoAutoComplete;

}
