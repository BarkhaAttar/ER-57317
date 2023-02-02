package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.reactivex.rxjava3.functions.Action;

public class EDITOR {
	
	
	@FindBy(xpath="//body/nav[@id='topnav']/div[1]/div[2]/ul[1]/li[1]/a[1]")private WebElement application;
	@FindBy(xpath="//a[contains(text(),'Workout Editor')]")private WebElement workouteditor;
	@FindBy(xpath="//input[@id='accountNumber']")private WebElement account_no;
	@FindBy(xpath="//button[@id='er-button-1']")private WebElement continues;
	@FindBy(css="#er-button-3")private WebElement run_new;
//	@FindBy(xpath="//button[@id='er-button-3']")private WebElement run_new;
	
	
	
	
	
	
	
	public EDITOR(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickonapplication() {
		application.click();
	}
	
	public void clickonworkouteditor(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(workouteditor).click().build().perform();
	}
	public void enteraccountno() {
		account_no.sendKeys("BS2023");
		continues.click();
		}
	
		
		public void clickonrundecision(WebDriver driver){
			  WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(30000));
			wait.until(ExpectedConditions.visibilityOf(run_new));;
		run_new.click();
	}
	
	

}
