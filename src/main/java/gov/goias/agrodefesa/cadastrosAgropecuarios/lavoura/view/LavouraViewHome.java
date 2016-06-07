package gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.containers.LavouraPageContainerHome;
import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.entity.Lavoura;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = LavouraPageContainerHome.class)
public class LavouraViewHome extends BaseViewHomeImpl {

    private Lavoura getEntity() {
        return (Lavoura) entity;
    }

    private LavouraPageContainerHome getContainer() {
        return (LavouraPageContainerHome) container;
    }

    @Override
    public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "INCRICAO ESTADUAL", getEntity().getInscricaoEstadual());
        getContainer().inscricaoEstadual.clear();
        getContainer().inscricaoEstadual.sendKeys(getEntity().getInscricaoEstadual());

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
    }
}
