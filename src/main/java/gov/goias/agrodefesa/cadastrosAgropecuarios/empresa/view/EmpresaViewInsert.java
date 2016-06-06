package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.entity.Empresa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.containers.EmpresaPageContainerInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = EmpresaPageContainerInsert.class)
public class EmpresaViewInsert extends BaseViewInsertImpl {

    private Empresa getEntity() {
        return (Empresa) entity;
    }

    private EmpresaPageContainerInsert getContainer() {
        return (EmpresaPageContainerInsert) container;
    }

    @Override
    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        log.debug(Constants.MGS_INSERIDO, "DOCUMENTO", getEntity().getInformacaoObrigatoria().getCpfCnpj());
        getContainer().documento.clear();
        getContainer().documento.sendKeys(getEntity().getInformacaoObrigatoria().getCpfCnpj());

        log.debug(Constants.MGS_INSERIDO, "CLASSIFICACAO", getEntity().getInformacaoObrigatoria().getClassificacao());
        BrowserDriver.selectByVisibleText(getContainer().classificacao, getEntity().getInformacaoObrigatoria().getClassificacao().getDescricao());

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisarEmpresa.click();
        BrowserDriver.waitForElement(getContainer().cliqueAqui);
        getContainer().cliqueAqui.click();

        informacaoObrigatoria(getEntity().getInformacaoObrigatoria());
        informacaoComplementar(getEntity().getInformacaoComplementar());

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }

    private void informacaoObrigatoria(Empresa.InformacaoObrigatoria informacaoObrigatoria){
        log.debug(Constants.MGS_SELECIONADO, "INFORMACAO OBRIGATORIA");
        BrowserDriver.waitForElement(getContainer().informacaoObrigatoria);
        getContainer().informacaoObrigatoria.click();

        getContainer().socio.sendKeys(informacaoObrigatoria.getSocio());
        BrowserDriver.waitForElement(getContainer().socioAutoComplete);
        getContainer().socioAutoComplete.click();

        log.debug(Constants.MGS_INSERIDO, "NOME DA EMPRESA", informacaoObrigatoria.getNomeEmpresa());
        getContainer().nomeEmpresa.sendKeys(informacaoObrigatoria.getNomeEmpresa());

        log.debug(Constants.MGS_INSERIDO, "NOME FANTASIA", informacaoObrigatoria.getNomeFantasia());
        getContainer().nomeFantasia.sendKeys(informacaoObrigatoria.getNomeFantasia());

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

    public void informacaoComplementar(Empresa.InformacaoComplementar informacaoComplementar){
        BrowserDriver.scrollTop();

        log.debug(Constants.MGS_SELECIONADO, "INFORMACAO COMPLEMENTAR");
        BrowserDriver.waitForClickable(getContainer().informacaoComplementar);
        getContainer().informacaoComplementar.click();

        getContainer().adicionarEndereco.click();
        BrowserDriver.waitForElement(getContainer().enderecoHome);
        getContainer().confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(getContainer().enderecoHome);

        getContainer().adicionarEmail.click();
        BrowserDriver.waitForElement(getContainer().emailHome);
        BrowserDriver.selectByVisibleText(getContainer().tipoEmail, informacaoComplementar.geteMail().getTipo());
        getContainer().eMail.sendKeys(informacaoComplementar.geteMail().getEMail());
        getContainer().confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(getContainer().emailHome);
    }

}
