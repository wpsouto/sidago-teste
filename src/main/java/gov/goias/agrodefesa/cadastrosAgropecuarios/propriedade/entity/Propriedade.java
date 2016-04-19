package gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.entity;


import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.entity.Endereco;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 21/03/16.
 */
public class Propriedade {

    private Pessoa pessoa = new Pessoa();
    private Endereco endereco = new Endereco();
    private String nomePropriedade;
    private String tipoContribuinte;
    private String condicaoPropriedade;

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getNomePropriedade() {
        return nomePropriedade;
    }

    public void setNomePropriedade(String nomePropriedade) {
        this.nomePropriedade = nomePropriedade;
    }

    public String getTipoContribuinte() {
        return tipoContribuinte;
    }

    public void setTipoContribuinte(String tipoContribuinte) {
        this.tipoContribuinte = tipoContribuinte;
    }

    public String getCondicaoPropriedade() {
        return condicaoPropriedade;
    }

    public void setCondicaoPropriedade(String condicaoPropriedade) {
        this.condicaoPropriedade = condicaoPropriedade;
    }

    public static void main(String[] args) {
        Propriedade propriedade = new Propriedade();
        ResourceFactory.save(propriedade);
    }
}