package gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.entity;


import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.entity.Propriedade;

/**
 * Created by usuario on 21/03/16.
 */
public class TermoFiscalizacao {

    private Propriedade propriedade = new Propriedade();
    private String tipoTermoFiscalizacao;
    private String caracterizacaoFiscalizacao;
    private String identificacao;
    private Objetivo objetivo = new Objetivo();
    private String situacaoEncontrada;
    private String orientacoes;
    private String serie;
    private String numero;

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Propriedade getPropriedade() {
        return propriedade;
    }

    public void setPropriedade(Propriedade propriedade) {
        this.propriedade = propriedade;
    }

    public String getTipoTermoFiscalizacao() {
        return tipoTermoFiscalizacao;
    }

    public void setTipoTermoFiscalizacao(String tipoTermoFiscalizacao) {
        this.tipoTermoFiscalizacao = tipoTermoFiscalizacao;
    }

    public String getCaracterizacaoFiscalizacao() {
        return caracterizacaoFiscalizacao;
    }

    public void setCaracterizacaoFiscalizacao(String caracterizacaoFiscalizacao) {
        this.caracterizacaoFiscalizacao = caracterizacaoFiscalizacao;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }

    public String getSituacaoEncontrada() {
        return situacaoEncontrada;
    }

    public void setSituacaoEncontrada(String situacaoEncontrada) {
        this.situacaoEncontrada = situacaoEncontrada;
    }

    public String getOrientacoes() {
        return orientacoes;
    }

    public void setOrientacoes(String orientacoes) {
        this.orientacoes = orientacoes;
    }

    public class Objetivo {
        private String programa;
        private String objetivo;
        private String subObjetivo;
        private String produto;

        public String getPrograma() {
            return programa;
        }

        public void setPrograma(String programa) {
            this.programa = programa;
        }

        public String getObjetivo() {
            return objetivo;
        }

        public void setObjetivo(String objetivo) {
            this.objetivo = objetivo;
        }

        public String getSubObjetivo() {
            return subObjetivo;
        }

        public void setSubObjetivo(String subObjetivo) {
            this.subObjetivo = subObjetivo;
        }

        public String getProduto() {
            return produto;
        }

        public void setProduto(String produto) {
            this.produto = produto;
        }
    }

}