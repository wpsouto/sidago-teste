package gov.goias.agrodefesa.defesaSanitariaVegetal.certificadoFitossanitarioOrigem.entity;


import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.entity.UnidadeProducao;
import gov.goias.agrodefesa.financeiro.dare.entity.Dare;
import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 21/03/16.
 *
 */
public class CertificadoFitossanitarioOrigem {

    private UnidadeProducao unidadeProducao = new UnidadeProducao();
    private Dare dare = new Dare();
    private String quantidade;

    public UnidadeProducao getUnidadeProducao() {
        return unidadeProducao;
    }

    public void setUnidadeProducao(UnidadeProducao unidadeProducao) {
        this.unidadeProducao = unidadeProducao;
    }

    public Dare getDare() {
        return dare;
    }

    public void setDare(Dare dare) {
        this.dare = dare;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public static void main(String[] args) {
        CertificadoFitossanitarioOrigem unidadeConsolidacao = new CertificadoFitossanitarioOrigem();
        ResourceFactory.save(unidadeConsolidacao);
    }

}