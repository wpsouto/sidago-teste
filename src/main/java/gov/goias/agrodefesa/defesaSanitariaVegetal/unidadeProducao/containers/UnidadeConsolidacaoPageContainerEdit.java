package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.containers;

import gov.goias.agrodefesa.base.containers.PageContainerEdit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UnidadeConsolidacaoPageContainerEdit extends PageContainerEdit {

    @FindBy(how = How.ID, using = "ds_localidadedolivro")
    public WebElement localidadeLivro;

}
