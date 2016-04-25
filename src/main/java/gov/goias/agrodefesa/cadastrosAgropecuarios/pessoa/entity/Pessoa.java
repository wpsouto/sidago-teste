package gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity;


import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.entity.Endereco;
import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 21/03/16.
 */
public class Pessoa {

    private String cpfCnpj;
    private PessoaJuridica pessoaJuridica = new PessoaJuridica();

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public PessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public static class PessoaJuridica {
        private String nomeEmpresa;
        private String nomeFantasia;
        private Endereco endereco = new Endereco();

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

        public Endereco getEndereco() {
            return endereco;
        }
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        ResourceFactory.save(pessoa);
    }

}