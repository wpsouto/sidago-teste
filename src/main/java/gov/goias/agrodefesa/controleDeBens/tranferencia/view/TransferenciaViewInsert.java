package gov.goias.agrodefesa.controleDeBens.tranferencia.view;

import gov.goias.agrodefesa.controleDeBens.tranferencia.containers.TransferenciaPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class TransferenciaViewInsert {
	private static final Logger LOGGER = Logger.getLogger(TransferenciaViewInsert.class.getName());
	private static final TransferenciaPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), TransferenciaPageContainerInsert.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando pagina Transferencia - Incluir Registro e exibida");
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void numeroPatrimonio(String valor){
        LOGGER.info("Inserindo valor no campo Numero Patrimonio Agrodefesa");
        conteiner.numeroPatrimonio.clear();
        conteiner.numeroPatrimonio.sendKeys(valor);
        BrowserDriver.waitForElement(conteiner.numeroPatrimonioAutoComplete);
        conteiner.numeroPatrimonioAutoComplete.click();
    }

    public static void destino(String valor){
        LOGGER.info("Inserindo valor no campo Destino");
        conteiner.destinoPatrimonio.clear();
        conteiner.destinoPatrimonio.sendKeys(valor);
        BrowserDriver.waitForElement(conteiner.destinoPatrimonioAutoComplete);
        conteiner.destinoPatrimonioAutoComplete.click();
    }

    public static void conservacao(String valor) {
        LOGGER.info("Inserindo valor no campo Conservacao");
        BrowserDriver.getDropDownOption(conteiner.conservacao, valor).click();
    }

    public static void manutencao(String valor) {
        LOGGER.info("Inserindo valor no campo Manutencao: "+valor);
        BrowserDriver.getDropDownOption(conteiner.manutencao, valor).click();
    }

    public static void observacao(String valor) {
        LOGGER.info("Inserindo valor no campo Observacao: "+valor);
        BrowserDriver.getDropDownOption(conteiner.observacao, valor).click();
    }

    public static void salvar() {
        LOGGER.info("Salvando os dados");
        BrowserDriver.waitForElement(conteiner.salvar);
        conteiner.salvar.click();
    }

    public static void aviso(String valor) {
        LOGGER.info("Mensagem de aviso");
        BrowserDriver.waitForElement(conteiner.aviso);
        Assert.assertEquals(conteiner.aviso.getText(), valor);
        conteiner.ok.click();
    }

}
