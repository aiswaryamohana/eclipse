package pakage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatror {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
}
@Test
public void test()
{
	//driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
	driver.findElement(By.id("email")).sendKeys("adfh");
	driver.findElement(By.id("pass")).sendKeys("ghhd");
	driver.findElement(By.name("login")).click();
}
}
