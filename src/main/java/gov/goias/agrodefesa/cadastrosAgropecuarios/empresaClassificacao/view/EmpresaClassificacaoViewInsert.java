package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.containers.EmpresaClassificacaoPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class EmpresaClassificacaoViewInsert {
	private static final Logger LOGGER = Logger.getLogger(EmpresaClassificacaoViewInsert.class.getName());
	private static final EmpresaClassificacaoPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), EmpresaClassificacaoPageContainerInsert.class);

	public static void isDisplayedCheck(){
		LOGGER.info("Verificando - Incluir Registro e exibida");
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void tipoClassificacao(String valor){
        LOGGER.info("Inserindo valor no campo Descrição");
        BrowserDriver.getDropDownOption(conteiner.tipoClassificacao, valor).click();
    }

    public static void classificacao(String valor){
        LOGGER.info("Inserindo valor no campo Descrição");
        conteiner.classificacao.clear();
        conteiner.classificacao.sendKeys(valor);
    }

    public static void salvar() {
        LOGGER.info("Salvando os dados");
        conteiner.salvar.click();
    }

    public static void aviso(String valor) {
        LOGGER.info("Mensagem de aviso");
        BrowserDriver.waitForElement(conteiner.aviso);
        Assert.assertEquals(conteiner.aviso.getText(), valor);
        conteiner.ok.click();
    }

}
