package pakage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbpgm {
ChromeDriver driver;
@Before
public void browseropen()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
}

@Test
public void test()
{
	WebElement Day=driver.findElement(By.xpath("//*[@id=\"day\"]"));
	Select D=new Select(Day);
	D.selectByValue("1");
	WebElement Month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
	Select M=new Select(Month);
	M.selectByValue("2");
	WebElement Year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
	Select Y=new Select(Year);
	Y.selectByValue("2020");
}
	
	
}
