package Steps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Test;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicFlow {
	private WebDriver driver;
	private DSL dsl;
	private BasicFlowPage page;
	
	@Before
	public void Inicialize()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		dsl = new DSL(driver);
		page = new BasicFlowPage(driver);
	}

	@After
	public void Terminate()
	{
		driver.quit();
	}
	@Test
	public void BasicFlow()
	{			
		page.GoogleHomePage();
		page.Search("Christopher Nolan");
		page.ClickSearchBtn();
		page.SearchReturn();
		page.GoogleHomePage();
		page.Search("Interstellar");
		page.ClickSearchBtn();
		page.SearchReturn();
	}
}
