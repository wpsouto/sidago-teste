package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.containers;

import gov.goias.agrodefesa.base.containers.PageContainerInsert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmpresaClassificacaoPageContainerInsert extends PageContainerInsert {

    @FindBy(how = How.ID, using = "tp_classificacao")
    public WebElement tipoClassificacao;

    @FindBy(how = How.ID, using = "ds_classificacao")
    public WebElement classificacao;


}
