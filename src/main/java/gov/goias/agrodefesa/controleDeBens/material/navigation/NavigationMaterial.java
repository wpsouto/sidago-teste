package gov.goias.agrodefesa.controleDeBens.material.navigation;

import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.controleDeBens.material.entity.Material;
import gov.goias.agrodefesa.controleDeBens.material.view.MaterialViewEdit;
import gov.goias.agrodefesa.controleDeBens.material.view.MaterialViewHome;
import gov.goias.agrodefesa.controleDeBens.material.view.MaterialViewInsert;
import gov.goias.agrodefesa.utils.NavegacaoType;

@Navigation(home = MaterialViewHome.class, insert = MaterialViewInsert.class, edit = MaterialViewEdit.class, entity = Material.class)
@NavigationType(label = "material", modulo = NavegacaoType.CONTROLE_BENS, url = "material")
public class NavigationMaterial extends NavigationBase {

    private MaterialViewHome getHome(){
        return (MaterialViewHome) home;
    }

    private MaterialViewInsert getInsert(){
        return (MaterialViewInsert) insert;
    }

    public void incluirParaValidar(){
        super.search();
        getHome().incluir();
     }

    @Override
    public void others(Action action) {
        switch (action) {
            case MENSAGEM_ERRO:
                getInsert().salvarTodosCamposVazios();
                break;
            default:
                super.others(action);
        }

    }
}
