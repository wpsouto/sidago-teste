package gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.entity;

import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 21/03/16.
 */
public class Lavoura {

    private String inscricaoEstadual;
    private String sistemaCultivo;
    private String origemSemente;
    private Produto produto = new Produto();

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public static void main(String[] args) {
        Lavoura produto = new Lavoura();
        ResourceFactory.save(produto);
    }

}
