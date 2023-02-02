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
import POM.MC3679suspence;
import POM.MC3679work;
import Utility.Parametrerization;

public class MC3679 {

	
	
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
	public void scenario5_6() throws InterruptedException, EncryptedDocumentException, IOException {
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
		MC3679work mc3679work=new MC3679work(driver);
		mc3679work.clickonadministration();
		mc3679work.clickonbuisness(driver);
		mc3679work.clickonsearch(driver);
		mc3679work.clickonrule(driver);
		mc3679work.clickonaccount(driver);
		mc3679work.clickonsearch2(driver);
		mc3679work.clickonuserid(driver);
		mc3679work.clickonoperator(driver);
		mc3679work.clickonbuild();
		mc3679work.entertext();
		mc3679work.clickondone();
		mc3679work.clickonaddrule();
		mc3679work.clickonsave(driver);
		mc3679work.selectquestion(driver);
		mc3679work.selectanswer(driver);
		mc3679work.enterfireorder();
		mc3679work.selectsatus(driver);
		mc3679work.selectgroup(driver);
		mc3679work.entercomment();
		
//		
MC3679suspence mc3679suspence =new MC3679suspence(driver);
////		mc3257suspence.clickonadministration();
////		mc3257suspence.clickonbuisness(driver);
////		mc3257suspence.clickonsearch(driver);
		mc3679suspence.clickonrule(driver);
		mc3679suspence.clickonaccount(driver);
		mc3679suspence.clickonsearch2(driver);
		mc3679suspence.clickonuserid(driver);
		mc3679suspence.clickonoperator(driver);
		mc3679suspence.clickonbuild();
		mc3679suspence.entertext();
		mc3679suspence.clickondone();
		mc3679suspence.clickonaddrule();
		mc3679suspence.clickonsave(driver);
		mc3679suspence.selectquestion(driver);
		mc3679suspence.selectanswer(driver);
		mc3679suspence.enterfireorder();
		mc3679suspence.selectsatus(driver);
		mc3679suspence.selectgroup(driver);
		mc3679suspence.entercomment();

		
		
		
		
		
		
	}

}


