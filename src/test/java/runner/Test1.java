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
		System.out.println(date+"1111111111111111111111111111");
		Reporter.log("<br>"+date+"111111111111111111111111111"+"</br>");
		Thread.sleep(10000);
	}
	
	@Test(priority=2)
	public void runner2() throws Exception 
	{
		date=new Date();
		System.out.println(date+"222222222222222222222222");
		Reporter.log("<br>"+date+"222222222222222222222"+"</br>");
		Thread.sleep(10000);
	}
	
	@Test(priority=3)
	public void runner3() throws Exception 
	{
		date=new Date();
		System.out.println(date+"333333333333333333333333");
		Reporter.log("<br>"+date+"333333333333333333333333"+"</br>");
		throw new Exception("Failed due to ..................................");
	}

}
