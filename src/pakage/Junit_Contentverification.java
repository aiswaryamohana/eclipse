package pakage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_Contentverification {
ChromeDriver driver;
@Before
public void browseropen()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	
}
@Test
public void test()
{
	String content=driver.getPageSource();
	if(content.contains("Gmail"))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("fail");
	}
	
}

}
