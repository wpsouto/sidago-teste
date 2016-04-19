package gov.goias.agrodefesa.defesaSanitariaAnimal.boletimProducao.entity;


import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.entity.Endereco;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.entity.Propriedade;
import gov.goias.agrodefesa.utils.ResourceFactory;
import org.omg.CORBA.RepositoryIdHelper;

/**
 * Created by usuario on 21/03/16.
 */
public class BoletimProducao {

    private Propriedade propriedade= new Propriedade();
    private String materiaPrimaOrigem;
    private String totalDeAnimaisAlojados;
    private String monitoramentoDeMicroOrganismos;
    private String dataInicioDoLote;
    private String mortalidadeEstimada;
    private String qtdAnimaisDespescados;
    private String animaisSubmetidosJejum;
    private String animaisArroacados;
    private String dataInicioPesca;
    private String dataFimPesca;
    private String apresentacaoMateriaPrima;

    public Propriedade getPropriedade() {
        return propriedade;
    }

    public void setPropriedade(Propriedade propriedade) {
        this.propriedade = propriedade;
    }

    public String getMateriaPrimaOrigem() {
        return materiaPrimaOrigem;
    }

    public void setMateriaPrimaOrigem(String materiaPrimaOrigem) {
        this.materiaPrimaOrigem = materiaPrimaOrigem;
    }

    public String getTotalDeAnimaisAlojados() {
        return totalDeAnimaisAlojados;
    }

    public void setTotalDeAnimaisAlojados(String totalDeAnimaisAlojados) {
        this.totalDeAnimaisAlojados = totalDeAnimaisAlojados;
    }

    public String getMonitoramentoDeMicroOrganismos() {
        return monitoramentoDeMicroOrganismos;
    }

    public void setMonitoramentoDeMicroOrganismos(String monitoramentoDeMicroOrganismos) {
        this.monitoramentoDeMicroOrganismos = monitoramentoDeMicroOrganismos;
    }

    public String getDataInicioDoLote() {
        return dataInicioDoLote;
    }

    public void setDataInicioDoLote(String dataInicioDoLote) {
        this.dataInicioDoLote = dataInicioDoLote;
    }

    public String getMortalidadeEstimada() {
        return mortalidadeEstimada;
    }

    public void setMortalidadeEstimada(String mortalidadeEstimada) {
        this.mortalidadeEstimada = mortalidadeEstimada;
    }

    public String getQtdAnimaisDespescados() {
        return qtdAnimaisDespescados;
    }

    public void setQtdAnimaisDespescados(String qtdAnimaisDespescados) {
        this.qtdAnimaisDespescados = qtdAnimaisDespescados;
    }

    public String getAnimaisSubmetidosJejum() {
        return animaisSubmetidosJejum;
    }

    public void setAnimaisSubmetidosJejum(String animaisSubmetidosJejum) {
        this.animaisSubmetidosJejum = animaisSubmetidosJejum;
    }

    public String getAnimaisArroacados() {
        return animaisArroacados;
    }

    public void setAnimaisArroacados(String animaisArroacados) {
        this.animaisArroacados = animaisArroacados;
    }

    public String getDataInicioPesca() {
        return dataInicioPesca;
    }

    public void setDataInicioPesca(String dataInicioPesca) {
        this.dataInicioPesca = dataInicioPesca;
    }

    public String getDataFimPesca() {
        return dataFimPesca;
    }

    public void setDataFimPesca(String dataFimPesca) {
        this.dataFimPesca = dataFimPesca;
    }

    public String getApresentacaoMateriaPrima() {
        return apresentacaoMateriaPrima;
    }

    public void setApresentacaoMateriaPrima(String apresentacaoMateriaPrima) {
        this.apresentacaoMateriaPrima = apresentacaoMateriaPrima;
    }

    public static void main(String[] args) {
        BoletimProducao boletimProducao = new BoletimProducao();
        ResourceFactory.save(boletimProducao);
    }
 }
