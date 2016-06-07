package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.navigation;

import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.entity.Ingrediente;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.view.IngredienteAtivoViewEdit;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.view.IngredienteAtivoViewHome;
import gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.view.IngredienteAtivoViewInsert;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 * *
 */
@Navigation(home = IngredienteAtivoViewHome.class, insert = IngredienteAtivoViewInsert.class, edit = IngredienteAtivoViewEdit.class, entity = Ingrediente.class)
@NavigationType(label = "Ingrediente Ativo", modulo = NavegacaoType.CONTROLE_DE_PRODUTOS_AGROPECUARIOS, url = "ingrediente-ativo")
public class NavigationIngredienteAtivo extends NavigationBase {

    public Ingrediente getEntity() {
        return (Ingrediente) entity;
    }

}
