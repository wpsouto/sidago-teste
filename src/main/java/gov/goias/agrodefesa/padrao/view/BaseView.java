package gov.goias.agrodefesa.padrao.view;

import gov.goias.agrodefesa.denuncia.abrirDenuncia.containers.AbrirDenunciaPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseView<T> {
    protected static Object container;
    protected final Logger log = LoggerFactory.getLogger(this.getClass());

    public BaseView(Class<T> pageClassToProxy)  {
        log.debug("TESTEEEEEEEEEEEEEEEEEEE  {}", pageClassToProxy);
        this.container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), pageClassToProxy);
    }
}
