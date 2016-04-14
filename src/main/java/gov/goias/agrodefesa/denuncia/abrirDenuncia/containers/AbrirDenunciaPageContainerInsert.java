package gov.goias.agrodefesa.denuncia.abrirDenuncia.containers;

import gov.goias.agrodefesa.padrao.containers.PageContainerInsert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AbrirDenunciaPageContainerInsert extends PageContainerInsert {

    @FindBy(how = How.ID, using = "id_tipoinfracao")
    public WebElement tipoInfracao;

    @FindBy(how = How.ID, using = "ds_assunto")
    public WebElement assunto;

}
