package gov.goias.agrodefesa.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.Charsets;

import java.io.*;

/**
 * Created by usuario on 31/03/16.
 */
public class ResourceFactory {

    public static <T> T initElements(Class<T> classToProxy) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();

        File file = FileUtils.getFileFromResource(String.format("json/%s.json", classToProxy.getSimpleName().toLowerCase()));
        Reader reader = null;
        try {
            reader = new InputStreamReader(new FileInputStream(file.getAbsoluteFile()), Charsets.UTF_8);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Could not read resource: " + classToProxy, e);
        }

        return gson.fromJson(reader, classToProxy);
    }

}
