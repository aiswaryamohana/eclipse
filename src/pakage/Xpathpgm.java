package pakage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpgm {
ChromeDriver driver;
@Before
public void browseropen()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@Test
public void test()
{
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8943969625");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("7012231885");
	driver.findElement(By.xpath("//button[@name='login']")).click();
}
}
