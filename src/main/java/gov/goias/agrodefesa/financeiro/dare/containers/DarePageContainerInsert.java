package gov.goias.agrodefesa.financeiro.dare.containers;

import gov.goias.agrodefesa.base.containers.PageContainerInsert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DarePageContainerInsert extends PageContainerInsert {

    @FindBy(how = How.ID, using = "nome_prod")
    public WebElement produtorCPF;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-1\"]/li[1]")
    public WebElement produtorCPFAutoComplete;

    @FindBy(how = How.LINK_TEXT, using = "Adicionar Cobranças")
    public WebElement adicionarCobranca;

    @FindBy(how = How.ID, using = "div_fk_servico")
    public WebElement adicionarCobrancaHome;

    @FindBy(how = How.XPATH, using = "//span/span[text()='ÁREA VEGETAL']/preceding-sibling::span[@class='dynatree-expander']")
    public WebElement areaVegetal;

    @FindBy(how = How.XPATH, using = "//span/span[text()='EMISSÃO DE PERMISSÕES E AUTORIZAÇÕES']/preceding-sibling::span[@class='dynatree-expander']")
    public WebElement emissaoDePermissoes;

    @FindBy(how = How.XPATH, using = "//span/span[text()='Certificado Fitossanitário de Origem - Responsável Técnico - CFO RT, por documento']/preceding-sibling::span[@class='dynatree-checkbox']")
    public WebElement certificadoFitossanitarioOrigem;

    @FindBy(how = How.ID, using = "quant")
    public WebElement quantidade;

    @FindBy(how = How.ID, using = "observacao")
    public WebElement observacao;

    @FindBy(how = How.XPATH, using = "//*[@id=\"aviso\"]/div/p/strong")
    public WebElement aviso;

}
