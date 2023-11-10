package seleniumscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// Open a Chrome Browser
		// Webdriver is a interface in selenium

		// Create a WebDriver instance for Chrome
		WebDriver driver = new ChromeDriver();

		// Open a website
		driver.get("https://www.amazon.in/");

		// Maximize the browser window
		driver.manage().window().maximize();

		// Get the current URL
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentURL);

		// Get the page title
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);

		
			// Perform some other actions, e.g., navigating back and forward
		driver.navigate().back();
		driver.navigate().forward();
		
		//Thread.sleep(2000);

		// Refresh the current page
		driver.navigate().refresh();
		
		
      
		
		Thread.sleep(1000);
		
		driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='a-box-inner a-padding-extra-large']/descendant::input[1]")).sendKeys("9490919772");
		
		driver.findElement(By.xpath("//div[@class='a-box-inner a-padding-extra-large']/descendant::input[3]")).sendKeys("Grany87");
		
		driver.findElement(By.xpath("//div[@class='a-box-inner a-padding-extra-large']/descendant::input[5]")).click();
		
		
        
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("iPhone 13");
        Thread.sleep(1000);
        
        WebElement searchBox1 = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        searchBox1.click();
        
        Thread.sleep(2000);
		// Verify the page's ability to scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by 500 pixels
        js.executeScript("window.scrollBy(0,5000)","");
        
        Thread.sleep(2000);
        
        // Scroll up by 500 pixels
        js.executeScript("window.scrollBy(0,-5000)","");
        
WebElement addtochart = driver.findElement(By.id("nav-cart-count"));
               addtochart.click();
               WebElement Item = driver.findElement(By.xpath("//img[@alt='Fostelo Women&#39;s Zara Faux Leather Handbag (Medium)']"));
               Item.click();
               WebElement Addedtowishlist = driver.findElement(By.id("add-to-wishlist-button-submit"));
               Addedtowishlist.click();
               
               
        
		
		// Quit the WebDriver instance and close all associated windows and processes
		driver.quit();
		

	}

}