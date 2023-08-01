package testNG;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;


public class NewTest 
{
	WebDriver driver;
	WebElement GST_dropdown;
	
  @AfterMethod
  public void f() throws InterruptedException 
  {
	  System.out.println("Starting the browser session");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Starting the browser session");
	  System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://155.248.242.125:8090/");
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  @Test
  public void testmethod() throws InterruptedException
  {
	  	driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("cosb@yopmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/input[1]")).sendKeys("Admin@1211");
		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/div[1]/i[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[5]/input[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		System.out.println("success");
		Thread.sleep(3000);
		driver.findElement(By.linkText("MGCGS Meghalaya Scheme - MGCGS")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-main-template/div/div/app-new-dashboard/div/div/div/div[1]/div/ul/li[4]/a/p")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-main-template/div/div/app-new-dashboard/div/div/div/div[1]/div/ul[2]/li[1]/a/p")).click();
		Thread.sleep(3000);		
		driver.findElement(By.xpath("/html/body/app-root/app-main-template/div/div/app-existing-guarantee/div/div[2]/div/div[3]/div[3]/button/span")).click();
		
  }
  @Test
 public void selfdeclaration() throws InterruptedException
 {
	 driver.findElement(By.xpath("//*[@id=\"p-tabpanel-4\"]/form/div[1]/div[2]/div/div[1]/app-global-input-text/form/div/input")).sendKeys("TW1234");
	 Thread.sleep(20000);
	 driver.findElement(By.xpath("//*[@id=\"p-tabpanel-4\"]/form/div[1]/div[2]/div/div[1]/app-global-input-text/form/div/input")).sendKeys("Vashi");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"p-tabpanel-4\"]/form/div[1]/div[2]/div/div[1]/app-global-input-text/form/div/input"));
	 Select select= new Select(GST_dropdown);
	 select.selectByVisibleText("MAHARASHTRA");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("WebElement GST_dropdown")).click();
	 
 }
}
