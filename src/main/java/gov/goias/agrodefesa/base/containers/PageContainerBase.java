package gov.goias.agrodefesa.base.containers;

import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.support.PageFactory;

public class PageContainerBase {

    private PageContainerHome home = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PageContainerHome.class);
    private PageContainerInsert insert = PageFactory.initElements(BrowserDriver.getCurrentDriver(), PageContainerInsert.class);

    public PageContainerHome getHome() {
        return home;
    }

    public PageContainerInsert getInsert() {
        return insert;
    }
}
