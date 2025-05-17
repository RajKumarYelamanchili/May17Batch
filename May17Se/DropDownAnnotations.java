package z;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownAnnotations {
	
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserMay\\chromedriver.exe");
		 driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		Thread.sleep(2000);
		
	}

	
	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}
	
	
	@Test
	public void TC01_verifyDropDownEnabled() throws InterruptedException
	{
		
		
		WebElement dd1= driver.findElement(By.xpath("//select[@name='country']"));
		Assert.assertTrue(dd1.isEnabled(), "Not enabled");
		
		
	}
	@Test
	public void TC02_verifyDropDownDisplayed() throws InterruptedException
	{
		
		
		WebElement dd1= driver.findElement(By.xpath("//select[@name='country']"));
		
		Assert.assertTrue(dd1.isDisplayed(), "Not Displayed");
		
	}
	
	@Test
	public void TC03_verifyDropDownMultiple() throws InterruptedException
	{
		
		
		WebElement dd1= driver.findElement(By.xpath("//select[@name='country']"));
		Select sel = new Select(dd1);
		Assert.assertTrue(sel.isMultiple(),"Does not allow multple selection");
		
	}
	
	
	@Test
	public void TC04_verifyDropDownNumberOfCountries() throws InterruptedException
	{
		
		
		WebElement dd1= driver.findElement(By.xpath("//select[@name='country']"));
		Select sel = new Select(dd1);
		int ExpectedCountries=247;
		
		int ActualCountries= sel.getOptions().size();
		
		Assert.assertEquals(ActualCountries, ExpectedCountries,"number of countries is not matching with 247");
		
		
	}
	
	
	@Test
	public void TC05_verifySelectByVisibleText() throws InterruptedException
	{
		
		
		WebElement dd1= driver.findElement(By.xpath("//select[@name='country']"));
		Select sel = new Select(dd1);
		sel.selectByVisibleText("India");

	    // Assert Country selection
	    String selectedCountry = sel.getFirstSelectedOption().getText();
	    Assert.assertEquals(selectedCountry, "India", "Country dropdown selection failed!");

		
		
	}
	
	@Test
	public void TC06_verifySelectByIndex() throws InterruptedException
	{
	
		
		WebElement dd1= driver.findElement(By.xpath("//select[@name='country']"));
		Select sel = new Select(dd1);
		sel.selectByIndex(9);

	    // Assert Country selection
	    String selectedCountry = sel.getFirstSelectedOption().getText();
	    Assert.assertEquals(selectedCountry, "Argentina", "Country dropdown selection failed!");
		
	}
	
	
}
