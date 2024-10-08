package pakage;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdown {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void test()
{
  WebElement dayelement= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
  Select day=new Select(dayelement);
  day.selectByValue("01");
  WebElement monthelement = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
  Select month=new Select(monthelement);
  month.selectByValue("04");
  WebElement yearelement = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
  Select year=new Select(yearelement);
  year.selectByValue("2022");
  List<WebElement> li = day.getOptions();
  System.out.println(li.size());
  List<WebElement> l1 = month.getOptions();
  System.out.println(l1.size());
  List<WebElement> l2 = year.getOptions();
  System.out.println(l2.size());
 boolean b = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
if(b)
 {System.out.println("Displayed");}
else
{
	System.out.println("not Displayed");
}
	
boolean b1=driver.findElement(By.xpath("//*[@id=\"altid_msg\"]/span")).isSelected();
if(b1)
{
	System.out.println("selected");
}
else
{
	System.out.println("not selected");
}
boolean b2=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();

if(b2)
{
	System.out.println("is selected");
}
else
{
	System.out.println("not selected");
}
}


}
