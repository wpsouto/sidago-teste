package gov.goias.agrodefesa.financeiro.dare.containers;

import gov.goias.agrodefesa.base.containers.PageContainerInsert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DarePageContainerInsert extends PageContainerInsert {

    @FindBy(how = How.ID, using = "id_upidentificacao")
    public WebElement produtorCPF;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-1\"]/li[1]")
    public WebElement produtorCPFAutoComplete;

    @FindBy(how = How.ID, using = "div_pesquisar_propriedade")
    public WebElement dataVencimento;

    @FindBy(how = How.LINK_TEXT, using = "Adicionar Cobranças")
    public WebElement adicionarCobranca;

    @FindBy(how = How.ID, using = "div_fk_servico")
    public WebElement adicionarCobrancaHome;

    @FindBy(how = How.ID, using = "id_produto")
    public WebElement produto;

}
