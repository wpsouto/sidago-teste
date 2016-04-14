package gov.goias.agrodefesa.denuncia.abrirDenuncia.entity;


/**
 * Created by usuario on 21/03/16.
 */
public class AbrirDenuncia {

    private String tipoInfracao;
    private String assunto;
    private AnexarDocumentos anexarDocumentos = new AnexarDocumentos();

    public String getTipoInfracao() {
        return tipoInfracao;
    }

    public void setTipoInfracao(String tipoInfracao) {
        this.tipoInfracao = tipoInfracao;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public AnexarDocumentos getAnexarDocumentos() {
        return anexarDocumentos;
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

}