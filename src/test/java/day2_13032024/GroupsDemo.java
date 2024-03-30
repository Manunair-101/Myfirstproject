package day2_13032024;

import org.testng.annotations.Test;
@Test(groups = {"ClassLevelGroups"})
public class GroupsDemo {

	@Test(groups = {"linux.Smoke"})
	public void test1()
	{
		System.out.println("Test 1 {\"Smoke\"}");
	}
	
	@Test(groups = {"windows.Sanity"})
	public void test2()
	{
		System.out.println("Test 2 {\"Sanity\"}");
	}
	
	@Test(groups = {"Sanity", "Smoke"})
	public void test3()
	{
		System.out.println("Test 3 {\"Sanity\", \"Smoke\"}");
	}
	
	
	@Test(groups = {"mac.Regression"})
	public void test4()
	{
		System.out.println("Test 4 {\"Regression\"}");
	}
	
	@Test(groups = {"Sanity", "Regression"})
	public void test5()
	{
		System.out.println("Test 5 {\"Sanity\", \"Regression\"}");
	}
	
	@Test(groups = {"Smoke","Sanity","Regression"})
	public void test6()
	{
		System.out.println("Test 6 {\"Smoke\",\"Sanity\",\"Regression\"}");
	}

}
