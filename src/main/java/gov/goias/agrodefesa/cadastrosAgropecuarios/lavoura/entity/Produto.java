package gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.entity;

import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 21/03/16.
 */
public class Produto {

    private String produto;
    private String cultivar;
    private String tipoProduto;
    private String estimativaProducao;
    private String dataPrevistaPlantio;
    private String previsaoInicioColheita;
    private String previsaoFimColheita;
    private String areaPlantada;

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

    public String getEstimativaProducao() {
        return estimativaProducao;
    }

    public void setEstimativaProducao(String estimativaProducao) {
        this.estimativaProducao = estimativaProducao;
    }

    public String getDataPrevistaPlantio() {
        return dataPrevistaPlantio;
    }

    public void setDataPrevistaPlantio(String dataPrevistaPlantio) {
        this.dataPrevistaPlantio = dataPrevistaPlantio;
    }

    public String getPrevisaoInicioColheita() {
        return previsaoInicioColheita;
    }

    public void setPrevisaoInicioColheita(String previsaoInicioColheita) {
        this.previsaoInicioColheita = previsaoInicioColheita;
    }

    public String getPrevisaoFimColheita() {
        return previsaoFimColheita;
    }

    public void setPrevisaoFimColheita(String previsaoFimColheita) {
        this.previsaoFimColheita = previsaoFimColheita;
    }

    public String getAreaPlantada() {
        return areaPlantada;
    }

    public void setAreaPlantada(String areaPlantada) {
        this.areaPlantada = areaPlantada;
    }

    public static void main(String[] args) {
        Produto produto = new Produto();
        ResourceFactory.save(produto);
    }

}
