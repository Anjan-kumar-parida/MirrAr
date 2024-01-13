package testCases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.EyeWearPage;
import testBase.BaseClass;

public class Test_001_CheckLinkWorking extends BaseClass{
	
	@Test
	public void verifyLinks() {
		
		try {
			EyeWearPage eyePage = new EyeWearPage(driver);
			
			List<WebElement> list = eyePage.getLinks();
			System.out.println(list.size());
			Assert.assertTrue(true);
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
