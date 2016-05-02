package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeProducao.entity;


import gov.goias.agrodefesa.cadastrosAgropecuarios.lavoura.entity.Produto;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.entity.Propriedade;
import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 21/03/16.
 */
public class UnidadeProducao {

    private Propriedade propriedade = new Propriedade();
    private Produto produto = new Produto();
    private String tipoUP;
    private String identificacao;
    private String sistemaCultivo;
    private String origemSemente;
    private String areaCertificada;
    private String latitude;
    private String longitude;
    private String localidadeLivro;
    private String serieTF;
    private String nTF;

    public static void main(String[] args) {
        UnidadeProducao unidadeConsolidacao = new UnidadeProducao();
        ResourceFactory.save(unidadeConsolidacao);
    }

}