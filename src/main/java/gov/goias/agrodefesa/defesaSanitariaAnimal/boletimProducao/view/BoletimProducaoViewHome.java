package gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.containers.BoletimProducaoPageContainerHome;
import gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.entity.BoletimProducao;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = BoletimProducaoPageContainerHome.class)
public class BoletimProducaoViewHome extends BaseViewHomeImpl {

    private BoletimProducao getEntity() {
        return (BoletimProducao) entity;
    }

    private BoletimProducaoPageContainerHome getContainer() {
        return (BoletimProducaoPageContainerHome) container;
    }

    @Override
    public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "CPF/CNPJ PRODUTOR", getEntity().getPropriedade().getPessoa().getCpfCnpj());
        getContainer().cpfCnpjProdutor.sendKeys(getEntity().getPropriedade().getPessoa().getCpfCnpj());

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
    }

    public void aviso() {
        log.debug(Constants.MGS_MENSAGEM, "Boletim de produção cancelado com sucesso.");
        BrowserDriver.waitForText(getContainer().boxDelete, "Boletim de produção cancelado com sucesso.");
        getContainer().ok.click();
    }

    public void cancelar() {
        log.debug(Constants.MGS_SELECIONADO, "CANCELAR");
        BrowserDriver.waitForElement(getContainer().close);
        getContainer().close.click();

        BrowserDriver.waitForElement(getContainer().boxDelete);
        getContainer().cancelarBoletimProducao.click();
	}

}
