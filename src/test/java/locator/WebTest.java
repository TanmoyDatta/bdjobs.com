package locator;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class WebTest {
	@Test
	public void testWebPage() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://bdjobs.com/");
        assertEquals(driver.getTitle(), "Largest Job Site in Bangladesh, Search Jobs | Bdjobs.com");
        System.out.println(driver.getTitle());
     
        Thread.sleep(2000);	
        
        //HomePage
        WebElement SignInButton = driver.findElement(By.xpath("//li[@class='hidden-xs soca']"));
        //String textget = driver.findElement(By.xpath("//li[@class='hidden-xs soca']")).getText();
        //Assert.assertEquals(textget.trim(), "Sign in ");
     
        SignInButton.click();
        
        //Login Page
        //Select Bdjobs Profile
        WebElement MyBdjobsSignButton = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[6]/ul/li/div[1]/div[2]/div[3]/a[1]"));
        MyBdjobsSignButton.click();
        Thread.sleep(2000);
        
        
        //EnterEmail
        WebElement EnterEmail = driver.findElement(By.xpath("//input[@id='TXTUSERNAME']"));
        EnterEmail.click();
        EnterEmail.sendKeys("tograciddoullu-7599@yopmail.com");
        
        //ContinueButton
        WebElement ContinueButton = driver.findElement(By.cssSelector("input[value='Continue']"));
        ContinueButton.click();
        
        //EnterPassword
        WebElement EnterPasswordButton = driver.findElement(By.cssSelector("#TXTPASS"));
        EnterPasswordButton.sendKeys("12345678");
        
        //Password Eye icon showing
        driver.findElement(By.xpath("//i[@id='ieye']")).click();
        Thread.sleep(2000);
        
        //signButton
        WebElement SignButton = driver.findElement(By.cssSelector("input[value='Sign in']"));
        SignButton.click();
        Thread.sleep(5000);
        
        assertEquals(driver.getTitle(), "Largest Job Site in Bangladesh, Search Jobs | Bdjobs.com");
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
     
        driver.quit();
		
	}

}