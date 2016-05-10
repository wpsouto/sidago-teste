package gov.goias.agrodefesa.cadastrosAgropecuarios.empresaForaGoias.entity;


import gov.goias.agrodefesa.cadastrosAgropecuarios.empresa.entity.Empresa;
import gov.goias.agrodefesa.cadastrosAgropecuarios.empresaClassificacao.entity.Classificacao;
import gov.goias.agrodefesa.utils.ResourceFactory;

/**
 * Created by usuario on 21/03/16.
 */
public class EmpresaForaGoias {

    private Empresa empresa = new Empresa();
    private Classificacao classificacao = new Classificacao();

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public static void main(String[] args) {
        EmpresaForaGoias arquivo = new EmpresaForaGoias();
        ResourceFactory.save(arquivo);
    }

}