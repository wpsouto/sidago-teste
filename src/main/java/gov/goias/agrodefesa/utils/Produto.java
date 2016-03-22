package gov.goias.agrodefesa.utils;

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

    private Produto(ProdutoBuilder builder) {
        this.produto = builder.produto;
        this.cultivar = builder.cultivar;
        this.tipoProduto = builder.tipoProduto;
        this.estimativaProducao = builder.estimativaProducao;
        this.dataPrevistaPlantio = builder.dataPrevistaPlantio;
        this.previsaoInicioColheita = builder.previsaoInicioColheita;
        this.previsaoFimColheita = builder.previsaoFimColheita;
        this.areaPlantada = builder.areaPlantada;
    }

    public String getProduto() {
        return produto;
    }

    public String getCultivar() {
        return cultivar;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public String getEstimativaProducao() {
        return estimativaProducao;
    }

    public String getDataPrevistaPlantio() {
        return dataPrevistaPlantio;
    }

    public String getPrevisaoInicioColheita() {
        return previsaoInicioColheita;
    }

    public String getPrevisaoFimColheita() {
        return previsaoFimColheita;
    }

    public String getAreaPlantada() {
        return areaPlantada;
    }

    public static class ProdutoBuilder {
        private String produto;
        private String cultivar;
        private String tipoProduto;
        private String estimativaProducao;
        private String dataPrevistaPlantio;
        private String previsaoInicioColheita;
        private String previsaoFimColheita;
        private String areaPlantada;

        public ProdutoBuilder areaPlantada(String areaPlantada) {
            this.areaPlantada = areaPlantada;
            return this;
        }

        public ProdutoBuilder previsaoFimColheita(String previsaoFimColheita) {
            this.previsaoFimColheita = previsaoFimColheita;
            return this;
        }

        public ProdutoBuilder previsaoInicioColheita(String previsaoInicioColheita) {
            this.previsaoInicioColheita = previsaoInicioColheita;
            return this;
        }

        public ProdutoBuilder dataPrevistaPlantio(String dataPrevistaPlantio) {
            this.dataPrevistaPlantio = dataPrevistaPlantio;
            return this;
        }

        public ProdutoBuilder estimativaProducao(String estimativaProducao) {
            this.estimativaProducao = estimativaProducao;
            return this;
        }

        public ProdutoBuilder tipoProduto(String tipoProduto) {
            this.tipoProduto = tipoProduto;
            return this;
        }

        public ProdutoBuilder cultivar(String cultivar) {
            this.cultivar = cultivar;
            return this;
        }

        public ProdutoBuilder produto(String produto) {
            this.produto = produto;
            return this;
        }

        public Produto build(){
            return new Produto(this);
        }
    }
}
