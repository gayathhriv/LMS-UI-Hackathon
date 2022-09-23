package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ManageBatchPage {
	
	WebDriver ldriver;

	public ManageBatchPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@type= 'text']")
	@CacheLookup
	WebElement txtboxSearch;
	
	@FindBy(xpath="//button[@id='new']")
	@CacheLookup
	WebElement btnAddBatch;
	
	@FindBy(xpath = "//tbody/tr[1]/td[7]/div/span[1]/button")
	WebElement btnEditBatch;
	
	@FindBy(xpath ="//tbody/tr[1]/td[7]/div/span[2]/button")
	WebElement btnDelBatch;
	
	@FindBy(xpath ="//div[2]/div[1]/button")
	WebElement btnDelBatch2;
	
	
	public void clickBatches()
	{
	
		btnAddBatch.click();
		//need to write pop up message
	}
	
	public void clickEditButton()
	{
		btnEditBatch.click();
	}
	
	public void clickDeleteButton()
	{
		 btnDelBatch.click();
	}
	
	public void verifyFieldsDisplay()
	{
		
		Assert.assertTrue(btnAddBatch.isDisplayed());
		Assert.assertTrue(btnEditBatch.isDisplayed());
		Assert.assertTrue(btnDelBatch.isDisplayed());
		Assert.assertFalse(btnDelBatch.isDisplayed());
		
	}
}
