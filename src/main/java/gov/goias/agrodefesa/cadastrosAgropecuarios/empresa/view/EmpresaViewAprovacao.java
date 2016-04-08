package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.Classificacao;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.Grupo;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.Label;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.containers.EmpresaPageContainerAprovacao;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class EmpresaViewAprovacao {
    private static final Logger log = LoggerFactory.getLogger(EmpresaViewAprovacao.class);
	private static final EmpresaPageContainerAprovacao conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), EmpresaPageContainerAprovacao.class);

	public static void isDisplayedCheck(){
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void validar(String id) {
        Grupo grupo = new Grupo();
        grupo.initialize(Integer.valueOf(id));

        String table = conteiner.table.getText();
        Enumeration names = grupo.labels().keys();
        while(names.hasMoreElements()) {
            String str = (String) names.nextElement();
            //log.debug(Constants.MGS_MENSAGEM, String.format("validando Label %s", str));
            Boolean valido = table.contains(str) == grupo.labels().get(str).booleanValue();
            Assert.assertTrue(String.format("Label %s %s encontrado", str, valido?"":"não"), valido);
        }
    }

}
