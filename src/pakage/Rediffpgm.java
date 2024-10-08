package pakage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffpgm {
ChromeDriver driver;
@Before
public void browseropen()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void test()
{
	Boolean b=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
	
	if(b)
	{
		System.out.println("selected");
	}
	else
	{
		System.out.println("not selected");
	}
	Boolean b1=driver.findElement(By.xpath("//*[@id=\"altid_msg\"]/span")).isSelected();
	
	if(b1)
	{
		System.out.println("displayed");
		
	}
	
	else
	{
		System.out.println("not displayed");
	}
	Boolean c=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]")).isSelected();
	
	if(c)
	{
		System.out.println("selected");
	}
	else
	{
		System.out.println("not selected");
	}
	driver.quit();
}
}
