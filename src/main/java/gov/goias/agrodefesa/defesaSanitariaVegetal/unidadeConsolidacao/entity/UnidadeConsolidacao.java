package gov.goias.agrodefesa.defesaSanitariaVegetal.unidadeConsolidacao.entity;


import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.entity.Empresa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.pessoa.entity.Pessoa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.propriedade.entity.Propriedade;
import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 21/03/16.
 */
public class UnidadeConsolidacao {

    private Pessoa pessoa = new Pessoa();
    private String inscricaoEstadual;
    private String latitude;
    private String longitude;
    private String localidadeLivro;
    private String tipoUC;
    private String capacidadeArmazenamento;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLocalidadeLivro() {
        return localidadeLivro;
    }

    public void setLocalidadeLivro(String localidadeLivro) {
        this.localidadeLivro = localidadeLivro;
    }

    public String getTipoUC() {
        return tipoUC;
    }

    public void setTipoUC(String tipoUC) {
        this.tipoUC = tipoUC;
    }

    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public static void main(String[] args) {
        UnidadeConsolidacao unidadeConsolidacao = new UnidadeConsolidacao();
        ResourceFactory.save(unidadeConsolidacao);
    }

}