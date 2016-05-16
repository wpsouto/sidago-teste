package gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.navigation;

import gov.goias.agrodefesa.base.navigation.NavigationBase;
import gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.entity.DelegacaoAtividade;
import gov.goias.agrodefesa.utils.NavegacaoType;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NavigationDelegacaoDeAtividades extends NavigationBase {

    public NavigationDelegacaoDeAtividades(NavegacaoType type) {
        super(type);
    }

    public DelegacaoAtividade getEntity() {
        return (DelegacaoAtividade) entity;
    }

    @Override
    public void insert() {
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        int adicionarDias = 15;
        getEntity().setDataSaida(dataAtual.plusDays(adicionarDias).format(formatador));
        getEntity().setDataChegada(dataAtual.plusDays(++adicionarDias).format(formatador));

        super.insert();
    }
}
