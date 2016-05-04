package gov.goias.agrodefesa.financeiro.dare.entity;


import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.entity.Produto;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.entity.TermoFiscalizacao;
import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 21/03/16.
 */
public class UnidadeProducao {

    private TermoFiscalizacao termoFiscalizacao = new TermoFiscalizacao();
    private Produto produto = new Produto();
    private String tipoUP;
    private String identificacao;
    private String sistemaCultivo;
    private String origemSemente;
    private String areaCertificada;
    private String latitude;
    private String longitude;
    private String localidadeLivro;

    public TermoFiscalizacao getTermoFiscalizacao() {
        return termoFiscalizacao;
    }

    public void setTermoFiscalizacao(TermoFiscalizacao termoFiscalizacao) {
        this.termoFiscalizacao = termoFiscalizacao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getTipoUP() {
        return tipoUP;
    }

    public void setTipoUP(String tipoUP) {
        this.tipoUP = tipoUP;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getSistemaCultivo() {
        return sistemaCultivo;
    }

    public void setSistemaCultivo(String sistemaCultivo) {
        this.sistemaCultivo = sistemaCultivo;
    }

    public String getOrigemSemente() {
        return origemSemente;
    }

    public void setOrigemSemente(String origemSemente) {
        this.origemSemente = origemSemente;
    }

    public String getAreaCertificada() {
        return areaCertificada;
    }

    public void setAreaCertificada(String areaCertificada) {
        this.areaCertificada = areaCertificada;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLocalidadeLivro() {
        return localidadeLivro;
    }

    public void setLocalidadeLivro(String localidadeLivro) {
        this.localidadeLivro = localidadeLivro;
    }

    public static void main(String[] args) {
        UnidadeProducao unidadeConsolidacao = new UnidadeProducao();
        ResourceFactory.save(unidadeConsolidacao);
    }

}