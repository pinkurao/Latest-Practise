package newPractice.LatestProjrct;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AccountCreateAmz {
	
	
	public static void main(String arg[]) throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement newcustomer = driver.findElement(By.xpath("//div[@id='nav-flyout-anchor']//div[@class='nav-signin-tooltip-footer']//a[contains(text(),'Start here')]"));
        newcustomer.click();
        Thread.sleep(2000);
        
        WebElement customername = driver.findElement(By.id("ap_customer_name"));
		customername.sendKeys("pavan");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("pavanpinku34@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("pinku9160647577");
		Thread.sleep(2000);
		
		WebElement reenterpwd = driver.findElement(By.id("ap_password_check"));
		reenterpwd.sendKeys("pinku9160647577");
		Thread.sleep(2000);
		
		WebElement createaccount = driver.findElement(By.id("continue"));
		createaccount.click();
		Thread.sleep(2000);
		
		
		
		////div[@id='nav-tools']//a[@id='nav-link-yourAccount']//span[@class='nav-line-2']//span[@class='nav-icon nav-arrow']
		WebElement logoutclick = driver.findElement(By.xpath("//div[@class='nav-right']//a[@id='nav-link-yourAccount']"));
		
		Actions mouseaction = new Actions(driver);
		mouseaction.moveToElement(logoutclick).build().perform();
		//logoutclick.click();
		//Thread.sleep(2000);
		
		
		////div[@id='nav-flyout-anchor']//div[@class='nav-column nav-column-first']//div[@class='nav-panel']//a[@id='nav-item-signout']//span[text()='Not pavan? Sign Out']
		////div[@id='nav-flyout-anchor']//a[@id='nav-item-signout']//span[text()='Not pavan? Sign Out']
		//div[@id='nav-flyout-anchor']//div[@id='nav-flyout-profile']//a[@id='nav-item-signout']//span[text()='Not pavan? Sign Out']
		WebElement logout = driver.findElement(By.xpath("//div[@id='nav-flyout-anchor']//a[@id='nav-item-signout']//span[text()='Not pavan? Sign Out']"));
		logout.click();
		Thread.sleep(2000);
		
		
    	WebElement siginemail = driver.findElement(By.id("ap_email"));
		siginemail.clear();
		siginemail.sendKeys("pavanpinku34@gmail.com");
		Thread.sleep(2000);
		
		
		WebElement signinpassword = driver.findElement(By.id("ap_password"));
		signinpassword.clear();
		signinpassword.sendKeys("pinku9160647577");
		Thread.sleep(2000);
		
		WebElement signinbutton = driver.findElement(By.id("signInSubmit"));
		signinbutton.click();
		Thread.sleep(2000);
				
	
		
	}

}
