package gov.goias.agrodefesa.controleDeBens.material;

import cucumber.api.java.pt.Quando;
import gov.goias.agrodefesa.base.navigation.NavigationBaseFactory;
import gov.goias.agrodefesa.controleDeBens.material.navigation.NavigationMaterial;

import java.util.logging.Logger;

public class MaterialSteps {

    private static final Logger LOGGER = Logger.getLogger(MaterialSteps.class.getName());
    private NavigationMaterial material = (NavigationMaterial) NavigationBaseFactory.createNavigation(NavigationMaterial.class);

    @Quando("^Eu insiro um novo registro de Material em branco$")
    public void Eu_insiro_um_novo_registro_de_Material_em_branco() {
        material.incluirParaValidar();
    }

}
