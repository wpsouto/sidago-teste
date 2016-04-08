package gov.goias.agrodefesa.cadastrosAgropecuarios.empresa;

import java.util.Hashtable;

/**
 * Created by usuario on 31/03/16.
 */
public class Grupo {

    private Hashtable<String, Boolean> lista;

    public Hashtable<String, Boolean> labels() {
        return lista;
    }

    public void initialize(Integer grupo) {
        lista = new Hashtable<>();
        for(Label label: Label.values()){
            if (label.obrigatorio) {
                lista.put(label.descricao, label.obrigatorio);
            } else {
                lista.put(label.descricao, label.classificacao.contains(grupo));
            }

        }
    }

}
