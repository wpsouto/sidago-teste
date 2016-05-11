package gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.navigation;

import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.entity.Propriedade;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.entity.AquisicaoMudas;
import gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.view.AquisicaoMudasViewAprovacao;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationAquisicaoMudas extends NavigationBase {

    private AquisicaoMudasViewAprovacao viewAprovacao;

    public NavigationAquisicaoMudas(NavegacaoType type) {
        super(type);
        viewAprovacao = new AquisicaoMudasViewAprovacao(getEntity());
    }

    public AquisicaoMudas getEntity() {
        return (AquisicaoMudas) entity;
    }


    @Override
    public void insert() {
        Propriedade propriedade = (Propriedade) dependencia(Propriedade.class, "@Propriedade");
        getEntity().setPropriedade(propriedade);

        super.insert();
    }

    @Override
    public void others(Action action) {
        switch(action){
            case APPROVE:
                viewAprovacao.builder();
                break;
            case MENSAGEM_APROVO:
                viewAprovacao.aviso();
                break;
            default:
                super.others(action);
        }

    }

}
