package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.containers.EmpresaClassificacaoPageContainerEdit;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class EmpresaClassificacaoViewEdit {
	private static final Logger LOGGER = Logger.getLogger(EmpresaClassificacaoViewEdit.class.getName());
	private static final EmpresaClassificacaoPageContainerEdit conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), EmpresaClassificacaoPageContainerEdit.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando pagina Almoxarifado - Editar Registro e exibida");
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void classificacao(String valor){
        LOGGER.info("Inserindo valor no campo Descrição");
        conteiner.classificacao.clear();
        conteiner.classificacao.sendKeys(valor);
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
