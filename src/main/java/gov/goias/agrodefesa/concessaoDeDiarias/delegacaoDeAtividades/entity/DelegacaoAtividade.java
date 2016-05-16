package gov.goias.agrodefesa.concessaoDeDiarias.delegacaoDeAtividades.entity;


import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 21/03/16.
 */
public class DelegacaoAtividade {

    private String numeroDiaria;
    private String servidorDesignado;
    private String meioDeTransporte;
    private String dataSaida;
    private String dataChegada;
    private String descricaoDoServico;
    private String comPernoite;
    private String acompanhaAutoridade;
    private String tipoRecurso;
    private String fonteRecurso;
    private String acao;
    private String meta;
    private String realizacao;
    private String empenho;
    private String atividades;

    public String getAtividades() {
        return atividades;
    }

    public void setAtividades(String atividades) {
        this.atividades = atividades;
    }

    public String getNumeroDiaria() {
        return numeroDiaria;
    }

    public void setNumeroDiaria(String numeroDiaria) {
        this.numeroDiaria = numeroDiaria;
    }

    public String getServidorDesignado() {
        return servidorDesignado;
    }

    public void setServidorDesignado(String servidorDesignado) {
        this.servidorDesignado = servidorDesignado;
    }

    public String getMeioDeTransporte() {
        return meioDeTransporte;
    }

    public void setMeioDeTransporte(String meioDeTransporte) {
        this.meioDeTransporte = meioDeTransporte;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(String dataChegada) {
        this.dataChegada = dataChegada;
    }

    public String getDescricaoDoServico() {
        return descricaoDoServico;
    }

    public void setDescricaoDoServico(String descricaoDoServico) {
        this.descricaoDoServico = descricaoDoServico;
    }

    public String getComPernoite() {
        return comPernoite;
    }

    public void setComPernoite(String comPernoite) {
        this.comPernoite = comPernoite;
    }

    public String getAcompanhaAutoridade() {
        return acompanhaAutoridade;
    }

    public void setAcompanhaAutoridade(String acompanhaAutoridade) {
        this.acompanhaAutoridade = acompanhaAutoridade;
    }

    public String getTipoRecurso() {
        return tipoRecurso;
    }

    public void setTipoRecurso(String tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    public String getFonteRecurso() {
        return fonteRecurso;
    }

    public void setFonteRecurso(String fonteRecurso) {
        this.fonteRecurso = fonteRecurso;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public String getRealizacao() {
        return realizacao;
    }

    public void setRealizacao(String realizacao) {
        this.realizacao = realizacao;
    }

    public String getEmpenho() {
        return empenho;
    }

    public void setEmpenho(String empenho) {
        this.empenho = empenho;
    }

    public static void main(String[] args) {
        DelegacaoAtividade arquivo = new DelegacaoAtividade();
        ResourceFactory.save(arquivo);
    }

}