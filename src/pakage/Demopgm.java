package pakage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demopgm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.google.com");
		
		String actualtitile=driver.getTitle();
		System.out.println(actualtitile);
		}

}
