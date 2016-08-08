package gov.goias.agrodefesa.defesaSanitariaVegetal.certificadoFitossanitarioOrigem.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.defesaSanitariaVegetal.certificadoFitossanitarioOrigem.containers.CertificadoFitossanitarioOrigemPageContainerHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.certificadoFitossanitarioOrigem.entity.CertificadoFitossanitarioOrigem;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = CertificadoFitossanitarioOrigemPageContainerHome.class)
public class CertificadoFitossanitarioOrigemViewHome extends BaseViewHomeImpl {

    private CertificadoFitossanitarioOrigem getEntity() {
        return (CertificadoFitossanitarioOrigem) entity;
    }

    private CertificadoFitossanitarioOrigemPageContainerHome getContainer() {
        return (CertificadoFitossanitarioOrigemPageContainerHome) container;
    }

    @Override
    public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "NOME DA PROPRIEDADE", getEntity().getUnidadeProducao().getTermoFiscalizacao().getPropriedade().getNomePropriedade());
        getContainer().nomePropriedade.sendKeys(getEntity().getUnidadeProducao().getTermoFiscalizacao().getPropriedade().getNomePropriedade());

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
    }

}
