package runner;

import java.util.Date;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 
{

	public static Date date;
		
	@Test(priority=1)
	public void runner1() throws Exception 
	{
		Thread.sleep(5000);
		date=new Date();
		System.out.println(date+" : runner1 executed.");
		Reporter.log(date+" : runner1 executed.");
		Thread.sleep(10000);
	}
	
	@Test(priority=2)
	public void runner2() throws Exception 
	{
		date=new Date();
		System.out.println(date+" : runner2 executed.");
		Reporter.log(date+" : runner2 executed.");
		Thread.sleep(10000);
	}
	
	@Test(priority=3)
	public void runner3() throws Exception 
	{
		date=new Date();
		System.out.println(date+" : runner3 executed.");
		Reporter.log(date+" : runner3 executed.");
	}

}
