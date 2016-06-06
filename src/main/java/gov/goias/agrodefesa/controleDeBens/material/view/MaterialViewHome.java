package gov.goias.agrodefesa.controleDeBens.material.view;

import gov.goias.agrodefesa.base.annotation.View;
import gov.goias.agrodefesa.base.view.BaseViewHomeImpl;
import gov.goias.agrodefesa.controleDeBens.material.containers.MaterialPageContainerHome;
import gov.goias.agrodefesa.controleDeBens.material.entity.Material;
import gov.goias.agrodefesa.utils.Constants;

@View(pageContainer = MaterialPageContainerHome.class)
public class MaterialViewHome extends BaseViewHomeImpl {

    public Material getEntity() {
        return (Material) entity;
    }

    private MaterialPageContainerHome getContainer() {
        return (MaterialPageContainerHome) container;
    }

    @Override
    public void pesquisar() {
        log.debug(Constants.MGS_INSERIDO, "NOME MATERIAL", getEntity().getNome());
        getContainer().nomeMaterial.sendKeys(getEntity().getNome());

        log.debug(Constants.MGS_SELECIONADO, "PESQUISAR");
        getContainer().pesquisar.click();
    }

}
