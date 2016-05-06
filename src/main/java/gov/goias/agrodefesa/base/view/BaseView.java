package gov.goias.agrodefesa.base.view;

import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by usuario on 26/04/16.
 */
public class BaseView  {

    protected final Logger log = LoggerFactory.getLogger(this.getClass());
    protected Object container;
    protected Object entity;

    public BaseView(Object entity, Class<?> pageClassToProxy) {
        this.container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), pageClassToProxy);
        this.entity = entity;
    }

}
