package gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.navigation;

import cucumber.api.PendingException;
import gov.goias.agrodefesa.admin.navigation.NavegacaoFactory;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.entity.Propriedade;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.navigation.NavigationPropriedade;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.entity.BoletimProducao;
import gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.view.BoletimProducaoViewHome;
import gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.view.BoletimProducaoViewInsert;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;
import gov.goias.agrodefesa.utils.ResourceFactory;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by usuario on 10/03/16.
 */
public class NavigationBoletimProducao implements NavegacaoStrategy {
    private BoletimProducao entity;

    public NavigationBoletimProducao() {
        entity = ResourceFactory.load(BoletimProducao.class);
        Propriedade propriedade = ((NavigationPropriedade) NavegacaoFactory.getNavigator().pageLoad(NavegacaoType.PROPRIEDADE)).getPropriedade();
        entity.setPropriedade(propriedade);
    }

    @Override
    public void execAcao(Action action) {
        switch (action) {
            case HOME:
                BrowserDriver.loadPage(NavegacaoType.BOLETIM_PRODUCAO.getUrl());
                BoletimProducaoViewHome.isDisplayedCheck();
                break;
            case SEARCH:
                BoletimProducaoViewHome.isDisplayedCheck();
                BoletimProducaoViewHome.cpfCnpjProdutor(entity.getPropriedade().getPessoa().getCpfCnpj());
                BoletimProducaoViewHome.pesquisar();
                BoletimProducaoViewHome.isDisplayedGridPesquisar();
                break;
            case INSERT:
                if (StringUtils.isEmpty(entity.getPropriedade().getPessoa().getCpfCnpj())){
                    throw new PendingException("Executar teste de Propriedades primeiro...");
                }

                BoletimProducaoViewHome.incluirRegistro();
                BoletimProducaoViewInsert.isDisplayedCheck();
                BoletimProducaoViewInsert.propriedade(entity.getPropriedade().getPessoa().getCpfCnpj());
                BoletimProducaoViewInsert.materiaPrimaOrigem(entity.getMateriaPrimaOrigem());
                BoletimProducaoViewInsert.totalAnimaisAlojados(entity.getTotalDeAnimaisAlojados());
                BoletimProducaoViewInsert.monitoramentoMicroOrganismos(entity.getMonitoramentoDeMicroOrganismos());
                BoletimProducaoViewInsert.dataInicioLote(entity.getDataInicioDoLote());
                BoletimProducaoViewInsert.mortalidadeEstimada(entity.getMortalidadeEstimada());
                BoletimProducaoViewInsert.qdtAnimaisDespescados(entity.getQtdAnimaisDespescados());
                BoletimProducaoViewInsert.animaisSubmetidosJejum(entity.getAnimaisSubmetidosJejum());
                BoletimProducaoViewInsert.animaisArroacados(entity.getAnimaisArroacados());
                BoletimProducaoViewInsert.dataInicioPesca(entity.getDataInicioPesca());
                BoletimProducaoViewInsert.apresentacaoMateriaPrima(entity.getApresentacaoMateriaPrima());
                BoletimProducaoViewInsert.dataFimPesca(entity.getDataFimPesca());
                BrowserDriver.screenshot();
                BoletimProducaoViewInsert.salvar();
                break;
            case CANCEL:
                execAcao(Action.SEARCH);
                BoletimProducaoViewHome.cancelar();
                break;
            case MENSAGEM_INSERT:
                BoletimProducaoViewInsert.aviso("Registro inserido com sucesso!");
                break;
            case MENSAGEM_CANCEL:
                BoletimProducaoViewHome.aviso("Boletim de produção cancelado com sucesso.");
                break;
        }

    }

}
