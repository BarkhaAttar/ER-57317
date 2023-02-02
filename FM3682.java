package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Eracceptpage;
import POM.Erlogin;
import POM.FM3682suspence;
import POM.FM3682work;
import POM.MC3679work;
import Utility.Parametrerization;

public class FM3682 {
	
	
	
	
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
	public void scenario7_8() throws InterruptedException, EncryptedDocumentException, IOException {
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
		FM3682work fm3682work=new FM3682work(driver);
		fm3682work.clickonadministration();
		fm3682work.clickonbuisness(driver);
		fm3682work.clickonsearch(driver);
		fm3682work.clickonrule(driver);
		fm3682work.clickonaccount(driver);
		fm3682work.clickonsearch2(driver);
		fm3682work.clickonuserid(driver);
		fm3682work.clickonoperator(driver);
		fm3682work.clickonbuild();
		fm3682work.entertext();
		fm3682work.clickondone();
		fm3682work.clickonaddrule();
		fm3682work.clickonsave(driver);
		fm3682work.enterquestion(driver);
		fm3682work.enterfireorder();
		fm3682work.selectsatus(driver);
		fm3682work.selectgroup(driver);
		fm3682work.entercomment();
		
		FM3682suspence fm3682suspence=new FM3682suspence(driver);
		fm3682suspence.clickonrule(driver);
		fm3682suspence.clickonaccount(driver);
		fm3682suspence.clickonsearch2(driver);
		fm3682suspence.clickonuserid(driver);
		fm3682suspence.clickonoperator(driver);
		fm3682suspence.clickonbuild();
		fm3682suspence.entertext();
		fm3682suspence.clickondone();
		fm3682suspence.clickonaddrule();
		fm3682suspence.clickonsave(driver);
		fm3682suspence.enterquestion(driver);
		fm3682suspence.enterfireorder();
		fm3682suspence.selectsatus(driver);
		fm3682suspence.selectgroup(driver);
		fm3682suspence.entercomment();

		


}}
