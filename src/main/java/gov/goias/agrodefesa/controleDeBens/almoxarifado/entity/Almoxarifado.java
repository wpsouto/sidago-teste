package gov.goias.agrodefesa.controleDeBens.almoxarifado.entity;


import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 21/03/16.
 */
public class Almoxarifado {

    private String descricao;
    private String lotacao;
    private String gestor;
    private String almoxarifadoPai;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    public String getGestor() {
        return gestor;
    }

    public void setGestor(String gestor) {
        this.gestor = gestor;
    }

    public String getAlmoxarifadoPai() {
        return almoxarifadoPai;
    }

    public void setAlmoxarifadoPai(String almoxarifadoPai) {
        this.almoxarifadoPai = almoxarifadoPai;
    }

    public static void main(String[] args) {
        Almoxarifado arquivo = new Almoxarifado();
        ResourceFactory.save(arquivo);
    }

}