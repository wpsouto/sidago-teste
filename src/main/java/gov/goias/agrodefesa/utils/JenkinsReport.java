package gov.goias.agrodefesa.utils;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class JenkinsReport {

    public static void main(String[] args) {
        File reportOutputDirectory = new File("/home/usuario/AmbienteTrabalho/temporario/sidago-teste/target/cucumber-reporting");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("/home/usuario/AmbienteTrabalho/temporario/sidago-teste/target/cucumber.json");
        //jsonFiles.add("cucumber-report-2.json");

        String jenkinsBasePath = "http://localhost:8080/";
        String buildNumber = "1";
        String projectName = "SIDAGO-TESTE";
        boolean skippedFails = true;
        boolean pendingFails = false;
        boolean undefinedFails = true;
        boolean missingFails = true;
        boolean runWithJenkins = false;
        boolean parallelTesting = false;

        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
// optionally only if you need
        configuration.setStatusFlags(skippedFails, pendingFails, undefinedFails, missingFails);
        configuration.setParallelTesting(parallelTesting);
        configuration.setJenkinsBasePath(jenkinsBasePath);
        configuration.setRunWithJenkins(runWithJenkins);
        configuration.setBuildNumber(buildNumber);

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }

}
