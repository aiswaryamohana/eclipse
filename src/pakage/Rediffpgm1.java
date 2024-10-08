package pakage;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Rediffpgm1 {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

}
@Test
public void buttontextverify()
{
	WebElement dayelement=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
	Select day=new Select(dayelement);
	day.selectByValue("02");
	WebElement Month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	Select M=new Select(Month);
	M.selectByIndex(4);
	WebElement Year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	Select Y=new Select(Year);
	Y.selectByVisibleText("2023");

List<WebElement>li=day.getOptions();
System.out.println(li.size());
List<WebElement>li1=M.getOptions();
System.out.println(li1.size());
List<WebElement>li2=Y.getOptions();
System.out.println(li2.size());
}}








