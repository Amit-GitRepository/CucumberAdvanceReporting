package uk.co.automatictester.jwebfwk.glue;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.automatictester.jwebfwk.framework.ParentScenario;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Configuration;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class StepDefinitions extends ParentScenario {

	@Before
	public void beforeScenario() {
		startBrowser();
		// ExtentCucumberFormatter.initiateExtentCucumberFormatter();
		// ExtentCucumberFormatter.addSystemInfo("Browser Name", "Firefox");
		// ExtentCucumberFormatter.addSystemInfo("Browser version", "v43.0.1");
		// ExtentCucumberFormatter.addSystemInfo("Selenium version", "v2.53.0");
	}

	@Given("^I am on the Selenium homepage$")
	public void I_am_on_the_Selenium_homepage() {
		navigateTo();
	}

	@When("^I click \"([^\"]*)\" tab$")
	public void I_click_tab_on(String tab) {
		mainPage.clickTab(tab);
	}

	@Then("^I should see \"([^\"]*)\" download link on Download page$")
	public void I_should_see_download_link_on_download_page(String linkText) {
		assertThat(downloadPage.hasDownloadLinkFor(linkText), is(true));
	}
	
	@When("^This line is to fail this scenaio$")
	public void this_line_is_to_fail_this_scenaio() throws Throwable {
	    Assert.fail();
	}


	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) throws Throwable {
		System.out.println("I check for the "+ arg1 +" in step");
	}

	
	@Given("^I want to write a step with \"([^\"]*)\"$")
	public void i_want_to_write_a_step_with_name(String arg1) throws Throwable {
		System.out.println("some other preconditionI want to write a step with name " + arg1);
	}

	@Then("^I verify the \"([^\"]*)\" in step$")
	public void i_verify_the_success_in_step(String arg) throws Throwable {
	    System.out.println("I verify the success in step");
	}
	
	
	@After
	public void afterScenario() {
		closeBrowser();
//		System.out.println("PRINTING AFTER SUITE STMT");
//		File reportOutputDirectory = new File("target");
//		List<String> jsonFiles = new ArrayList<>();
//		jsonFiles.add("C:\\Learnings\\Cucumber\\Travelex\\target\\cucumber1.json");
//		jsonFiles.add("C:\\Learnings\\Cucumber\\Travelex\\target\\cucumber2.json");
//
//		System.out.println("JSON FILES : " + jsonFiles);
//
//		String jenkinsBasePath = "";
//		String buildNumber = "1";
//		String projectName = "TravelexLearnings";
//		boolean skippedFails = true;
//		boolean pendingFails = false;
//		boolean undefinedFails = true;
//		boolean runWithJenkins = false;
//		boolean parallelTesting = false;
//
//		Configuration configuration = new Configuration(reportOutputDirectory, projectName);
//		// optionally only if you need
//		configuration.setStatusFlags(skippedFails, pendingFails, undefinedFails);
//		configuration.setParallelTesting(parallelTesting);
//		configuration.setJenkinsBasePath(jenkinsBasePath);
//		configuration.setRunWithJenkins(runWithJenkins);
//		configuration.setBuildNumber(buildNumber);
//
//		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
//		reportBuilder.generateReports();
	}

	// @AfterSuite
	// public void createReports(){
	//
	// }
}