package pakage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class content{
ChromeDriver driver;
@Before
public void browseropen()
{
	
 driver=new ChromeDriver();
 driver.get("http://www.google.com");

}
@Test
public void test()
{
	String s=driver.getTitle();
	String p=driver.getPageSource();
	System.out.println(s);
	if
	(p.contains("Gmail"))
	{System.out.println("pass");
	}
	else
	{
		System.out.println();}}
@After
public void browserclose()
{

	
	driver.close();
}
}

