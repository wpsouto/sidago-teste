package gov.goias.agrodefesa.concessaoDeDiarias.assinaturaDeDiarias.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.concessaoDeDiarias.assinaturaDeDiarias.containers.AssinaturaDeDiariasPageContainerHome;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.entity.DelegacaoAtividade;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = AssinaturaDeDiariasPageContainerHome.class)
public class AssinaturaDeDiariasViewHome extends BaseViewHomeImpl {

    private DelegacaoAtividade getEntity() {
        return (DelegacaoAtividade) entity;
    }

    private AssinaturaDeDiariasPageContainerHome getContainer() {
        return (AssinaturaDeDiariasPageContainerHome) container;
    }

    @Override
    public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "NUMERO", getEntity().getNumeroDiaria());
        getContainer().numeroDaDiaria.sendKeys(getEntity().getNumeroDiaria());

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
    }

    @Override
    public void confirm() {
        log.debug(Constants.MGS_SELECIONADO, "OPERACAO INFORMACOES DETALHADAS");
        BrowserDriver.waitForText(getContainer().gridRow, getEntity().getNumeroDiaria());
        getContainer().gridInformacoesDetalhadas.click();

        log.debug(Constants.MGS_SELECIONADO, "ASSINAR DIARIA");
        BrowserDriver.waitForElement(getContainer().assinarHome);
        getContainer().assinar.click();

        log.debug(Constants.MGS_SELECIONADO, "OK");
        BrowserDriver.waitForElement(getContainer().ok);
        getContainer().ok.click();

    }

    public void aviso(){
        log.debug(Constants.MGS_SELECIONADO, "OPERACAO CONFIRMAR");
        BrowserDriver.closeAlert();//waitForText(getContainer().assinarHome, "Diária assinada com sucesso.");
    }


}

