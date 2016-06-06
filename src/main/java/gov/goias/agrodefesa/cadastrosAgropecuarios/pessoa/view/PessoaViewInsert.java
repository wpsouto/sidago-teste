package gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewInsertImpl;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.containers.PessoaPageContainerInsert;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = PessoaPageContainerInsert.class)
public class PessoaViewInsert  extends BaseViewInsertImpl {

    private Pessoa getEntity() {
        return (Pessoa) entity;
    }

    private PessoaPageContainerInsert getContainer() {
        return (PessoaPageContainerInsert) container;
    }

    @Override
    public void builder(){
        log.debug(Constants.MGS_AGUARDANDO);
        BrowserDriver.waitForElement(getContainer().home);

        log.debug(Constants.MGS_INSERIDO, "CPF/CNPJ", getEntity().getCpfCnpj());
        getContainer().cpfCnpj.clear();
        getContainer().cpfCnpj.sendKeys(getEntity().getCpfCnpj());

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisarSEFAZ.click();

        log.debug(Constants.MGS_INSERIDO, "NOME EMPRESA", getEntity().getPessoaJuridica().getNomeEmpresa());
        BrowserDriver.waitForElement(getContainer().nomeEmpresa);
        getContainer().nomeEmpresa.sendKeys(getEntity().getPessoaJuridica().getNomeEmpresa());

        log.debug(Constants.MGS_INSERIDO, "NOME FANTASIA", getEntity().getPessoaJuridica().getNomeFantasia());
        BrowserDriver.waitForElement(getContainer().nomeFantasia);
        getContainer().nomeFantasia.sendKeys(getEntity().getPessoaJuridica().getNomeFantasia());

        log.debug(Constants.MGS_SELECIONADO, "ADICIONAR ENDERECO");
        getContainer().adicionarEndereco.click();
        BrowserDriver.waitForElement(getContainer().adicionarEnderecoHome);
        BrowserDriver.selectByVisibleText(getContainer().tipoEndereco, getEntity().getPessoaJuridica().getEndereco().getTipoEndereco());
        getContainer().endereco.sendKeys(getEntity().getPessoaJuridica().getEndereco().getEndereco());
        getContainer().bairro.sendKeys(getEntity().getPessoaJuridica().getEndereco().getBairro());
        getContainer().complemento.sendKeys(getEntity().getPessoaJuridica().getEndereco().getComplemento());
        getContainer().cep.clear();
        getContainer().cep.sendKeys(getEntity().getPessoaJuridica().getEndereco().getCep());
        getContainer().confirmar.click();
        BrowserDriver.waitForElementIsNotPresent(getContainer().adicionarEnderecoHome);

        log.debug(Constants.MGS_SELECIONADO, "SALVAR");
        BrowserDriver.screenshot();
        getContainer().salvar.click();
    }

}
