package testng;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandle {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	
}
@BeforeMethod
public void urlopen()
{
	driver.get("https://demo.guru99.com/popup.php");
}

@Test
public void test()
{	String parentwindow=driver.getWindowHandle();
	driver.findElement(By.xpath("/html/body/p/a")).click();

	Set<String> allwindow=driver.getWindowHandles();
	for(String S:allwindow)
	{   
		System.out.println(S);
		
		if(!S.equalsIgnoreCase(parentwindow))
		{
			driver.switchTo().window(S);
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc");
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input"));
			driver.close();
		}
		driver.switchTo().window(parentwindow);
	}
		
	//WebDriver driver1=driver.switchTo().newWindow(WindowType.TAB);
	
	//driver1.get("https//:www.google.com");
	
}}
