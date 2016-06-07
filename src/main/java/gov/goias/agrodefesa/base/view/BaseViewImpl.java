package gov.goias.agrodefesa.base.view;

import gov.goias.agrodefesa.base.containers.PageContainerBase;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by usuario on 26/04/16.
 * *
 */
public class BaseViewImpl implements BaseView {

    protected final Logger log = LoggerFactory.getLogger(this.getClass());
    public Object container;
    public Object entity;

    public BaseViewImpl() {
    }

    public BaseViewImpl(Object entity, Class<?> pageClassToProxy) {
        this.container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), pageClassToProxy);
        this.entity = entity;
    }

    public void autoComplete(String valor, WebElement key, WebElement complete) {
        key.sendKeys(valor);
        BrowserDriver.waitForElement(complete);
        complete.click();
    }

    public void now(WebElement datePicker) {
        datePicker.click();
        BrowserDriver.waitForElement(((PageContainerBase) container).now);
        ((PageContainerBase) container).now.click();
        BrowserDriver.waitForElementIsNotPresent(((PageContainerBase) container).now);
    }

    @Override
    public void setEntity(Object entity) {
        this.entity = entity;
    }
}
