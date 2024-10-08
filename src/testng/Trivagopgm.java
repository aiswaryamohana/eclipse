package testng;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Trivagopgm {
	WebDriver driver;
	private Object date;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
@BeforeMethod
public void urlloading()
{
	driver.get("https://www.trivago.com");
	driver.manage().window().maximize();
}
@Test
public void testlogin() {
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[1]/fieldset/button[1]/span/span[2]/span[1]"));
while(true)
{
	WebElement month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]"));
String month1=month.getText();
if (month1.equals("January 2024"))
{
	System.out.println(month);
	break;
}
else
{
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]"));
}
}
List<WebElement>alldates1=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
for(WebElement dateelement:alldates1)
	{String date=dateelement.getText();
System.out.println(date);
if(date.equals("17"))
{System.out.println(date);
	dateelement.click();
	System.out.println("date selected");
	break;}
	}
}
}



