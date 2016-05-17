package gov.goias.agrodefesa.defesaSanitariaVegetal.autorizacaoAquisicaoMudas.entity;


import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.entity.Endereco;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.entity.Propriedade;
import gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.entity.UnidadeProducao;
import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 21/03/16.
 */
public class AquisicaoMudas {

    private UnidadeProducao unidadeProducao = new UnidadeProducao();
    private String registroEnasem;
    private String emailOrigem;
    private String telefoneOrigem;
    private String observacao;
    private String situacao;
    private String tipoDestino;
    private String telefoneDestino;
    private Transporte transporte = new Transporte();
    private Mudas mudas = new Mudas();

    public UnidadeProducao getUnidadeProducao() {
        return unidadeProducao;
    }

    public void setUnidadeProducao(UnidadeProducao unidadeProducao) {
        this.unidadeProducao = unidadeProducao;
    }

    public String getRegistroEnasem() {
        return registroEnasem;
    }

    public void setRegistroEnasem(String registroEnasem) {
        this.registroEnasem = registroEnasem;
    }

    public String getEmailOrigem() {
        return emailOrigem;
    }

    public void setEmailOrigem(String emailOrigem) {
        this.emailOrigem = emailOrigem;
    }

    public String getTelefoneOrigem() {
        return telefoneOrigem;
    }

    public void setTelefoneOrigem(String telefoneOrigem) {
        this.telefoneOrigem = telefoneOrigem;
    }

    public String getTipoDestino() {
        return tipoDestino;
    }

    public void setTipoDestino(String tipoDestino) {
        this.tipoDestino = tipoDestino;
    }

    public String getTelefoneDestino() {
        return telefoneDestino;
    }

    public void setTelefoneDestino(String telefoneDestino) {
        this.telefoneDestino = telefoneDestino;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Mudas getMudas() {
        return mudas;
    }

    public void setMudas(Mudas mudas) {
        this.mudas = mudas;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public class Transporte{
        private String tipoTransporte;

        public String getTipoTransporte() {
            return tipoTransporte;
        }

        public void setTipoTransporte(String tipoTransporte) {
            this.tipoTransporte = tipoTransporte;
        }
    }

    public class Mudas{
        private String produto;
        private String cultivar;
        private String tipoProduto;
        private String quantidade;
        private String embalagem;
        private String metodoPropaganda;

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

        public String getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(String quantidade) {
            this.quantidade = quantidade;
        }

        public String getEmbalagem() {
            return embalagem;
        }

        public void setEmbalagem(String embalagem) {
            this.embalagem = embalagem;
        }

        public String getMetodoPropaganda() {
            return metodoPropaganda;
        }

        public void setMetodoPropaganda(String metodoPropaganda) {
            this.metodoPropaganda = metodoPropaganda;
        }
    }

    public static void main(String[] args) {
        AquisicaoMudas aquisicaoMudas = new AquisicaoMudas();
        ResourceFactory.save(aquisicaoMudas);
    }

}