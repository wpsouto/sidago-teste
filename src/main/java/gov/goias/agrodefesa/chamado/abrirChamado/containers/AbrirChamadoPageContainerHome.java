package gov.goias.agrodefesa.chamado.abrirChamado.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AbrirChamadoPageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "nu_chamado")
    public WebElement numeroChamado;

    @FindBy(how = How.ID, using = "nome_classificacao")
    public WebElement classificacao;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-2\"]/li[1]")
    public WebElement classificacaoAutoComplete;

    @FindBy(how = How.ID, using = "nome_pessoa")
    public WebElement solicitante;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-3\"]/li[1]")
    public WebElement solicitanteAutoComplete;

    @FindBy(how = How.ID, using = "nome_tecnico")
    public WebElement tecnico;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-4\"]/li[1]")
    public WebElement tecnicoAutoComplete;

    @FindBy(how = How.ID, using = "nome_lotacao")
    public WebElement lotacao;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-1\"]/li[1]")
    public WebElement lotacaoAutoComplete;

    @FindBy(how = How.ID, using = "tipo_classificacao")
    public WebElement suporte;

    @FindBy(how = How.ID, using = "tipo_contato")
    public WebElement contato;

    @FindBy(how = How.ID, using = "situacao")
    public WebElement situacao;

    @FindBy(how = How.ID, using = "formPesquisar")
    public WebElement form;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]/td[2]")
    public WebElement gridNumeroChamado;

}
