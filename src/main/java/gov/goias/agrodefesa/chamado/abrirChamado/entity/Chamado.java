package gov.goias.agrodefesa.chamado.abrirChamado.entity;


import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 21/03/16.
 */
public class Chamado {

    private String numeroChamado;
    private String solicitante;
    private String tipoSuporte;
    private String classificacao;
    private String tipoContato;
    private String problema;
    private String adotarChamado;
    private String tecnico;
    private String situacao;

    public String getNumeroChamado() {
        return numeroChamado;
    }

    public void setNumeroChamado(String numeroChamado) {
        this.numeroChamado = numeroChamado;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getTipoSuporte() {
        return tipoSuporte;
    }

    public void setTipoSuporte(String tipoSuporte) {
        this.tipoSuporte = tipoSuporte;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(String tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getAdotarChamado() {
        return adotarChamado;
    }

    public void setAdotarChamado(String adotarChamado) {
        this.adotarChamado = adotarChamado;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public static void main(String[] args) {
        Chamado arquivo = new Chamado();
        ResourceFactory.save(arquivo);
    }

}