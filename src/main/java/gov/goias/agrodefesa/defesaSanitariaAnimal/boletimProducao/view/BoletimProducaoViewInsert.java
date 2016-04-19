package gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.view;

import gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.containers.BoletimProducaoPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoletimProducaoViewInsert {
    private static final Logger log = LoggerFactory.getLogger(BoletimProducaoViewInsert.class);
	private static final BoletimProducaoPageContainerInsert container = PageFactory.initElements(BrowserDriver.getCurrentDriver(), BoletimProducaoPageContainerInsert.class);

	public static void isDisplayedCheck(){
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(container.home);
		container.home.isDisplayed();
	}

    public static void propriedade(String valor){
        log.debug(Constants.MGS_INSERIDO, "PROPRIEDADE", valor);
        container.pesquisar.click();
        BrowserDriver.waitForElement(container.cnpjCpf);
        container.cnpjCpf.sendKeys(valor);
        container.realizarPesquisa.click();
        BrowserDriver.waitForElement(container.selecionar);
        container.selecionar.click();
    }

    public static void materiaPrimaOrigem(String valor){
        log.debug(Constants.MGS_INSERIDO, "ASSUNTO", valor);
        BrowserDriver.selectByVisibleText(container.materiaPrimaOrigem, valor);
    }

    public static void totalAnimaisAlojados(String valor){
        log.debug(Constants.MGS_INSERIDO, "TOTAL ANIMAIS ALOJADOS", valor);
        container.totalDeAnimaisAlojados.clear();
        container.totalDeAnimaisAlojados.sendKeys(valor);
    }

    public static void monitoramentoMicroOrganismos(String valor){
        log.debug(Constants.MGS_INSERIDO, "MONITORAMENTO MICRO ORGANISMOS", valor);
        BrowserDriver.selectByVisibleText(container.monitoramentoMicroOrganismos, valor);
    }

    public static void dataInicioLote(String valor){
        log.debug(Constants.MGS_INSERIDO, "DATA INICIO LOTE", valor);
        container.dataInicioLote.click();
        container.now.click();
    }

    public static void mortalidadeEstimada(String valor){
        log.debug(Constants.MGS_INSERIDO, "MORTALIDADE ESTIMADA", valor);
        container.mortalidadeEstimada.clear();
        container.mortalidadeEstimada.sendKeys(valor);
    }

    public static void qdtAnimaisDespescados(String valor){
        log.debug(Constants.MGS_INSERIDO, "QDT ANIMAIS DESPESCADOS", valor);
        container.qdtAnimaisDespescados.clear();
        container.qdtAnimaisDespescados.sendKeys(valor);
    }

    public static void animaisSubmetidosJejum(String valor){
        log.debug(Constants.MGS_INSERIDO, "ANIMAIS SUBMETIDOS JEJUM", valor);
        BrowserDriver.selectByVisibleText(container.animaisSubmetidosJejum, valor);
    }

    public static void animaisArroacados(String valor){
        log.debug(Constants.MGS_INSERIDO, "ANIMAIS ARROACADOS", valor);
        BrowserDriver.selectByVisibleText(container.animaisArroacados, valor);
    }

    public static void dataInicioPesca(String valor){
        log.debug(Constants.MGS_INSERIDO, "DATA INICIO PESCA", valor);
        container.dataInicioPesca.click();
        container.now.click();
    }

    public static void dataFimPesca(String valor){
        log.debug(Constants.MGS_INSERIDO, "DATA FIM PESCA", valor);
        container.dataFimPesca.click();
        container.now.click();
    }

    public static void apresentacaoMateriaPrima(String valor){
        log.debug(Constants.MGS_INSERIDO, "APRESENTACAO MATERIA PRIMA", valor);
        BrowserDriver.selectByVisibleText(container.apresentacaoMateriaPrima, valor);
    }

    public static void salvar() {
        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        container.salvar.click();
    }

    public static void aviso(String valor) {
        log.debug(Constants.MGS_MENSAGEM, valor);
        BrowserDriver.waitForElement(container.aviso);
        Assert.assertEquals(container.aviso.getText(), valor);
        container.ok.click();
    }

}
