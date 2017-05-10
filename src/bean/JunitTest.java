package bean;
import static net.sourceforge.jwebunit.junit.JWebUnit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import org.junit.Test;

public class JunitTest {
		String url = "http://localhost:8080/job/Selenium/ws/WebContent/index1.jsp";
		/*@Before
		public void setup(){
			setBaseUrl("http://localhost:8081/CustomerOnBoard/");
			//http://10.0.0.116:8080/job/JunitTest1/ws/WebContent/
		}*/
		/*@Test
		public void testOne(){
			beginAt(url); 
	        
	        assertTitleEquals("Login page");
	       setTextField("Uname", "admin");
	        setTextField("Password", "admin");
	      clickLink("register");
	        //submit();
	        assertTitleEquals("Registration Form");
		}*/
		
		@Test
		 public void testTwo(){ 
		   // WebDriver driver = new InternetExplorerDriver();
			File file = new File("C:\\Program Files\\IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver",file.getAbsolutePath());
			WebDriver driver = new InternetExplorerDriver();
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe"); 
		  // driver.get("http://localhost:8080/job/Selenium/ws/WebContent/index1.jsp");
		   	driver.get(url);
		 	Assert.assertTrue(driver.getTitle().contains("Login Page"));
		 }
		
}


