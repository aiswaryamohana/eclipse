package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fblogin {
	WebDriver driver;
	By fbmail=By.id("email");
	By fbpswrd=By.id("pass");
	By loging=By.name("login");
public fblogin(WebDriver driver)
{
	this.driver=driver;
}
public void setvalues(String email,String password)	
{
	driver.findElement(fbmail).sendKeys(email);
	driver.findElement(fbpswrd).sendKeys(password);
	
}
	
public void login()	
{
	driver.findElement(loging).click();
}
	

}
