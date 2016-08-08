package gov.goias.agrodefesa.defesaSanitariaVegetal.certificadoFitossanitarioOrigem.navigation;

import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.base.annotation.Navigation;
import gov.goias.agrodefesa.base.annotation.NavigationDependency;
import gov.goias.agrodefesa.base.annotation.NavigationType;
import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.defesaSanitariaVegetal.certificadoFitossanitarioOrigem.entity.CertificadoFitossanitarioOrigem;
import gov.goias.agrodefesa.defesaSanitariaVegetal.certificadoFitossanitarioOrigem.view.CertificadoFitossanitarioOrigemViewHome;
import gov.goias.agrodefesa.defesaSanitariaVegetal.certificadoFitossanitarioOrigem.view.CertificadoFitossanitarioOrigemViewInsert;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.entity.UnidadeProducao;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.navigation.NavigationUnidadeProducao;
import gov.goias.agrodefesa.financeiro.dare.entity.Dare;
import gov.goias.agrodefesa.financeiro.dare.navigation.NavigationDare;
import gov.goias.agrodefesa.utils.NavegacaoType;

/**
 * Created by usuario on 10/03/16.
 * *
 */
@Navigation(home = CertificadoFitossanitarioOrigemViewHome.class, insert = CertificadoFitossanitarioOrigemViewInsert.class, entity = CertificadoFitossanitarioOrigem.class)
@NavigationType(label = "Certificado Fitossanitário de Origem", modulo = NavegacaoType.DEFESA_SANITARIA_VEGETAL, url = "cfo")
@NavigationDependency(dependence = NavigationUnidadeProducao.class, actions = {Action.HOME, Action.INSERT, Action.MENSAGEM_INSERT})
@NavigationDependency(dependence = NavigationDare.class, actions = {Action.HOME, Action.INSERT, Action.MENSAGEM_INSERT, Action.SEARCH})
public class NavigationCertificadoFitossanitarioOrigem extends NavigationBase {

    public CertificadoFitossanitarioOrigem getEntity() {
        return (CertificadoFitossanitarioOrigem) entity;
    }

    @Override
    public void dependency() {
        log.debug("----------------------------------------1");
        NavegacaoFactory.getNavigator().login("administrador", "Administrador");
        super.dependency();
        log.debug("----------------------------------------2");
        NavegacaoFactory.getNavigator().login("42089077387", "LUDIMAR SOARES DOS SANTOS");
        log.debug("----------------------------------------3");
        getEntity().setUnidadeProducao((UnidadeProducao) NavegacaoFactory.getNavigator().getEntity(UnidadeProducao.class));
        getEntity().setDare((Dare) NavegacaoFactory.getNavigator().getEntity(Dare.class));
    }

}
