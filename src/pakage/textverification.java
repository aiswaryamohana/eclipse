package pakage;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textverification {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	
}
@Test
public void test()
{    
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	WebElement li = driver.findElement(By.xpath("//*[@id=\"Register\"]"));
	String s1=li.getAttribute("value");
	if(s1.contains("Create my account >>"))
	{
		System.out.println("Pass");}
	else
	{
		System.out.println("Fail");
	}
}
}


