package gov.goias.agrodefesa.controleDeBens.almoxarifado;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by usuario on 29/03/16.
 */
public class Almoxarifado {

    private String descricao;
    private String lotacao;
    private String gestor;
    private String almoxarifadoPai;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    public String getGestor() {
        return gestor;
    }

    public void setGestor(String gestor) {
        this.gestor = gestor;
    }

    public String getAlmoxarifadoPai() {
        return almoxarifadoPai;
    }

    public void setAlmoxarifadoPai(String almoxarifadoPai) {
        this.almoxarifadoPai = almoxarifadoPai;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("descricao", descricao)
                .append("lotacao", lotacao)
                .append("gestor", gestor)
                .append("almoxarifadoPai", almoxarifadoPai)
                .toString();
    }

    public static void main(String[] args) throws IOException {
        Yaml yaml = new Yaml();

        InputStream in = Files.newInputStream(Paths.get("/home/usuario/AmbienteTrabalho/temporario/sidago-teste/.yaml/almoxarifado.yml"));
        Almoxarifado almoxarifado = yaml.loadAs(in, Almoxarifado.class);
        System.out.println("almoxarifado = " + almoxarifado);
    }
}
