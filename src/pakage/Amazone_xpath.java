package pakage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone_xpath {
ChromeDriver driver;
@Before
public void browseropen() {
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
}
@Test
public void test()
{
	driver.findElement(By.xpath("//*[@id='nav-xshop']/a[6]")).click();
}
}

