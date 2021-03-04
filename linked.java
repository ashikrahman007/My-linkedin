package ashik_test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class linked {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	 driver.get("https://www.linkedin.com/home");
	 driver.manage().window().maximize();
	 Thread.sleep(4000);
		 WebElement signin = driver.findElement(By.cssSelector("a.nav__button-secondary"));
		 signin.click();
		 Thread.sleep(2000);
		 WebElement username = driver.findElement(By.cssSelector("input#username"));
		 username.sendKeys("ashikrahaman2011@gmail.com");
		 Thread.sleep(2000);
		 WebElement pass = driver.findElement(By.cssSelector("input#password"));
		 pass.sendKeys("ashik16103189");
		 Thread.sleep(2000);
		 WebElement Sign = driver.findElement(By.cssSelector("div.login__form_action_container"));
		 Sign.click();
		 Thread.sleep(2000);
		 System.out.println("System Sucessfully Log-in");
		 
		 
		 
		

       
    }


}
