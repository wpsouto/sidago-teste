package gov.goias.agrodefesa.utils;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by usuario on 29/03/16.
 */
public class DocumentFactory {

    public static <T> T initElements(Class<T> pageClassToProxy) {
        return instantiate(pageClassToProxy);
    }

    private static <T> T instantiate(Class<T> pageClassToProxy) {
        Yaml yaml = new Yaml();
        T object = null;
        try {
            InputStream in;
            in = Files.newInputStream(Paths.get("/home/usuario/AmbienteTrabalho/temporario/sidago-teste/.yaml/almoxarifado.yml"));
            object = yaml.loadAs(in, pageClassToProxy);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return object;
    }

}
