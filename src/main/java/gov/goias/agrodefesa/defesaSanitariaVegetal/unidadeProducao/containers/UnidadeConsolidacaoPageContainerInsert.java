package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.containers;

import gov.goias.agrodefesa.base.containers.PageContainerInsert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UnidadeConsolidacaoPageContainerInsert extends PageContainerInsert {

    @FindBy(how = How.ID, using = "div_pesquisar_empresa")
    public WebElement pessoaHome;

    @FindBy(how = How.ID, using = "cnpj")
    public WebElement cnpj;

    @FindBy(how = How.LINK_TEXT, using = "Realizar Pesquisa")
    public WebElement realizarPesquisa;

    @FindBy(how = How.ID, using = "nu_inscricao")
    public WebElement inscricaoEstadual;

    @FindBy(how = How.ID, using = "vl_latitude")
    public WebElement latitude;

    @FindBy(how = How.ID, using = "vl_longitude")
    public WebElement longitude;

    @FindBy(how = How.ID, using = "ds_localidadedolivro")
    public WebElement localidadeLivro;

    @FindBy(how = How.ID, using = "qt_capacidadearmazenamento")
    public WebElement capacidadeArmazenamento;


}
