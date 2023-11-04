package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepClass {
    
	WebDriver driver;
	
	@Given("^open dell application$")
	public void open_dell_application() throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "C:\\chrome driver\\chrome-win64\\chrome.exe");
		
		ChromeOptions run = new ChromeOptions();
		run.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver();
		driver.get("https://www.dell.com/en-us");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
	    
	}

	@Then("^search item on search button$")
	public void search_item_on_search_button() throws Throwable {
	 
		WebElement m = driver.findElement(By.id("mh-search-input"));
		m.sendKeys("laptops");
	}

	@Then("^click search icon$")
	public void click_search_icon() throws Throwable {
		WebElement n = driver.findElement(By.xpath("//button[@class='mh-search-btn mh-search-submit']"));
		n.click();
		
	   
	}

	@Then("^click on item$")
	public void click_on_item() throws Throwable {
		WebElement k = driver.findElement(By.linkText("Inspiron 15 Laptop"));
		k.click();
		 driver.close();
	  
	}

	


}
