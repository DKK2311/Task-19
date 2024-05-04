package locator;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class locator {

		public static void main(String[] args) {
			
			//Using Edge Browser Instead of Chrome
			WebDriver driver = new EdgeDriver();  
			
			//Maximizing the window 
			driver.manage().window().maximize();
			
			//Navigating the URL
			driver.get("https://www.guvi.in/register");
			
			//Using ImplicitlyWait for page to wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
			
			//Using class name locator for name			
			driver.findElement(By.className("form-control")).sendKeys("Dharaneesh kumar D");        
			
			//Using id locator for email and password
			driver.findElement(By.id("email")).sendKeys("dharandharaneeshkumar@gmail.com");
			driver.findElement(By.id("password")).sendKeys("Sdkumar@2000");
			
			//Using cssSelector locator for mobile number
			driver.findElement(By.cssSelector("input#mobileNumber")).sendKeys("9042555858");  
			
			//Using xpath locator for Signup
			driver.findElement(By.xpath("//a[@id='signup-btn']")).click();
			
			//Using tagName locator for Current Profile
			driver.findElement(By.tagName("select")).sendKeys("Students");
			
			//Using id locator for Degree and Year
			driver.findElement(By.id("degreeDrpDwn")).sendKeys("B.E./B.Tech.Computer Science");
			driver.findElement(By.id("year")).sendKeys("2022");

			//Closing the driver
			driver.close();
		}
		
	}
		