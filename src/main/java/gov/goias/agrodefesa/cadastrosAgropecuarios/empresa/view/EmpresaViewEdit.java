package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.entity.Empresa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.containers.EmpresaPageContainerEdit;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import gov.goias.agrodefesa.utils.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmpresaViewEdit {
    private static final Logger log = LoggerFactory.getLogger(EmpresaViewEdit.class);
	private static final EmpresaPageContainerEdit conteiner = PageFactory.initElements(BrowserDriver.getCurrentDriver(), EmpresaPageContainerEdit.class);

	public static void isDisplayedCheck(){
        log.debug(Constants.MGS_AGUARDANDO);
		BrowserDriver.waitForElement(conteiner.home);
		conteiner.home.isDisplayed();
	}

    public static void informacaoObrigatoria(Empresa.InformacaoObrigatoria informacaoObrigatoria){
        log.debug(Constants.MGS_SELECIONADO, "INFORMACAO OBRIGATORIO");
        BrowserDriver.waitForElement(conteiner.informacaoObrigatoria);
        conteiner.informacaoObrigatoria.click();

        log.debug(Constants.MGS_INSERIDO, "CLASSIFICACAO", informacaoObrigatoria.getClassificacao().getDescricao());
        BrowserDriver.selectByVisibleText(conteiner.classificacao, informacaoObrigatoria.getClassificacao().getDescricao());

        BrowserDriver.waitFor(1);

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

    public static void anexarDocumentos(Empresa.AnexarDocumentos anexarDocumentos) {
        log.debug(Constants.MGS_SELECIONADO, "ANEXAR DOCUMENTOS");
        BrowserDriver.waitForElement(conteiner.anexarDocumentos);
        conteiner.anexarDocumentos.click();
        conteiner.credenciamentoInicial.click();
        upload(FileUtils.getFileFromResource(anexarDocumentos.getAnexo()).getPath());
    }

    public static void upload(String fileUpload){
        String[] tiposDoc = conteiner.arquivosFaltantes.getText().replaceAll("\\<.*?>", "").split("\\*");
        JavascriptExecutor executor =  ((JavascriptExecutor) BrowserDriver.getCurrentDriver());

        for (int i = 1; i < tiposDoc.length; i++) {
            //BrowserDriver.waitForElement(conteiner.adicionarAnexo);
            executor.executeScript("scroll(250, 0)");
            conteiner.adicionarAnexo.click();
            BrowserDriver.waitForElement(conteiner.tipoDocumento);
            BrowserDriver.selectByVisibleText(conteiner.tipoDocumento, tiposDoc[i].trim());

            if (conteiner.dataVencimento.isDisplayed()) {
                conteiner.dataVencimento.sendKeys("");
                conteiner.dataAtual.click();
            }

            String js = "arguments[0].style.display ='block';";
            executor.executeScript(js, conteiner.file);
            conteiner.file.sendKeys(fileUpload);
            conteiner.confirmar.click();
            BrowserDriver.waitForElementIsNotPresent(By.id("id_documentorequerido"));
        }
    }

    public static void salvar() {
        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.waitForElement(conteiner.salvar);
        conteiner.salvar.click();
    }

    public static void enviarCadastro() {
        log.debug(Constants.MGS_SELECIONADO, "ENVIAR CADASTRO");
        conteiner.enviarCadastro.click();
    }

    public static void aviso(String valor) {
        log.debug(Constants.MGS_MENSAGEM, valor);
        BrowserDriver.waitForElement(conteiner.aviso);
        Assert.assertEquals(conteiner.aviso.getText(), valor);
        conteiner.ok.click();
    }


}
