package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.entity;


import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 21/03/16.
 */
public class Classificacao {

    private String id;
    private String descricao;
    private String tipo_classificacao;

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

    public String getTipo_classificacao() {
        return tipo_classificacao;
    }

    public void setTipo_classificacao(String tipo_classificacao) {
        this.tipo_classificacao = tipo_classificacao;
    }

    public static void main(String[] args) {
        Classificacao arquivo = new Classificacao();
        ResourceFactory.save(arquivo);
    }

}