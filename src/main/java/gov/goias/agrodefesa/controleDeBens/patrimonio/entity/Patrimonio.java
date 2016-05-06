package gov.goias.agrodefesa.controleDeBens.patrimonio.entity;


import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 21/03/16.
 */
public class Patrimonio {

    private String numeroPatrimonio;
    private String descricao;
    private String fornecedor;
    private String origemRecurso;
    private String tipoAquisicao;
    private String especie;
    private String conservacao;
    private String lotacao;

    public String getNumeroPatrimonio() {
        return numeroPatrimonio;
    }

    public void setNumeroPatrimonio(String numeroPatrimonio) {
        this.numeroPatrimonio = numeroPatrimonio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getOrigemRecurso() {
        return origemRecurso;
    }

    public void setOrigemRecurso(String origemRecurso) {
        this.origemRecurso = origemRecurso;
    }

    public String getTipoAquisicao() {
        return tipoAquisicao;
    }

    public void setTipoAquisicao(String tipoAquisicao) {
        this.tipoAquisicao = tipoAquisicao;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getConservacao() {
        return conservacao;
    }

    public void setConservacao(String conservacao) {
        this.conservacao = conservacao;
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    public static void main(String[] args) {
        Patrimonio arquivo = new Patrimonio();
        ResourceFactory.save(arquivo);
    }

}