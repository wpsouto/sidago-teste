package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.produto.entity;

import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 21/03/16.
 */
public class ProdutoAnimal {

    private String classificacao;
    private String nomeProduto;
    private String unidadeMedida;

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public static void main(String[] args) {
        ProdutoAnimal produto = new ProdutoAnimal();
        ResourceFactory.save(produto);
    }

}
