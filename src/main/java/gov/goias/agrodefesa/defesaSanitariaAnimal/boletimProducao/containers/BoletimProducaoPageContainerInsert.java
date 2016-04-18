package gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BoletimProducaoPageContainerInsert {

    @FindBy(how = How.ID, using = "bt_inserir")
    public WebElement home;

    @FindBy(how = How.LINK_TEXT, using = "Pesquisar")
    public WebElement pesquisar;

    @FindBy(how = How.ID, using = "cnpjcpf")
    public WebElement cnpjCpf;

    @FindBy(how = How.LINK_TEXT, using = "Realizar Pesquisa")
    public WebElement realizarPesquisa;

    @FindBy(how = How.LINK_TEXT, using = "Selecionar")
    public WebElement selecionar;

    @FindBy(how = How.CSS, using = "a.ui-state-default.ui-state-highlight")
    public WebElement now;

    @FindBy(how = How.ID, using = "materia_prima")
    public WebElement materiaPrimaOrigem;

    @FindBy(how = How.ID, using = "nu_total_alojamento")
    public WebElement totalDeAnimaisAlojados;

    @FindBy(how = How.ID, using = "bo_monitoramento_patogenicos")
    public WebElement monitoramentoMicroOrganismos;

    @FindBy(how = How.ID, using = "dt_inicio_lote")
    public WebElement dataInicioLote;

    @FindBy(how = How.ID, using = "nu_mortalidade_lote")
    public WebElement mortalidadeEstimada;

    @FindBy(how = How.ID, using = "nu_animais_pescados")
    public WebElement qdtAnimaisDespescados;

    @FindBy(how = How.ID, using = "bo_jejum")
    public WebElement animaisSubmetidosJejum;

    @FindBy(how = How.ID, using = "bo_arroacados")
    public WebElement animaisArroacados;

    @FindBy(how = How.ID, using = "dt_inicio_pesca")
    public WebElement dataInicioPesca;

    @FindBy(how = How.ID, using = "dt_fim_pesca")
    public WebElement dataFimPesca;

    @FindBy(how = How.ID, using = "apresentacao_materia_prima")
    public WebElement apresentacaoMateriaPrima;

    @FindBy(how = How.ID, using = "bt_inserir")
    public WebElement salvar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"aviso\"]/div/p/strong")
    public WebElement aviso;

    @FindBy(how = How.XPATH, using = "//button[@type='button']/span[text()='Ok']")
    public WebElement ok;

}
