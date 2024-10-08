package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo {
ChromeDriver driver;
@BeforeTest
public void browseropen()
{
	
}
@BeforeMethod
public void urlopen()
		
{
	
}
@Test(dependsOnMethods= {"test2"})

public void test1()
{
	
}
@Test(enabled=false)
public void test2()
{
	
}


@AfterMethod
public void report()
{
	
}
@AfterTest
public void browserclose()
{
	
}
}
