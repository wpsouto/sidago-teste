package gov.goias.agrodefesa.base.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageContainerHome extends PageContainerBase {

    @FindBy(how = How.ID, using = "bt_pesquisar")
    public WebElement home;

    @FindBy(how = How.XPATH, using = "//*[@id=\"icons\"]/li[1]/span")
    public WebElement incluirRegistro;

    @FindBy(how = How.ID, using = "bt_pesquisar")
    public WebElement pesquisar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"grid\"]/form/table/tbody/tr[1]")
    public WebElement gridRow;

    @FindBy(how = How.CSS, using = "#listagemOperacao > #icons > li.ui-state-default.ui-corner-all > span.ui-icon.ui-icon-document")
    public WebElement document;

    @FindBy(how = How.CSS, using = "#listagemOperacao > #icons > li.ui-state-default.ui-corner-all > span.ui-icon.ui-icon-pencil")
    public WebElement pencil;

    @FindBy(how = How.CSS, using = "#listagemOperacao > #icons > li.ui-state-default.ui-corner-all > span.ui-icon.ui-icon-check")
    public WebElement check;

    @FindBy(how = How.CSS, using = "#listagemOperacao > #icons > li.ui-state-default.ui-corner-all > span.ui-icon.ui-icon-comment")
    public WebElement comment;

    @FindBy(how = How.CSS, using = "#listagemOperacao > #icons > li.ui-state-default.ui-corner-all > span.ui-icon.ui-icon-close")
    public WebElement close;


}
