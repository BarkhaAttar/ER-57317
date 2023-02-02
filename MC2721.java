package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Eracceptpage;
import POM.Erlogin;
import POM.MC2721PD;
import POM.Mc2721PC;
import Utility.Parametrerization;

public class MC2721 {
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
	public void scenario1_2() throws EncryptedDocumentException, IOException, InterruptedException {
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
		 Mc2721PC mc2721pc=new Mc2721PC(driver);
		 mc2721pc.clickonadministration();
		 mc2721pc.clickonbuisness(driver);
		 mc2721pc.clickonsearch(driver);
		 mc2721pc.clickonrule(driver);
		 mc2721pc.clickonwork(driver);
		 mc2721pc.clickonsearch2(driver);
		 mc2721pc.clickonuserid(driver);
		 mc2721pc.clickonoperator(driver);
		 mc2721pc.clickonbuild();
		 mc2721pc.entertext();
		 mc2721pc.clickondone();
		 mc2721pc.clickonaddrule();
		 mc2721pc.clickonsave(driver);
		 mc2721pc.clickonmath(driver);
		 mc2721pc.entervalue(driver);
		 mc2721pc.enterfireorder();
		mc2721pc.selectsatus(driver);
		mc2721pc.selectgroup(driver);
		mc2721pc.entercomment();
		
	MC2721PD mc2721pd=new MC2721PD(driver);
	mc2721pd.clickonrule(driver);
	mc2721pd.clickonwork(driver);
		mc2721pd.clickonsearch2(driver);
		mc2721pd.clickonuserid(driver);
		mc2721pd.clickonoperator(driver);
		mc2721pd.clickonbuild();
		mc2721pd.entertext();
		mc2721pd.clickondone();
		 mc2721pd.clickonaddrule();
		 mc2721pd.clickonsave(driver);
		 mc2721pd.clickonmath(driver);
		 mc2721pd.entervalue(driver);
		 mc2721pd.enterfireorder();
		mc2721pd.selectsatus(driver);
		mc2721pd.selectgroup(driver);
		mc2721pd.entercomment();
		
}
	

}
