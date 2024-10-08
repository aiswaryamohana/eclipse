package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.fblogin;

public class fblogtest {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	
}
@BeforeMethod
public void urlopen()
{
	driver.get("https://www.facebook.com");
}
@Test
public void test()
{
	fblogin ob=new fblogin(driver);
	ob.setvalues("abc@124", "143");
	ob.login();
}
}
