package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Eracceptpage;
import POM.Erlogin;
import POM.MC3257suspence;
import POM.MC3257work;
import Utility.Parametrerization;

public class MC3257 {
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
	public void scenario3_4() throws InterruptedException, EncryptedDocumentException, IOException {
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
		MC3257work mc3257work=new MC3257work(driver);
		mc3257work.clickonadministration();
		mc3257work.clickonbuisness(driver);
		mc3257work.clickonsearch(driver);
		mc3257work.clickonrule(driver);
		mc3257work.clickonaccount(driver);
		mc3257work.clickonsearch2(driver);
		mc3257work.clickonuserid(driver);
		mc3257work.clickonoperator(driver);
		mc3257work.clickonbuild();
		mc3257work.entertext();
		mc3257work.clickondone();
		mc3257work.clickonaddrule();
		mc3257work.clickonsave(driver);
		mc3257work.selectquestion(driver);
		mc3257work.selectanswer(driver);
		mc3257work.enterfireorder();
		mc3257work.selectsatus(driver);
		mc3257work.selectgroup(driver);
		mc3257work.entercomment();
		
//		
	MC3257suspence mc3257suspence =new MC3257suspence(driver);
//		mc3257suspence.clickonadministration();
//		mc3257suspence.clickonbuisness(driver);
//		mc3257suspence.clickonsearch(driver);
		mc3257suspence.clickonrule(driver);
		mc3257suspence.clickonaccount(driver);
		mc3257suspence.clickonsearch2(driver);
		mc3257suspence.clickonuserid(driver);
		mc3257suspence.clickonoperator(driver);
		mc3257suspence.clickonbuild();
		mc3257suspence.entertext();
		mc3257suspence.clickondone();
		mc3257suspence.clickonaddrule();
		mc3257suspence.clickonsave(driver);
		mc3257suspence.selectquestion(driver);
		mc3257suspence.selectanswer(driver);
		mc3257suspence.enterfireorder();
		mc3257suspence.selectsatus(driver);
		mc3257suspence.selectgroup(driver);
		mc3257suspence.entercomment();

		
		
		
		
		
		
	}

}
