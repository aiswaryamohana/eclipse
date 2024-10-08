package testng;

import org.testng.annotations.Test;

public class grouping {
@Test(groups= {"sanity"})
public void test1()
{
	System.out.println("main 1");
}
@Test(groups= {"sanity","smoke"})
public void test2()
{
	System.out.println("main 2");
}
@Test(groups= {"regression"})
public void test3()
{
	System.out.println();
}
}
