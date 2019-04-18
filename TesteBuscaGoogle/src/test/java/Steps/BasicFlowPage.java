package Steps;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicFlowPage
	{
		private DSL dsl;
		private WebDriver driver;
		
		public BasicFlowPage(WebDriver driver)
		{
			dsl = new DSL(driver);
		}
		
		public void GoogleHomePage()
		{
			dsl.GooglePage();
		}
		
		public void Search(String diretor)
		{
			dsl.Write(diretor);
		}
		
		public void ClickSearchBtn()
		{
			dsl.SearchBtn();
		}
		
		public void SearchReturn()
		{
			dsl.SearchResult();
		}
		
	}
