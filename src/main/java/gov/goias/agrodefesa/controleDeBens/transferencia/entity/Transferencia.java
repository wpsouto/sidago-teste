package gov.goias.agrodefesa.controleDeBens.transferencia.entity;


import gov.goias.agrodefesa.controleDeBens.patrimonio.entity.Patrimonio;
import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 21/03/16.
 */
public class Transferencia {

    private Patrimonio patrimonio = new Patrimonio();
    private String destino;
    private String conservacao;
    private String manutencao;
    private String observacao;

    public Patrimonio getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(Patrimonio patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getConservacao() {
        return conservacao;
    }

    public void setConservacao(String conservacao) {
        this.conservacao = conservacao;
    }

    public String getManutencao() {
        return manutencao;
    }

    public void setManutencao(String manutencao) {
        this.manutencao = manutencao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public static void main(String[] args) {
        Transferencia arquivo = new Transferencia();
        ResourceFactory.save(arquivo);
    }

}