package gov.goias.agrodefesa.controleDeBens.material;

import cucumber.api.java.pt.Quando;
import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.controleDeBens.material.navigation.NavigationMaterial;
import gov.goias.agrodefesa.utils.NavegacaoType;

import java.util.logging.Logger;

public class MaterialSteps {

    private static final Logger LOGGER = Logger.getLogger(MaterialSteps.class.getName());

    @Quando("^Eu insiro um novo registro de Material em branco$")
    public void Eu_insiro_um_novo_registro_de_Material_em_branco() {
        LOGGER.info("Entrando: Salvo os dados do formulario de Incluir Material");
        NavigationMaterial material = (NavigationMaterial) NavegacaoFactory.getNavigator().pageLoad(NavegacaoType.MATERIAL);
        material.incluirParaValidar();
    }

}
