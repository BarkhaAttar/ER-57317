package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Eracceptpage;
import POM.Erlogin;
import POM.MC3257work;
import POM.MC500;
import Utility.Parametrerization;

public class MC500t {

	
	
	
	WebDriver driver;
	@BeforeMethod
	
	public void browseon() {
		driver=Browser.openBrowser();
	}
	@Test
	public void scenario3() throws EncryptedDocumentException, IOException
	{
		Eracceptpage eracceptpage=new Eracceptpage(driver);
	     eracceptpage.clickonaccept(driver);	 
		 Erlogin erlogin=new Erlogin(driver);
//		 erlogin.EnteruserID("cscbarkha",driver);
		 String username=Parametrerization.getData(0, 1);
		 erlogin.EnteruserID(username, driver);
		 String password=Parametrerization.getData(1, 1);
		 erlogin.Enterpass(password, driver);	 
//		 erlogin.Enterpass("Chava*4999+2022",driver);
		 erlogin.Clickonlogin();
		 }
		 
	@Test
	public void scenario_9() throws InterruptedException, EncryptedDocumentException, IOException {
		Eracceptpage eracceptpage=new Eracceptpage(driver);
	     eracceptpage.clickonaccept(driver);	 
		 Erlogin erlogin=new Erlogin(driver);
//		 erlogin.EnteruserID("cscbarkha",driver);
		 String username=Parametrerization.getData(0, 1);
		 erlogin.EnteruserID(username, driver);
		 String password=Parametrerization.getData(1, 1);
		 erlogin.Enterpass(password, driver);	 
//		 erlogin.Enterpass("Chava*4999+2022",driver);
		 erlogin.Clickonlogin();
		MC500 mc500=new MC500(driver);
		mc500.clickonadministration();
		mc500.clickonbuisness(driver);
		mc500.clickonsearch(driver);
		mc500.clickonrule(driver);
		mc500.clickonaccount(driver);
		mc500.clickonsearch2(driver);
		mc500.clickonuserid(driver);
		mc500.clickonoperator(driver);
		mc500.clickonbuild();
		mc500.entertext();
		mc500.clickondone();
		mc500.clickonaddrule();
		mc500.clickonsave(driver);
		
//		mc500.clickonworkouttype1(driver);
//		mc500.clickonworkouttype2(driver);

		mc500.clickonrepay(driver);
		mc500.clickonrpb(driver);
		mc500.clickonmort(driver);
		mc500.clickonmodsf(driver);
		mc500.clickonmod(driver);
		mc500.clickonpcsf(driver);
		mc500.clickonpartialclaim(driver);
		mc500.clickonworkouttype1(driver);
	mc500.clickonworkouttype2(driver);
		mc500.enterfireorder();
		mc500.selectsatus(driver);
		mc500.selectgroup(driver);
		mc500.entercomment();
}}

