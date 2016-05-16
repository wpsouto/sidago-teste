package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmpresaClassificacaoPageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "ds_classificacao")
    public WebElement classificacao;

}
