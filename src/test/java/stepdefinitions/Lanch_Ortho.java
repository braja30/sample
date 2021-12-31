package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Base1;
import pom.Pom_elements_Ortho;


public class Lanch_Ortho extends Base1{
	@Before("@browseropen")
	public void browerSetup() throws IOException {
		getDriver("firfox");
		PageFactory.initElements(driver, Pom_elements_Ortho.class);
	}
	@Given("Landing the ortho {string}")
	public void Landing_the_ortho_url(String URL) throws InterruptedException {
	   getUrL(URL);
	   impWait(10);
	   System.out.println("Landing the ortho url successfully");
	}

	@When("Search in knee section")
	public void search_in_knee_section() throws InterruptedException {
			click(popup);
		   sendKeys(searchText,"knee");
		   click(submit); 
		   System.out.println("Search in knee section successfully");
	}
	@Then("Click on article tap")
	public void click_on_article_tap() {
		click(article);	
		System.out.println("Click on article tap successfully");
	}
	@Then("Click on base science")
	public void click_on_base_science() throws InterruptedException, IOException {
		click(basic_science);
		jsE_ScrollDown();
		sleep(5);
		ScreenShot("\\Article_result1.png"); 
		System.out.println("Click on base science successfully");
	}

	@Then("Click on abstract_second link")
	public void click_on_abstract_second_link() throws IOException, InterruptedException {
		click(abstract_link);
		jsE_ScrollDown();
		sleep(5);
		ScreenShot("//abstract_link1.png");
		System.out.println("Click on abstract_second link successfully");
		quit();
		
	}

	}
	

