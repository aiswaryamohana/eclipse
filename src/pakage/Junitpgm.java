package pakage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junitpgm {

	@Before

	public void browseropen()

	{
	
      System.out.println("browseropen");
	}
	@Test
	public void test()
	{
		System.out.println("testactivity");
	}
	@After
	public void browserclose()
	{
		System.out.println("browserclose");
	}
}
