package gov.goias.agrodefesa.controleDeBens.almoxarifado.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.containers.AlmoxarifadoPageContainerHome;
import gov.goias.agrodefesa.controleDeBens.almoxarifado.entity.Almoxarifado;
import gov.goias.agrodefesa.utils.Constants;


@View(pageContainer = AlmoxarifadoPageContainerHome.class)
public class AlmoxarifadoViewHome extends BaseViewHomeImpl {

    private Almoxarifado getEntity() {
        return (Almoxarifado) entity;
    }

    private AlmoxarifadoPageContainerHome getContainer() {
        return (AlmoxarifadoPageContainerHome) container;
    }

    @Override
    public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "DESCRICAO", getEntity().getDescricao());
        getContainer().descricao.sendKeys(getEntity().getDescricao());
        getContainer().lotacao.sendKeys(getEntity().getLotacao());
        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
    }

}
