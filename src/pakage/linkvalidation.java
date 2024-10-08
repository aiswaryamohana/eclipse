package pakage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkvalidation {
ChromeDriver driver;
String baseurl="https://www.google.com";
@Before
public void setup()
{   
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void test() throws IOException
{   
	List<WebElement> li = driver.findElements(By.tagName("a"));
	for(WebElement s:li)
		{
		
		String link=s.getAttribute("href");
		
	  verify(link);
	  }}
	
	
private void verify(String link) {
	try
	{
	URL ob=new URL(baseurl);
	HttpURLConnection con= (HttpURLConnection)ob.openConnection();
	con.connect();
	if(con.getResponseCode()==200)
	{
		System.out.println("valid link"+link);
	
	}
	else if(con.getResponseCode()==404)
	{
		System.out.println("broken link"+link);
	}}
	catch(Exception e) {
		System.out.println(e.getMessage());
}
}


}
