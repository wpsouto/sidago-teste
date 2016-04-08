package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view;

import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.Empresa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.containers.EmpresaPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import gov.goias.agrodefesa.utils.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
    }

    public static void informacaoComplementar(){
        log.debug(Constants.MGS_SELECIONADO, "INFORMACAO COMPLEMENTAR");
        BrowserDriver.waitForElement(conteiner.informacaoComplementar);
        conteiner.informacaoComplementar.click();
        conteiner.adicionarEndereco.click();
        conteiner.confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(By.id("div_id_endereco"));
    }

/*
    public static void anexarDocumentos(Empresa.AnexarDocumentos anexarDocumentos) {
        log.debug(Constants.MGS_SELECIONADO, "ANEXAR DOCUMENTOS");
        BrowserDriver.waitForElement(conteiner.anexarDocumentos);
        conteiner.anexarDocumentos.click();

        String fileName = FileUtils.getFileFromResource(anexarDocumentos.getAnexo()).getPath();
        upload( "ANOTAÇÃO DE RESPONSABILIDADE TÉCNICA (VETERINÁRIO)", fileName);
        upload( "CARTEIRA DE IDENTIDADE PROFISSIONAL - RT", fileName);
        upload( "TERMO DE FISCALIZAÇÃO", fileName);
        upload( "COMPROVANTE DE ENDEREÇO", fileName);
        upload( "TERMO DE RESPONSABILIDADE - RT", fileName);
        upload( "COMPROVANTE DE ENDERECO DO RT", fileName);
        upload( "REQUERIMENTO DE RT", fileName);
        upload( "CERTIDAO NEGATIVA DE REGISTRO DO RT", fileName);
        upload( "LAUDO DE VISTORIA - ANIMAL", fileName);
        upload( "CONTRATO SOCIAL", fileName);
        upload( "REQUERIMENTO", fileName);
    }
*/

    public static void anexarDocumentos(Empresa.AnexarDocumentos anexarDocumentos) {
        log.debug(Constants.MGS_SELECIONADO, "ANEXAR DOCUMENTOS");
        BrowserDriver.waitForElement(conteiner.anexarDocumentos);
        conteiner.anexarDocumentos.click();
        upload(FileUtils.getFileFromResource(anexarDocumentos.getAnexo()).getPath());
    }

/*
    public static void upload(String tipoDocumento, String fileUpload){
        conteiner.adicionarAnexo.click();
        BrowserDriver.waitForElement(conteiner.anexo);
        BrowserDriver.selectByVisibleText(conteiner.tipoDocumento, tipoDocumento);
        if (conteiner.dataVencimento.isDisplayed()){
            conteiner.dataVencimento.sendKeys("");
            conteiner.dataAtual.click();
        }

        JavascriptExecutor executor =  ((JavascriptExecutor) BrowserDriver.getCurrentDriver());
        String js = "arguments[0].style.display ='block';";
        executor.executeScript(js, conteiner.file);
        conteiner.file.sendKeys(fileUpload);
        conteiner.confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(By.id("div_id_anexo"));
    }
*/

    public static void upload(String fileUpload){
        conteiner.adicionarAnexo.click();
        BrowserDriver.waitForElement(conteiner.tipoDocumento);

        Integer options = BrowserDriver.getDropDownOptions(conteiner.tipoDocumento).size();
        log.debug("Quantidade de documentos encontrados {}", options);

        for (int i = 1; i < options; i++) {
            log.debug("Elemento {}", i);
            BrowserDriver.selectByIndex(conteiner.tipoDocumento, i);
            if (conteiner.dataVencimento.isDisplayed()) {
                conteiner.dataVencimento.sendKeys("");
                conteiner.dataAtual.click();
            }

            JavascriptExecutor executor =  ((JavascriptExecutor) BrowserDriver.getCurrentDriver());
            String js = "arguments[0].style.display ='block';";
            executor.executeScript(js, conteiner.file);
            conteiner.file.sendKeys(fileUpload);
            conteiner.confirmar.click();

            BrowserDriver.waitForElementIsNotPresent(By.id("div_id_anexo"));

            if (i != options-1) {
                executor.executeScript("scroll(250, 0)");
                conteiner.adicionarAnexo.click();
                BrowserDriver.waitForElement(conteiner.tipoDocumento);
            }
        }
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
