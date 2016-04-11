package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.Empresa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.containers.EmpresaPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmpresaViewInsert {
    private static final Logger log = LoggerFactory.getLogger(EmpresaViewInsert.class);
	private static final EmpresaPageContainerInsert conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), EmpresaPageContainerInsert.class);

	public static void isDisplayedCheck(){
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void documento(String valor){
        log.debug(Constants.MGS_INSERIDO, "DOCUMENTO", valor);
        conteiner.documento.clear();
        conteiner.documento.sendKeys(valor);
    }

    public static void classificacao(String valor){
        log.debug(Constants.MGS_INSERIDO, "CLASSIFICACAO", valor);
        BrowserDriver.selectByVisibleText(conteiner.classificacao, valor);
    }

    public static void pesquisar() {
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        conteiner.pesquisar.click();
        BrowserDriver.waitForElement(conteiner.cliqueAqui);
        conteiner.cliqueAqui.click();
    }

    public static void informacaoObrigatoria(Empresa.InformacaoObrigatoria informacaoObrigatoria){
        log.debug(Constants.MGS_SELECIONADO, "INFORMACAO OBRIGATORIA");
        BrowserDriver.waitForElement(conteiner.informacaoObrigatoria);
        conteiner.informacaoObrigatoria.click();

        conteiner.socio.sendKeys(informacaoObrigatoria.getSocio());
        BrowserDriver.waitForElement(conteiner.socioAutoComplete);
        conteiner.socioAutoComplete.click();

        log.debug(Constants.MGS_INSERIDO, "NOME DA EMPRESA", informacaoObrigatoria.getNomeEmpresa());
        conteiner.nomeEmpresa.sendKeys(informacaoObrigatoria.getNomeEmpresa());

        log.debug(Constants.MGS_INSERIDO, "NOME FANTASIA", informacaoObrigatoria.getNomeFantasia());
        conteiner.nomeFantasia.sendKeys(informacaoObrigatoria.getNomeFantasia());

        if (conteiner.porteEmpresa.isDisplayed()){
            log.debug(Constants.MGS_INSERIDO, "PORTE EMPRESA", informacaoObrigatoria.getPorteEmpresa());
            BrowserDriver.selectByVisibleText(conteiner.porteEmpresa, informacaoObrigatoria.getPorteEmpresa());
        }

        if (conteiner.qtdAnimaisConfinados.isDisplayed()){
            log.debug(Constants.MGS_INSERIDO, "QTD ANIMAIS CONFINADOS", informacaoObrigatoria.getQtdAnimaisConfinados());
            conteiner.qtdAnimaisConfinados.clear();
            conteiner.qtdAnimaisConfinados.sendKeys(informacaoObrigatoria.getQtdAnimaisConfinados());
        }

        if (conteiner.qtdAnimaisProcessados.isDisplayed()){
            log.debug(Constants.MGS_INSERIDO, "QTD ANIMAIS PROCESSADOS", informacaoObrigatoria.getQtdAnimaisProcessados());
            conteiner.qtdAnimaisProcessados.clear();
            conteiner.qtdAnimaisProcessados.sendKeys(informacaoObrigatoria.getQtdAnimaisProcessados());
        }

        if (conteiner.numeroServicoInspecao.isDisplayed()){
            log.debug(Constants.MGS_INSERIDO, "NUMERO SERVICO INSPECAO", informacaoObrigatoria.getQtdAnimaisConfinados());
            conteiner.numeroServicoInspecao.clear();
            conteiner.numeroServicoInspecao.sendKeys(informacaoObrigatoria.getNumeroServicoInspecao());
        }

        if (conteiner.capacidadeAlojamento.isDisplayed()){
            log.debug(Constants.MGS_INSERIDO, "CAPACIDADE ALOJAMENTO", informacaoObrigatoria.getCapacidadeAlojamento());
            conteiner.capacidadeAlojamento.clear();
            conteiner.capacidadeAlojamento.sendKeys(informacaoObrigatoria.getCapacidadeAlojamento());
        }

        if (conteiner.qtdLitrosLeite.isDisplayed()){
            log.debug(Constants.MGS_INSERIDO, "QTD LISTRO DE LEITE", informacaoObrigatoria.getQtdLitrosLeite());
            conteiner.qtdLitrosLeite.clear();
            conteiner.qtdLitrosLeite.sendKeys(informacaoObrigatoria.getQtdLitrosLeite());
        }

        if (conteiner.numeroRenasem.isDisplayed()){
            log.debug(Constants.MGS_INSERIDO, "NUMERO RENASEM", informacaoObrigatoria.getNumeroRenasem());
            conteiner.numeroRenasem.clear();
            conteiner.numeroRenasem.sendKeys(informacaoObrigatoria.getNumeroRenasem());
        }
    }

    public static void informacaoComplementar(){
        BrowserDriver.scrollUp();

        log.debug(Constants.MGS_SELECIONADO, "INFORMACAO COMPLEMENTAR");
        BrowserDriver.waitForClickable(conteiner.informacaoComplementar);
        conteiner.informacaoComplementar.click();
        conteiner.adicionarEndereco.click();
        BrowserDriver.waitForElement(conteiner.confirmar);
        conteiner.confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(By.id("div_id_endereco"));
    }

    public static void salvar() {
        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        conteiner.salvar.click();
    }

    public static void aviso(String valor) {
        log.debug(Constants.MGS_MENSAGEM, valor);
        BrowserDriver.waitForElement(conteiner.aviso);
        Assert.assertEquals(conteiner.aviso.getText(), valor);
        conteiner.ok.click();
    }

}
