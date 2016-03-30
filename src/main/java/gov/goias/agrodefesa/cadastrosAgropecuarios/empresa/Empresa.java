package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa;

/**
 * Created by usuario on 21/03/16.
 */
public class Empresa {

    private InformacaoObrigatoria informacaoObrigatoria;

    public class InformacaoObrigatoria {

        public class Endereco{
            private String tipoEndereco;
            private String endereco;
            private String bairro;
            private String cep;
            private String roteiro;

        }
    }

}
