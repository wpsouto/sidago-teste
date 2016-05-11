package gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.containers;

import gov.goias.agrodefesa.base.containers.PageContainerInsert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PessoaPageContainerInsert extends PageContainerInsert {

    @FindBy(how = How.ID, using = "cpf_cnpj")
    public WebElement cpfCnpj;

    @FindBy(how = How.XPATH, using = "//*[@id=\"div-cpf-lupa\"]/div[2]/a/img")
    public WebElement pesquisarSEFAZ;

    @FindBy(how = How.ID, using = "nome_pessoa_juridica")
    public WebElement nomeEmpresa;

    @FindBy(how = How.ID, using = "no_fantasia")
    public WebElement nomeFantasia;

    @FindBy(how = How.LINK_TEXT, using = "Adicionar Endereço")
    public WebElement adicionarEndereco;

    @FindBy(how = How.ID, using = "div_id_endereco")
    public WebElement adicionarEnderecoHome;

    @FindBy(how = How.ID, using = "id_endereco_tipo")
    public WebElement tipoEndereco;

    @FindBy(how = How.ID, using = "endereco")
    public WebElement endereco;

    @FindBy(how = How.ID, using = "bairro")
    public WebElement bairro;

    @FindBy(how = How.ID, using = "complemento")
    public WebElement complemento;

    @FindBy(how = How.ID, using = "cep")
    public WebElement cep;

}
