package gov.goias.agrodefesa.utils;

/**
 * Created by usuario on 21/03/16.
 */
public class Endereco {

    private String tipoEndereco;
    private String endereco;
    private String bairro;
    private String cep;
    private String roteiro;

    private Endereco(EnderecoBuilder builder) {
        this.endereco = builder.endereco;
        this.bairro = builder.bairro;
        this.cep = builder.cep;
        this.roteiro = builder.roteiro;
        this.tipoEndereco = builder.tipoEndereco;
    }

    public static class EnderecoBuilder {
        private String tipoEndereco;
        private String endereco;
        private String bairro;
        private String cep;
        private String roteiro;

        public EnderecoBuilder tipoEndereco(String tipoEndereco) {
            this.tipoEndereco = tipoEndereco;
            return this;
        }

        public EnderecoBuilder endereco(String endereco) {
            this.endereco = endereco;
            return this;
        }

        public EnderecoBuilder bairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public EnderecoBuilder cep(String cep) {
            this.cep = cep;
            return this;
        }

        public EnderecoBuilder roteiro(String roteiro) {
            this.roteiro = roteiro;
            return this;
        }

        public Endereco build() {
            return new Endereco(this);
        }
    }
}
