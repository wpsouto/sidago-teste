package gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.containers;

import gov.goias.agrodefesa.base.containers.PageContainerEdit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PessoaPageContainerEdit   extends PageContainerEdit {

    @FindBy(how = How.ID, using = "nome_pessoa_juridica")
    public WebElement nomeEmpresa;

}
