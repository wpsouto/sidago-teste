package gov.goias.agrodefesa.padrao.view;

import gov.goias.agrodefesa.denuncia.abrirDenuncia.containers.AbrirDenunciaPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ViewHome extends BaseView {
	private static final AbrirDenunciaPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AbrirDenunciaPageContainerHome.class);


}
