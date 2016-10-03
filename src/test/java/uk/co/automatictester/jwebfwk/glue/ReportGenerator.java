package uk.co.automatictester.jwebfwk.glue;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class ReportGenerator {
	
	@Test
	public void reportCreator(){
		  System.out.println("PRINTING AFTER SUITE STMT");
	    	File reportOutputDirectory = new File("target");
	        List<String> jsonFiles = new ArrayList<>();
	        jsonFiles.add("C:\\Learnings\\Cucumber\\Travelex\\target\\cucumber1.json");
	        jsonFiles.add("C:\\Learnings\\Cucumber\\Travelex\\target\\cucumber2.json");
	        
	        System.out.println("JSON FILES : " + jsonFiles);

	        String jenkinsBasePath = "";
	        String buildNumber = "1";
	        String projectName = "Travelex Reporting";
	        boolean skippedFails = true;
	        boolean pendingFails = false;
	        boolean undefinedFails = true;
	        boolean runWithJenkins = false;
	        boolean parallelTesting = false;

	        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
	        // optionally only if you need
	        configuration.setStatusFlags(skippedFails, pendingFails, undefinedFails);
	        configuration.setParallelTesting(parallelTesting);
	        configuration.setJenkinsBasePath(jenkinsBasePath);
	        configuration.setRunWithJenkins(runWithJenkins);
	        configuration.setBuildNumber(buildNumber);

	        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
	        reportBuilder.generateReports();
	}
	
}
