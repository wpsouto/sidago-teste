package gov.goias.agrodefesa.controleDeProdutosAgropecuarios.ingredienteAtivo.entity;


import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.entity.Endereco;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 21/03/16.
 */
public class Ingrediente {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Ingrediente entity = new Ingrediente();
        ResourceFactory.save(entity);
    }
}