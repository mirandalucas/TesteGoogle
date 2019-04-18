package Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class DSL {

	private WebDriver driver;
	
	public DSL(WebDriver driver) 
		{
			this.driver = driver;
		}
	
	public void GooglePage()
	{
		driver.get("https://www.google.com/");
	}
	
	public void Write(String diretor)
	{
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys(diretor);
	}
	
	public void SearchBtn()
	{
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[3]/center/input[1]")).click();
	}
	
	public void SearchResult()
	{
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.id("slim_appbar")).getText());
	}
	
	
	
	
	
	
	
	
	
	
	/******* Write *******/
	
	/*public void Write(String id)
		{
			driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys(id);
		}

							*//******* Click *******//*	
	
	public void ClickId(String id)
		{
			driver.findElement(By.id(id)).click();
		}
	
	public void ClickLink(String link)
		{
			driver.findElement(By.linkText(link)).click();
		}
	
	public void ClickRadio(String id)
		{
			driver.findElement(By.id(id)).click();
		}
	
	public void ClickName(String id)
		{
			driver.findElement(By.name(id)).click();
		}
	
	public void ClickXpath(String id)
		{
			driver.findElement(By.xpath(id)).click();
		}
	
									*//******* Drop down *******//*	
	
	public void ComboBox(String id, Integer value)
		{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement element = driver.findElement(By.xpath(id));
			Select combo = new Select(element);
			combo.selectByIndex(value);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			combo.selectByValue(value);
//			combo.selectByVisibleText(value);
		}

									*//******* Windows *******//*
	
	public void SwitchWindow()
		{
			driver.switchTo().window((String)driver.getWindowHandles().toArray()[1]);
		}
	
	public void ClosePopUp(String id)//With Sting
		{
			driver.switchTo().window((String)driver.getWindowHandles().toArray()[0]);
		}
	
	public void ClosePopUp()//With no String
	{
		driver.switchTo().window((String)driver.getWindowHandles().toArray()[0]);
	}
	
	public void AcessarPagina()
		{
			driver.get("https://www.google.com/");
		}
	
	public void loginBtn()
		{
			driver.findElement(By.name("loginBtn")).click();
		}*/
}
