package gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.navigation;

import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.entity.Propriedade;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.entity.TermoFiscalizacao;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationTermoFiscalizacao extends NavigationBase {

    public NavigationTermoFiscalizacao(NavegacaoType type) {
        super(type);
    }

    public TermoFiscalizacao getEntity() {
        return (TermoFiscalizacao) entity;
    }

    @Override
    public void insert() {
        Propriedade propriedade = (Propriedade) dependencia(Propriedade.class, "@Propriedade");
        getEntity().setPropriedade(propriedade);
        super.insert();
    }

}
