package gov.goias.agrodefesa.controleDeBens.material.navigation;

import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.controleDeBens.material.view.MaterialViewHome;
import gov.goias.agrodefesa.controleDeBens.material.view.MaterialViewInsert;
import gov.goias.agrodefesa.utils.NavegacaoType;

public class NavigationMaterial extends NavigationBase {

    public NavigationMaterial(NavegacaoType type) {
        super(type);
    }

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
