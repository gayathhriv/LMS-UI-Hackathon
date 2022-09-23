package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Add_Edit_BatchesPage {
	
	WebDriver ldriver;


	public Add_Edit_BatchesPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//button[@id='new']")
	@CacheLookup
	WebElement btnAddBatch;

	
	@FindBy(xpath= "*[@id='batchName']")
	WebElement txtBatchName;

	@FindBy(xpath= "*[@id='batchDescription']")
	WebElement txtBatchDescription;
	
	@FindBy(xpath= "//div[2]/div[3]/p-dropdown")
	WebElement dropdownBatchProgram;

	@FindBy(xpath= "//div[2]/p-radiobutton")
	WebElement radBatchActiveStatus;

	@FindBy(xpath= "//div[3]/p-radiobutton")
	WebElement  radBatchInActiveStatus;

	@FindBy(xpath= "//*[@id='batchNoOfClasses']")
	WebElement txtBatchNoClasses;

	@FindBy(xpath= "//div/div/div[3]/button[2]/span[2]")
	WebElement btnSave;
	
	@FindBy(xpath= "//div/div/div[3]/button[1]/span[2]")
	WebElement btnCancel;
	
	@FindBy(xpath= "//*[@id='fbConsole']/div[10]/span")
	WebElement txtMessage;

	public void clickBatches()
	{
	
		btnAddBatch.click();
	}
	public void clickSave()
	{
		btnSave.click();
	}

	public void clickCancel()
	{
		btnCancel.click();
	}

	public void setBatchName()
	{
		txtBatchName.sendKeys("Batch Name");
	}

	public void setBatchDesc()
	{
		txtBatchDescription.sendKeys("Batch Description");
	}

	/*public void selectBatchProgram()
	{
		WebElement dropdownBatchProgram=(WebElement) new Select(dropdownBatchProgram);
		dropdownBatchProgram.selectByVisibleText("SDET");
	}*/
	public void clickRadActive()
	{
		radBatchActiveStatus.click();
	}
	public void clickRadInactive()
	{
		radBatchInActiveStatus.click();
	}

	public void setBatchNoClasses()
	{
		txtBatchNoClasses.sendKeys("Batch No of Classes");
	}
	
	public String getMessage()
	{
		return txtMessage.getText();
	}

}
