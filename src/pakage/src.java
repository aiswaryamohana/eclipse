package pakage;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class src {
ChromeDriver driver;
@Before
public void setup()
{   
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
}
@Test
public void test() throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("E:.png"));
}
}
