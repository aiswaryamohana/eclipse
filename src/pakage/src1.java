package pakage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class src1 {
ChromeDriver driver;
String baseurl="https://www.google.com";
@Before
public void setup()
{
	driver=new ChromeDriver();
	
}
@Test
public void test() throws IOException {
	driver.get(baseurl);
	URL ob=new URL(baseurl);
	HttpURLConnection con=(HttpURLConnection)ob.openConnection();
	con.connect();
	if(con.getResponseCode()==200)
	{
		System.out.println("valid---"+baseurl);
	}
else
{
	System.out.println("invalid---"+baseurl);
}}}

