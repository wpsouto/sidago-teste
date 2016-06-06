package gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.containers.PropriedadePageContainerInsert;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.entity.Propriedade;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = PropriedadePageContainerInsert.class)
public class PropriedadeViewInsert  extends BaseViewInsertImpl {

    private Propriedade getEntity() {
        return (Propriedade) entity;
    }

    private PropriedadePageContainerInsert getContainer() {
        return (PropriedadePageContainerInsert) container;
    }

    @Override
    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        log.debug(Constants.MGS_INSERIDO, "PRODUTOR", getEntity().getPessoa().getCpfCnpj());
        getContainer().produtor.clear();
        getContainer().produtor.sendKeys(getEntity().getPessoa().getCpfCnpj());
        BrowserDriver.waitForElement(getContainer().produtorAutoComplete);
        getContainer().produtorAutoComplete.click();

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisarSEFAZ.click();

        log.debug(Constants.MGS_SELECIONADO, "CLIQUE AQUI");
        BrowserDriver.waitForElement(getContainer().cliqueAqui);
        getContainer().cliqueAqui.click();

        log.debug(Constants.MGS_INSERIDO, "NOME PROPRIEDADE", getEntity().getNomePropriedade());
        BrowserDriver.waitForElement(getContainer().nomePropriedade);
        getContainer().nomePropriedade.sendKeys(getEntity().getNomePropriedade());

        log.debug(Constants.MGS_INSERIDO, "TIPO DE CONTRIBUINTE", getEntity().getTipoContribuinte());
        BrowserDriver.selectByVisibleText(getContainer().tipoDeContribuinte, getEntity().getTipoContribuinte());

        log.debug(Constants.MGS_INSERIDO, "CONDICAO DE PROPRIEDADE", getEntity().getCondicaoPropriedade());
        BrowserDriver.selectByVisibleText(getContainer().condicaoDePropriedade, getEntity().getCondicaoPropriedade());

        adionarEndereco();
        adionarResponsavelTecnico();
        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }

    public void adionarEndereco(){
        log.debug(Constants.MGS_SELECIONADO, "ADIONAR ENDERECO");
        getContainer().adicionarEndereco.click();
        BrowserDriver.waitForElement(getContainer().adicionarEnderecoHome);
        BrowserDriver.selectByVisibleText(getContainer().tipoEndereco, getEntity().getEndereco().getTipoEndereco());
        getContainer().endereco.sendKeys(getEntity().getEndereco().getEndereco());
        getContainer().bairro.sendKeys(getEntity().getEndereco().getBairro());
        getContainer().cep.sendKeys(getEntity().getEndereco().getCep());
        getContainer().complemento.sendKeys(getEntity().getEndereco().getComplemento());
        getContainer().roteiro.sendKeys(getEntity().getEndereco().getRoteiro());
        getContainer().confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(getContainer().adicionarEnderecoHome);
    }

    public void adionarResponsavelTecnico(){
        log.debug(Constants.MGS_SELECIONADO, "ADICIONAR RESPONSAVEL TECNICO");
        getContainer().adicionarResponsavelTecnico.click();
        BrowserDriver.waitForElement(getContainer().responsavelTecnicoHome);

        log.debug(Constants.MGS_INSERIDO, "NOME RESPONSAVEL TECNICO", getEntity().getResponsavelTecnico());
        getContainer().nomeResponsavelTecnico.sendKeys(getEntity().getResponsavelTecnico());
        BrowserDriver.waitForElement(getContainer().nomeResponsavelTecnicoAutoComplete);
        getContainer().nomeResponsavelTecnicoAutoComplete.click();
        getContainer().confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(getContainer().responsavelTecnicoHome);
    }

}
