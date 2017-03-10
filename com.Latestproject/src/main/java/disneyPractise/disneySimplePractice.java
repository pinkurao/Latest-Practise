package disneyPractise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class disneySimplePractice {
	
	
	WebDriver driver;
	String url = "https://disneyworld.disney.go.com/?CMP=OKC_wdw_gmap_421";
	
	By parksSelection = By.xpath("//div[@class='gnbCategory gnbParksAndTickets']//a[@class='gnbCategoryTitle']");
	By dateSelection = By.xpath("//div[@class='pepDayScroller_dayWrapper']//div[@class='pepDayScroller_dayNum']//span[text()='10']");
	By adultSelection = By.xpath("//div[@class='simpleCounter_counter']//button[@class='simpleCounter_button tappable webfont-char button increment']");
	By ticketSelect = By.xpath("//div[@class='pepProgressiveReveal__content']//div[@class='themeParkTickets_content']//div[@class='themeParkTickets_ticketName']//h3[@class='themeParkTickets_ticketTitle']//b[text()='Admission to 1 Park']");
	By addCart = By .id("addToCart");
	By checkout = By.xpath("//div[@class='checkOutLoginButtonWrapper']//span[text()='Check Out']");
 
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new FirefoxDriver();
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.getTitle();
	  System.out.println("BEFORE CLASS OF DISNEY");
	  
  }

  @Test(alwaysRun=true)
  
  public void sampleDinseyTest() throws InterruptedException {
	  
	  driver.findElement(parksSelection).click();
	  Thread.sleep(2000);
	  driver.findElement(dateSelection).click();
	  Thread.sleep(2000);
	  driver.findElement(adultSelection).click();
	  Thread.sleep(2000);
	  driver.findElement(ticketSelect).click();
	  Thread.sleep(2000);
	  driver.findElement(addCart).click();
	  Thread.sleep(2000);
	  driver.findElement(checkout).click();
	  Thread.sleep(2000);
  }
  
  
  
  
  
  @AfterClass
  public void afterClass() {
	  
	  System.out.println("AFTER CLASS DISNEY");
	  driver.close();
  }

}
