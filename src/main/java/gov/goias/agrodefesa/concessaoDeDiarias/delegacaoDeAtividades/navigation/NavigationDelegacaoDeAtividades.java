package gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.navigation;

import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.view.DelegacaoDeAtividadesViewHome;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.view.DelegacaoDeAtividadesViewInsert;
import gov.goias.agrodefesa.constants.Action;
import gov.goias.agrodefesa.utils.BrowserDriver;
import gov.goias.agrodefesa.utils.NavegacaoStrategy;
import gov.goias.agrodefesa.utils.NavegacaoType;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NavigationDelegacaoDeAtividades implements NavegacaoStrategy {

    private String numeroDiaria;
    private String dataSaida;
    private String dataChegada;

    public NavigationDelegacaoDeAtividades(){
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        int adicionarDias = 15;
        dataSaida = dataAtual.plusDays(adicionarDias).format(formatador);
        dataChegada = dataAtual.plusDays(++adicionarDias).format(formatador);
    }

    @Override
    public void execAcao(Action action) {
        switch(action){
            case HOME:
                BrowserDriver.loadPage(NavegacaoType.DELEGACAO_DE_ATIVIDADES.getUrl());
                DelegacaoDeAtividadesViewHome.isDisplayedCheck();
                break;
            case INSERT:
                DelegacaoDeAtividadesViewHome.incluirRegistro();
                DelegacaoDeAtividadesViewInsert.isDisplayedCheck();
                DelegacaoDeAtividadesViewInsert.servidorDesignado("Carla Giovanna Nunes de Farias Leite Coelho");
                DelegacaoDeAtividadesViewInsert.meioDeTransporte("Automóvel");
                DelegacaoDeAtividadesViewInsert.adicionarDestino();

                DelegacaoDeAtividadesViewInsert.dataSaida(dataSaida);
                DelegacaoDeAtividadesViewInsert.dataChegada(dataChegada);

                DelegacaoDeAtividadesViewInsert.descricaoDoServico("Teste Automatizado");
                DelegacaoDeAtividadesViewInsert.comPernoite("Não");
                DelegacaoDeAtividadesViewInsert.acompanhaAutoridade("Não");
                DelegacaoDeAtividadesViewInsert.tipoRecurso("Recurso Próprio");
                DelegacaoDeAtividadesViewInsert.fonteRecurso("20 - Recurso Próprio");
                DelegacaoDeAtividadesViewInsert.acao("4001 - Administrativo");
                DelegacaoDeAtividadesViewInsert.meta("4001 - Administrativo");
                DelegacaoDeAtividadesViewInsert.realizacao("4001 - Administrativo");
                DelegacaoDeAtividadesViewInsert.empenho("4001 | Presidência");
                DelegacaoDeAtividadesViewInsert.salvar();
                break;
            case SEARCH:
                DelegacaoDeAtividadesViewHome.isDisplayedCheck();
                DelegacaoDeAtividadesViewHome.nomeDoServidor("Carla Giovanna Nunes de Farias Leite Coelho");
                DelegacaoDeAtividadesViewHome.dataSaida(dataSaida);
                DelegacaoDeAtividadesViewHome.dataChegada(dataChegada);
                DelegacaoDeAtividadesViewHome.pesquisar();
                DelegacaoDeAtividadesViewHome.pesquisarCheck();
                numeroDiaria = DelegacaoDeAtividadesViewHome.getNumeroDiaria();
                BrowserDriver.screenshot();
                break;
            case MENSAGEM_INSERT:
                DelegacaoDeAtividadesViewInsert.aviso("Registro inserido com sucesso!");
                execAcao(Action.SEARCH);
                break;
        }

    }

    public String getNumeroDiaria() {
        return numeroDiaria;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public String getDataChegada() {
        return dataChegada;
    }
}
