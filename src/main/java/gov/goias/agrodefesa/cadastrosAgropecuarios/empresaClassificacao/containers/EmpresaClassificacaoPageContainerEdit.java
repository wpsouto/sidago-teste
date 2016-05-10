package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.containers;

import gov.goias.agrodefesa.base.containers.PageContainerEdit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmpresaClassificacaoPageContainerEdit  extends PageContainerEdit {

    @FindBy(how = How.ID, using = "ds_classificacao")
    public WebElement classificacao;


}
