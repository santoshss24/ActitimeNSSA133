package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage extends basepage 
{
	@FindBy(id = "logoutLink")
	private WebElement logoutLink;
	
	@FindBy(xpath = "//div[text()='Calls']")
	private WebElement CallsTask;
	
	@FindBy(xpath = "//div[text()='ACTIONS']")
	private WebElement ActionsButton;
	
	@FindBy(xpath = "//div[text()='Copy to']")
	private WebElement CopyToLink;
	
	@FindBy(xpath = "//div[text()='- Select Customer -']")
	private WebElement SelectCustomerDropDown;
	
	@FindBy(xpath = "//div[text()='Big Bang Company']")
	private WebElement BigBangCompanyCustomer;
	
	@FindBy(xpath = "//div[text()='- Select Project -']")
	private WebElement SelectProjectDropDown;
	
	@FindBy(xpath = "//div[text()='Flight operations']")
	private WebElement FlightOperationsProject;
	
	@FindBy(xpath = "//div[text()='Copy']")
	private WebElement CopyTaskButton;
	
	public homepage(WebDriver driver, libraries.webActionUtil webActionUtil) {
		super(driver, webActionUtil);
		// TODO Auto-generated constructor stub
	}
	
	public void ClickOnCallsTask()
	{
		webActionUtil.clickOnElement(CallsTask);
	}
	
	public void ClickOnActionsButton()
	{
		webActionUtil.clickOnElement(ActionsButton);
	}
	
	public void ClickOnCopyToLink()
	{
		webActionUtil.clickOnElement(CopyToLink);
	}
	
	
	public void selectCustomer()
	{
		webActionUtil.clickOnElement(SelectCustomerDropDown);
		webActionUtil.clickOnElement(BigBangCompanyCustomer);
	}
	
	public void selectProject()
	{
		webActionUtil.clickOnElement(SelectProjectDropDown);
		webActionUtil.clickOnElement(FlightOperationsProject);
	}
	
	public void ClickOnCopyTaskButton()
	{
		webActionUtil.clickOnElement(CopyTaskButton);
	}
	
	
	public void clickOnLogout()
	{
		webActionUtil.clickOnElement(logoutLink);
	}
	
	
	

}
