package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99testing {
WebDriver driver;
@BeforeTest
public void setup() 
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlloading()
{
	driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
}
@Test
public void test1()
{
	Actions act=new Actions(driver);
	WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	act.contextClick(right).perform();
	driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
	Alert a=driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	act.doubleClick(doubleclick).perform();
	Alert b=driver.switchTo().alert();
	System.out.println(b.getText());
	b.accept();
	
	
	//*[@id="authentication"]/ul/li[1]
}
}
