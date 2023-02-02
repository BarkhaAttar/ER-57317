package POM;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MC2721PD {
@FindBy(css="#NewRuleButton")private WebElement rules;
@FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='RuleCriteriaForm']/div[@id='erViewRuleCriteria']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")private WebElement search2;
@FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='RuleCriteriaForm']/div[@id='erViewRuleCriteria']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[5]/span[1]/span[3]")private WebElement work;
@FindBy(xpath="/html[1]/body[1]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]")private WebElement values;
@FindBy(xpath="//body/span[1]/span[1]/span[1]/input[1]")private WebElement values2;
@FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='RuleCriteriaForm']/div[@id='erViewRuleCriteria']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[5]/span[1]/span[3]")private WebElement user_id;
@FindBy(xpath="//span[@id='select2-selectedOperator-container']")private WebElement selectsop;
@FindBy(xpath="//body/span[1]/span[1]/span[1]/input[1]")private WebElement search3;
@FindBy(xpath="//li[@id='select2-selectedOperator-result-7lct-==']")private WebElement equal;
@FindBy(xpath="//button[@id='showDialog_ruleExpressionPane1']")private WebElement build;
@FindBy(xpath="//textarea[@id='value1']")private WebElement texts;
@FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='RuleCriteriaForm']/div[4]/div[3]/div[1]/button[1]")private WebElement done;
@FindBy(xpath="//button[@id='addSegment']")private WebElement add_rule;
@FindBy(xpath="//button[@id='saveCriteria']")private WebElement Save_next;
@FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='IntMCValueForm']/div[@id='mcValuePage']/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[12]/div[1]/div[1]/div[2]/a[1]")private WebElement math1;
@FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='IntMCValueForm']/div[@id='mcValuePage']/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[11]/div[1]/div[1]/div[2]/a[1]")private WebElement math2;
@FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='IntMCValueForm']/div[@id='mcValuePage']/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[13]/div[1]/div[1]/div[2]/a[1]")private WebElement math3;
@FindBy(xpath="//textarea[@id='flex']")private WebElement value1;
@FindBy(xpath="//textarea[@id='flex']")private WebElement value2;
@FindBy(xpath="//textarea[@id='flex']")private WebElement value3;
@FindBy(xpath="//button[contains(text(),'Done')]")private WebElement done2;
@FindBy(xpath="//button[contains(text(),'Done')]")private WebElement done21;
@FindBy(xpath="//button[contains(text(),'Done')]")private WebElement done31;
@FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='IntMCValueForm']/div[@id='mcValuePage']/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[12]/div[1]/div[1]/div[1]/div[1]/div[1]")private WebElement checkbox1;
@FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='IntMCValueForm']/div[@id='mcValuePage']/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[11]/div[1]/div[1]/div[1]/div[1]/div[1]")private WebElement checkbox2;
@FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='IntMCValueForm']/div[@id='mcValuePage']/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[13]/div[1]/div[1]/div[1]/div[1]/div[1]")private WebElement checkbox3;
@FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='IntMCValueForm']/div[2]/div[1]/button[2]/i[1]")private WebElement Save_Next;
@FindBy(xpath="//input[@id='selectedFireIndex']")private WebElement fire_order;
@FindBy(xpath="//a[@id='2023-02-03']")private WebElement date;
@FindBy(xpath="//button[@id='submitForm_finish']")private WebElement finish;
@FindBy(xpath="//span[@id='select2-mcRuleStatus-container']")private WebElement status;
@FindBy(xpath="//body/span[1]/span[1]/span[1]/input[1]")private WebElement select;
@FindBy(xpath="//span[@id='select2-configGroup-container']")private WebElement group;
@FindBy(xpath="//body/span[1]/span[1]/span[1]/input[1]")private WebElement group_select;
@FindBy(xpath="//textarea[@id='comments']")private WebElement comment;
@FindBy(xpath="//body/div[@id='erWizardLayout']/form[@id='WizardConfirmForm']/div[2]/div[1]/span[1]/button[3]/i[1]")private WebElement commit;




public MC2721PD(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}



	
public void clickonrule(WebDriver driver) throws InterruptedException {
//	((JavascriptExecutor)driver).executeScript("window.scrollBy(600,400)");
	Thread.sleep(2000);
     ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",rules);
//     FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver);
//		wait.withTimeout(Duration.ofMillis(2000));
//		wait.pollingEvery(Duration.ofMillis(500));
//		wait.ignoring(Exception.class);
//		wait.until(ExpectedConditions.visibilityOf(rules));
	     
//  WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(30000));
//  wait.until(ExpectedConditions.visibilityOf(rules));
//	((JavascriptExecutor)driver).executeScript("window.scrollBy(600,400)");

	rules.click();
}


public void clickonwork(WebDriver driver) {
	search2.sendKeys("workout plan type");
	Actions  act=new Actions(driver);
	act.sendKeys(Keys.ENTER).perform();
	act.moveToElement(work).click().build().perform();
	selectsop.click();
	search3.sendKeys("Equal to");
	act.sendKeys(Keys.ENTER).build().perform();
	values.click();
	values2.sendKeys("DEFERMOD - Deferment Modification");
	act.sendKeys(Keys.ENTER).build().perform();
	((JavascriptExecutor)driver).executeScript("window.scrollBy(400,600)");
  	add_rule.click();
	((JavascriptExecutor)driver).executeScript("window.scrollBy(400,600)");
	search2.clear();

	
	
}
public void clickonsearch2(WebDriver driver) {
	search2.sendKeys("user id");
	Actions act=new Actions(driver);
	act.sendKeys(Keys.ENTER).perform();
	
	
}
public void clickonuserid(WebDriver driver) {
	Actions act=new Actions(driver);
	act.moveToElement(user_id).click().build().perform();
}
public void clickonoperator(WebDriver driver) {
	selectsop.click();
	search3.sendKeys("Equal to");
	Actions act=new Actions(driver);
	act.sendKeys(Keys.ENTER).build().perform();
	
}
public void clickonbuild() {
	build.click();
}
public void entertext() {
	texts.sendKeys("cscbarkha");
}
public void clickondone() {
	done.click();
	
}


public void clickonaddrule() {
	add_rule.click();
}

public void clickonsave(WebDriver driver){
	((JavascriptExecutor)driver).executeScript("window.scrollBy(600,400)");
	Save_next.click();
	
}
public void clickonmath(WebDriver driver) {
//((JavascriptExecutor)driver).executeScript("window.scrollBy(800,600)");
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",math1);
 math1.click();
}
public void entervalue(WebDriver driver) {
	value1.sendKeys("500");
	done2.click();
	checkbox1.click();
	math2.click();
	value2.sendKeys("150.50");
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",done21);

	done21.click();
	checkbox2.click();
	math3.click();
	value3.sendKeys("450");
	
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",done31);
	done31.click();
	checkbox3.click();
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",Save_Next);
	Save_Next.click();
}
public void enterfireorder() {
	fire_order.sendKeys("1");
	date.click();
	finish.click();
}
public void selectsatus(WebDriver driver) {
	status.click();
	select.sendKeys("Testing - config status");
	Actions act=new Actions(driver);
	act.sendKeys(Keys.ENTER).build().perform();
}
public void selectgroup(WebDriver driver) {
	group.click();
	group_select.sendKeys("SeleniumQA - For Selenium QA");
	Actions act=new Actions(driver);
	act.sendKeys(Keys.ENTER).build().perform();
}
public void entercomment() {
	comment.sendKeys("Test");
	commit.click();
}




}
	