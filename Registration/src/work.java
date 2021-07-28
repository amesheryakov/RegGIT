import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class work {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "//Users//alexy//Desktop//chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
		
        driver.manage().window().maximize(); //otherwise some elements will not be interactable
		
		driver.get("https://www.hm.com/entrance.ahtml");

		
		driver.findElement(By.id("link_en_ca")).click(); 
		
		
		
		driver.findElement(By.cssSelector("button[type='submit']")).click(); 
		
	Thread.sleep(2000);
	
	driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	
	driver.findElement(By.xpath("//a[@href='/en_ca/men.html']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//body/main[@id='main-content']/div[2]/aside[1]/nav[1]/ul[1]/li[4]/ul[1]/li[4]/a[1]")).click();
	
	Thread.sleep(2000);
	
	
	//JavascriptExecutor executor = (JavascriptExecutor) driver;
	
	//WebElement hello = driver.findElement(By.xpath("//form/fieldset[2]/button")); 
	
	//executor.executeScript("arguments[0].click();", hello ); 

	
	driver.findElement(By.xpath("//form/fieldset[2]/button")).click();
	
	driver.findElement(By.cssSelector("label[for='dropdown-sleeveLengths-longsleeve']")).click();
	
	driver.findElement(By.xpath("//button[@aria-controls='dropdown-sizes']")).click();
	
	Thread.sleep(2000); //otherwise element will be stale
	
	driver.findElement(By.cssSelector("input[value='351_m_3_menswear']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[contains(@data-largescreen-text, 'FILTERS')]")).click();
	
    driver.findElement(By.xpath("//span[text()='Material']")).click(); 
	
	driver.findElement(By.xpath("//label[@for='drawer-materials-linen']")).click();
	
    driver.findElement(By.xpath("//button[text()='Done']")).click();
	
	driver.quit();
	}

}
