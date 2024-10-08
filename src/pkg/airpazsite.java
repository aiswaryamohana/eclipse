package pkg;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class airpazsite {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlloading() {
		
		driver.get("https://www.airpaz.com/en");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"__nuxt\"]/div/main/header/div/nav/a[3]/div")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//*[@id=\"headlessui-popover-button-1310\"]/div[1]/div[1]")).click();
		while(true)
		{
		WebElement month=driver.findElement(By.xpath("//*[@id=\"headlessui-popover-panel-26\"]/div/div[2]"));
		String month1=month.getText();
		if(month1.equals("September 2024"))
		{
			System.out.println(month1);
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"headlessui-popover-panel-26\"]/div/div[2]/button[2]/iconify-icon//svg"));
		}
        
		
        	List<WebElement>Dates=driver.findElements(By.xpath("//*[@id=\"calendar_0\"]/div[3]/div[9]/button/div/div"));
        	for(WebElement dateelement:Dates)
        		{String date=dateelement.getText();
        	System.out.println(date);
        	if(date.equals("9"))
        	{System.out.println(date);
        		dateelement.click();
        		System.out.println("date selected");
        		break;        }driver.close();
        		}}
		}}
   



