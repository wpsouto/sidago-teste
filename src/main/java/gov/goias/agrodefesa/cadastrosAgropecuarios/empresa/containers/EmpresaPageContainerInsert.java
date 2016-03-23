package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmpresaPageContainerInsert {

    @FindBy(how = How.ID, using = "cnpj")
    public WebElement home;

    @FindBy(how = How.ID, using = "cnpj")
    public WebElement documento;

    @FindBy(how = How.ID, using = "id_classificacao")
    public WebElement classificacao;

    @FindBy(how = How.XPATH, using = "//*[@id=\"divEdicao\"]/fieldset/div[2]/div[2]/img")
    public WebElement pesquisar;

    @FindBy(how = How.LINK_TEXT, using = "clique aqui")
    public WebElement cliqueAqui;

    @FindBy(how = How.LINK_TEXT, using = "Informação Obrigatória")
    public WebElement informacaoObrigatoria;

    @FindBy(how = How.ID, using = "ds_socio")
    public WebElement socio;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-1\"]/li[1]")
    public WebElement socioAutoComplete;

    @FindBy(how = How.ID, using = "nome")
    public WebElement nomeEmpresa;

    @FindBy(how = How.ID, using = "no_fantasia")
    public WebElement nomeFantasia;

    @FindBy(how = How.LINK_TEXT, using = "Informação Complementar")
    public WebElement informacaoComplementar;

    @FindBy(how = How.LINK_TEXT, using = "Adicionar Endereço")
    public WebElement adicionarEndereco;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Confirmar']")
    public WebElement confirmar;

    @FindBy(how = How.ID, using = "bt_inserir")
    public WebElement salvar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"aviso\"]/div/p/strong")
    public WebElement aviso;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Ok']")
    public WebElement ok;

}