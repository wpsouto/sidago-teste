package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa;


import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 21/03/16.
 */
public class Empresa {

    private InformacaoObrigatoria informacaoObrigatoria = new InformacaoObrigatoria();
    private InformacaoComplementar informacaoComplementar = new InformacaoComplementar();
    private AnexarDocumentos anexarDocumentos = new AnexarDocumentos();

    public InformacaoObrigatoria getInformacaoObrigatoria() {
        return informacaoObrigatoria;
    }

    public InformacaoComplementar getInformacaoComplementar() {
        return informacaoComplementar;
    }

    public AnexarDocumentos getAnexarDocumentos() {
        return anexarDocumentos;
    }

    public static class InformacaoObrigatoria {
        private Classificacao classificacao = new Classificacao();
        private String numeroServicoInspecao;
        private String qtdAnimaisConfinados;
        private String qtdAnimaisProcessados;
        private String qtdLitrosLeite;
        private String capacidadeAlojamento;
        private String cpfCnpj;
        private String socio;
        private String nomeEmpresa;
        private String nomeFantasia;
        private String porteEmpresa;
        private String numeroRenasem;

        public String getNumeroRenasem() {
            return numeroRenasem;
        }

        public void setNumeroRenasem(String numeroRenasem) {
            this.numeroRenasem = numeroRenasem;
        }

        public String getQtdLitrosLeite() {
            return qtdLitrosLeite;
        }

        public void setQtdLitrosLeite(String qtdLitrosLeite) {
            this.qtdLitrosLeite = qtdLitrosLeite;
        }


        public String getCapacidadeAlojamento() {
            return capacidadeAlojamento;
        }

        public void setCapacidadeAlojamento(String capacidadeAlojamento) {
            this.capacidadeAlojamento = capacidadeAlojamento;
        }


        public String getQtdAnimaisProcessados() {
            return qtdAnimaisProcessados;
        }

        public void setQtdAnimaisProcessados(String qtdAnimaisProcessados) {
            this.qtdAnimaisProcessados = qtdAnimaisProcessados;
        }

        public String getNumeroServicoInspecao() {
            return numeroServicoInspecao;
        }

        public void setNumeroServicoInspecao(String numeroServicoInspecao) {
            this.numeroServicoInspecao = numeroServicoInspecao;
        }


        public String getQtdAnimaisConfinados() {
            return qtdAnimaisConfinados;
        }

        public void setQtdAnimaisConfinados(String qtdAnimaisConfinados) {
            this.qtdAnimaisConfinados = qtdAnimaisConfinados;
        }

        public String getPorteEmpresa() {
            return porteEmpresa;
        }

        public void setPorteEmpresa(String porteEmpresa) {
            this.porteEmpresa = porteEmpresa;
        }

        public String getCpfCnpj() {
            return cpfCnpj;
        }

        public void setCpfCnpj(String cpfCnpj) {
            this.cpfCnpj = cpfCnpj;
        }

        public Classificacao getClassificacao() {
            return classificacao;
        }

        public String getSocio() {
            return socio;
        }

        public void setSocio(String socio) {
            this.socio = socio;
        }

        public String getNomeEmpresa() {
            return nomeEmpresa;
        }

        public void setNomeEmpresa(String nomeEmpresa) {
            this.nomeEmpresa = nomeEmpresa;
        }

        public String getNomeFantasia() {
            return nomeFantasia;
        }

        public void setNomeFantasia(String nomeFantasia) {
            this.nomeFantasia = nomeFantasia;
        }

        public static class Classificacao{
            private String id;
            private String descricao;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getDescricao() {
                return descricao;
            }

            public void setDescricao(String descricao) {
                this.descricao = descricao;
            }
        }

    }

    public static class InformacaoComplementar {
        private Endereco endereco = new Endereco();

        public void setEndereco(Endereco endereco) {
            this.endereco = endereco;
        }

    }

    public static class AnexarDocumentos {
        private String anexo;

        public String getAnexo() {
            return anexo;
        }

        public void setAnexo(String anexo) {
            this.anexo = anexo;
        }

    }


    public static void main(String[] args) {
        Empresa empresa = ResourceFactory.initElements(Empresa.class);

        System.out.println("empresa = " + empresa.getInformacaoObrigatoria().getNomeEmpresa());
    }
}