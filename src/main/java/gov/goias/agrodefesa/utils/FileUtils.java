package gov.goias.agrodefesa.utils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class FileUtils {

    public static File getFileFromResource(String resource) {
        try {
            return new File(FileUtils.class.getClassLoader().getResource(resource).toURI());
        } catch (URISyntaxException e) {
            throw new RuntimeException("Could not read resource: " + resource, e);
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(FileUtils.class.getClassLoader().getResource("upload.pdf").getFile());
        System.out.println("FileUtils.getFileFromResource(\"upload.pdg\") = " + FileUtils.getFileFromResource("upload.pdf").getAbsolutePath());
        System.out.println("FileUtils.getFileFromResource(\"upload.pdg\") = " + FileUtils.getFileFromResource("upload.pdf").getName());
        System.out.println("FileUtils.getFileFromResource(\"upload.pdg\") = " + FileUtils.getFileFromResource("upload.pdf").getCanonicalPath());
        System.out.println("FileUtils.getFileFromResource(\"upload.pdg\") = " + FileUtils.getFileFromResource("upload.pdf").getPath());
    }


}
