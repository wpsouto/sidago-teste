package gov.goias.agrodefesa.defesaSanitariaVegetal.cadastroLote.entity;


import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.entity.UnidadeConsolidacao;
import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 21/03/16.
 */
public class CadastroLote {

    private UnidadeConsolidacao unidadeConsolidacao = new UnidadeConsolidacao();
    private String produto;
    private String cultivar;
    private String tipoProduto;

    public UnidadeConsolidacao getUnidadeConsolidacao() {
        return unidadeConsolidacao;
    }

    public void setUnidadeConsolidacao(UnidadeConsolidacao unidadeConsolidacao) {
        this.unidadeConsolidacao = unidadeConsolidacao;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCultivar() {
        return cultivar;
    }

    public void setCultivar(String cultivar) {
        this.cultivar = cultivar;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public static void main(String[] args) {
        CadastroLote cadastroLote = new CadastroLote();
        ResourceFactory.save(cadastroLote);
    }

}