package gov.goias.agrodefesa.financeiro.dare.entity;


import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.entity.Produto;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.fiscalizacao.termoFiscalizacao.entity.TermoFiscalizacao;
import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 21/03/16.
 */
public class Dare {

    private Pessoa pessoa = new Pessoa();

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public static void main(String[] args) {
        Dare unidadeConsolidacao = new Dare();
        ResourceFactory.save(unidadeConsolidacao);
    }

}