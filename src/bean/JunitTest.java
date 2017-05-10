package bean;
import static net.sourceforge.jwebunit.junit.JWebUnit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import org.junit.Test;

public class JunitTest {
	//public static void main(String[] args){
		
		
		//String url = "http://localhost:8080/job/Selenium/ws/WebContent/index1.jsp";
		
		
		@Test
		public void testTwo(){ 
			System.setProperty("webdriver.gecko.driver","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			
			//System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver();
			//File file = new File("C:\\Program Files\\IEDriverServer.exe");
			//System.setProperty("webdriver.ie.driver",file.getAbsolutePath());
			//WebDriver driver = new InternetExplorerDriver();
			//System.setProperty("webdriver.ie.driver", "IEDriverServer.exe"); 
		  // driver.get("http://localhost:8080/job/Selenium/ws/WebContent/index1.jsp");
		   	driver.get("http://localhost:8080/job/Selenium/ws/WebContent/index1.jsp");
		 	Assert.assertTrue(driver.getTitle().contains("Login Page"));
		 }
}
		



