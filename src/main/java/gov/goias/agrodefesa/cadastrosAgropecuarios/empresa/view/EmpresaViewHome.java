package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.view;

import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.containers.EmpresaPageContainerHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.entity.Empresa;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

public class EmpresaViewHome extends BaseViewHomeImpl {

    public EmpresaViewHome(Object entity) {
        super(entity, EmpresaPageContainerHome.class);
    }

    private Empresa getEntity() {
        return (Empresa) entity;
    }

    private EmpresaPageContainerHome getContainer() {
        return (EmpresaPageContainerHome) container;
    }

    @Override
    public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "DOCUMENTO", getEntity().getInformacaoObrigatoria().getCpfCnpj());
        getContainer().documento.sendKeys(getEntity().getInformacaoObrigatoria().getCpfCnpj());
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
        BrowserDriver.waitForElement(getContainer().gridRow);
        getEntity().setAguardandoEnvioCadastro(getContainer().gridRow.getText().contains("Aguardando Envio Cadastro"));
    }

    public void aprovar(){
        if (getEntity().getAguardandoEnvioCadastro()) {
            pesquisar();
        }

        log.debug(Constants.MGS_SELECIONADO, "APROVAR");
        BrowserDriver.scrollTo(getContainer().comment);
        getContainer().comment.click();

    }

}
