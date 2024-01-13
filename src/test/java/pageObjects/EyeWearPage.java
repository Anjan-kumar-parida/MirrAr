package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EyeWearPage extends BasePage {
	
	WebDriver driver;
	
	public EyeWearPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@id='rigel_glasses']//div[@class='card-actions']//div//button[@class='card-action-button standard-button'][normalize-space()='Try On Now']")
	WebElement btn_rigel_glasses;
	
	@FindBy(xpath = "//div[@id='mustang_glasses']//div[@class='card-actions']//div//button[@class='card-action-button standard-button'][normalize-space()='Try On Now']")
	WebElement btn_mustang_glasses;
	
	@FindBy(xpath = "//div[@id='aviator_glasses']//div[@class='card-actions']//div//button[@class='card-action-button standard-button'][normalize-space()='Try On Now']")
	WebElement btn_aviator_glasses;
	
	@FindBy(xpath = "//div[normalize-space()='Mangalsutras']")
	WebElement Mangalsutras;
	
	@FindBy(xpath = "//div[normalize-space()='Earrings']")
	WebElement Earrings;
	
	@FindBy(xpath="//div[normalize-space()='Handbags']")
	WebElement handbags;
	
	@FindBy(xpath="//div[normalize-space()='Necklaces']")
	WebElement necklaces;
	
	@FindBy(xpath="//div[normalize-space()='Sets']")
	WebElement sets;
	
	@FindBy(xpath="//div[normalize-space()='Rings']")
	WebElement rings;
	
	@FindBy(xpath="//div[normalize-space()='Bracelets']")
	WebElement bracelets;
	
	@FindBy(xpath="//div[normalize-space()='Pendants']")
	WebElement pendants;
	
	@FindBy(xpath="//div[normalize-space()='Pendantsets']")
	WebElement pendantsets;
	
	@FindBy(tagName = "a")
	List<WebElement> links;
	
	//@FindBy(tagName = "img")
	//List<WebElement> imgLinks;
	
	
	public List<WebElement> getLinks(){
		//links.addAll(imgLinks);
		return links;
	}
	
	public void clickbtn_rigel_glasses() {
		btn_rigel_glasses.click();
	}
	
	public void clickbtn_mustang_glasses() {
		btn_mustang_glasses.click();
	}
	
	public void clickbtn_aviator_glasses() {
		btn_aviator_glasses.click();
	}
	
	
	
}
