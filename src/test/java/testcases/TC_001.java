package testcases;

import org.testng.annotations.Test;

import pages.homepage;

public class TC_001 extends basetest 
{
	
	@Test
	public void CopyTask()
	{
		homepage homepage=new homepage(driver, webActionUtil);
		homepage.ClickOnCallsTask();
		homepage.ClickOnActionsButton();
		homepage.ClickOnCopyToLink();
		homepage.selectCustomer();
		homepage.selectProject();
		homepage.ClickOnCopyTaskButton();
		
	}

}
