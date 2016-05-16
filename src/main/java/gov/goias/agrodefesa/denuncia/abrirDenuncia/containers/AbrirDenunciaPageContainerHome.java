package gov.goias.agrodefesa.denuncia.abrirDenuncia.containers;

import gov.goias.agrodefesa.base.containers.PageContainerHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AbrirDenunciaPageContainerHome extends PageContainerHome {

    @FindBy(how = How.ID, using = "no_tipoinfracao")
    public WebElement tipoInfracao;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-id-3\"]/li[1]")
    public WebElement tipoInfracaoAutoComplete;

}
