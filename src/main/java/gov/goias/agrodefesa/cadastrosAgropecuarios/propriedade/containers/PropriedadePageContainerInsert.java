package gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PropriedadePageContainerInsert {

    @FindBy(how = How.ID, using = "produtor")
    public WebElement home;

    @FindBy(how = How.ID, using = "produtor")
    public WebElement produtor;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-1\"]/li[1]")
    public WebElement produtorAutoComplete;

    @FindBy(how = How.XPATH, using = "//*[@id=\"pesquisar_cpf_cnpj\"]/img")
    public WebElement pesquisar;

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

    @FindBy(how = How.ID, using = "id_enderecotipo")
    public WebElement tipoEndereco;

    @FindBy(how = How.ID, using = "nr_cep")
    public WebElement cep;

    @FindBy(how = How.ID, using = "no_bairro")
    public WebElement bairro;

    @FindBy(how = How.ID, using = "no_logradouro")
    public WebElement endereco;

    @FindBy(how = How.ID, using = "ds_roteiro")
    public WebElement roteiro;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Confirmar']")
    public WebElement confirmar;

    @FindBy(how = How.ID, using = "bt_inserir")
    public WebElement salvar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"aviso\"]/div/p/strong")
    public WebElement aviso;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Ok']")
    public WebElement ok;

}
