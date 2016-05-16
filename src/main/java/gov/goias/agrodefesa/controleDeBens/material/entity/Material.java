package gov.goias.agrodefesa.controleDeBens.material.entity;


import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 21/03/16.
 */
public class Material {

    private String nome;
    private String tipoMaterial;
    private String unidadeMedida;
    private String estoqueMinimo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(String estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public static void main(String[] args) {
        Material arquivo = new Material();
        ResourceFactory.save(arquivo);
    }

}