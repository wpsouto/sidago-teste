package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view;

import gov.goias.agrodefesa.base.view.BaseViewEditImpl;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.containers.EmpresaPageContainerEdit;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.entity.Empresa;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;
import gov.goias.agrodefesa.utils.FileUtils;

public class EmpresaViewEdit extends BaseViewEditImpl {


    public EmpresaViewEdit(Object entity) {
        super(entity, EmpresaPageContainerEdit.class);
    }

    private Empresa getEntity() {
        return (Empresa) entity;
    }

    private EmpresaPageContainerEdit getContainer() {
        return (EmpresaPageContainerEdit) container;
    }


    @Override
    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        informacaoObrigatoria(getEntity().getInformacaoObrigatoria());
        anexarDocumentos(getEntity().getAnexarDocumentos());

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        getContainer().enviarCadastro.click();
    }


    public void informacaoObrigatoria(Empresa.InformacaoObrigatoria informacaoObrigatoria){
        log.debug(Constants.MGS_SELECIONADO, "INFORMACAO OBRIGATORIO");
        BrowserDriver.waitForElement(getContainer().informacaoObrigatoria);
        getContainer().informacaoObrigatoria.click();

        log.debug(Constants.MGS_INSERIDO, "CLASSIFICACAO", informacaoObrigatoria.getClassificacao().getDescricao());
        BrowserDriver.selectByVisibleText(getContainer().classificacao, informacaoObrigatoria.getClassificacao().getDescricao());

        BrowserDriver.waitFor(1);

        if (getContainer().porteEmpresa.isDisplayed()){
            log.debug(Constants.MGS_INSERIDO, "PORTE EMPRESA", informacaoObrigatoria.getPorteEmpresa());
            BrowserDriver.selectByVisibleText(getContainer().porteEmpresa, informacaoObrigatoria.getPorteEmpresa());
        }

        if (getContainer().qtdAnimaisConfinados.isDisplayed()){
            log.debug(Constants.MGS_INSERIDO, "QTD ANIMAIS CONFINADOS", informacaoObrigatoria.getQtdAnimaisConfinados());
            getContainer().qtdAnimaisConfinados.clear();
            getContainer().qtdAnimaisConfinados.sendKeys(informacaoObrigatoria.getQtdAnimaisConfinados());
        }

        if (getContainer().qtdAnimaisProcessados.isDisplayed()){
            log.debug(Constants.MGS_INSERIDO, "QTD ANIMAIS PROCESSADOS", informacaoObrigatoria.getQtdAnimaisProcessados());
            getContainer().qtdAnimaisProcessados.clear();
            getContainer().qtdAnimaisProcessados.sendKeys(informacaoObrigatoria.getQtdAnimaisProcessados());
        }

        if (getContainer().numeroServicoInspecao.isDisplayed()){
            log.debug(Constants.MGS_INSERIDO, "NUMERO SERVICO INSPECAO", informacaoObrigatoria.getQtdAnimaisConfinados());
            getContainer().numeroServicoInspecao.clear();
            getContainer().numeroServicoInspecao.sendKeys(informacaoObrigatoria.getNumeroServicoInspecao());
        }

        if (getContainer().capacidadeAlojamento.isDisplayed()){
            log.debug(Constants.MGS_INSERIDO, "CAPACIDADE ALOJAMENTO", informacaoObrigatoria.getCapacidadeAlojamento());
            getContainer().capacidadeAlojamento.clear();
            getContainer().capacidadeAlojamento.sendKeys(informacaoObrigatoria.getCapacidadeAlojamento());
        }

        if (getContainer().qtdLitrosLeite.isDisplayed()){
            log.debug(Constants.MGS_INSERIDO, "QTD LISTRO DE LEITE", informacaoObrigatoria.getQtdLitrosLeite());
            getContainer().qtdLitrosLeite.clear();
            getContainer().qtdLitrosLeite.sendKeys(informacaoObrigatoria.getQtdLitrosLeite());
        }

        if (getContainer().numeroRenasem.isDisplayed()){
            log.debug(Constants.MGS_INSERIDO, "NUMERO RENASEM", informacaoObrigatoria.getNumeroRenasem());
            getContainer().numeroRenasem.clear();
            getContainer().numeroRenasem.sendKeys(informacaoObrigatoria.getNumeroRenasem());
        }

    }

    public void anexarDocumentos(Empresa.AnexarDocumentos anexarDocumentos) {
        log.debug(Constants.MGS_SELECIONADO, "ANEXAR DOCUMENTOS");
        BrowserDriver.waitForElement(getContainer().anexarDocumentos);
        getContainer().anexarDocumentos.click();
        getContainer().credenciamentoInicial.click();
        upload(FileUtils.getFileFromResource(anexarDocumentos.getAnexo()).getPath());
    }

    public void upload(String fileUpload){
        String[] tiposDoc = getContainer().arquivosFaltantes.getText().replaceAll("\\<.*?>", "").split("\\*");

        for (int i = 1; i < tiposDoc.length; i++) {
            BrowserDriver.scrollTop();
            getContainer().adicionarAnexo.click();
            BrowserDriver.waitForElement(getContainer().tipoDocumento);
            BrowserDriver.selectByVisibleText(getContainer().tipoDocumento, tiposDoc[i].trim());

            if (getContainer().vencimento.isDisplayed()) {
                BrowserDriver.scrollTop();
                getContainer().dataVencimento.clear();
                now(getContainer().dataVencimento);
            }

            BrowserDriver.executeScript("arguments[0].style.display ='block';", getContainer().file);
            getContainer().file.sendKeys(fileUpload);
            getContainer().confirmar.click();
            BrowserDriver.waitForElementIsNotPresent(getContainer().tipoDocumento);
        }
    }


}
