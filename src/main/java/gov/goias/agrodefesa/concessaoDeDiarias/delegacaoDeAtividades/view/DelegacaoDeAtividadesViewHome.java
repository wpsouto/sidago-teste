package gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.view;

import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.containers.DelegacaoDeAtividadesPageContainerHome;
import gov.goias.agrodefesa.utils.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class DelegacaoDeAtividadesViewHome {
	private static final DelegacaoDeAtividadesPageContainerHome container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), DelegacaoDeAtividadesPageContainerHome.class);

	public static void isDisplayedCheck(){
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void incluirRegistro(){
        BrowserDriver.waitForElement(container.incluirRegistro);
        container.incluirRegistro.click();
    }

	public static void nomeDoServidor(String valor){
		container.nomeDoServidor.clear();
        container.nomeDoServidor.sendKeys(valor);
	}

	public static void dataSaida(String valor){
		container.dataSaida.sendKeys(valor);
		container.dataSaida.clear();
		container.dataSaida.sendKeys(valor);
	}

	public static void dataChegada(String valor){
		container.dataChegada.sendKeys(valor);
		container.dataChegada.clear();
		container.dataChegada.sendKeys(valor);
	}

    public static void pesquisar() {
		container.pesquisar.click();
	}

	public static void pesquisarCheck() {
		BrowserDriver.waitForElement(container.gridNomeServidor);
		container.gridNomeServidor.isDisplayed();
        Assert.assertEquals(container.nomeDoServidor.getAttribute("value"), container.gridNomeServidor.getText());
	}

    public static String getNumeroDiaria() {
        BrowserDriver.waitForElement(container.gridNumero);
        return container.gridNumero.getText();
    }



}
