package bean;
import static net.sourceforge.jwebunit.junit.JWebUnit.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class JunitTest {

		/*@Before
		public void setup(){
			setBaseUrl("http://localhost:8081/CustomerOnBoard/");
			//http://10.0.0.116:8080/job/JunitTest1/ws/WebContent/
		}*/
		/*@Test
		public void testOne(){
			beginAt("http://10.0.0.108:8080/job/JunitTest1/ws/WebContent/index1.jsp"); 
	        
	        assertTitleEquals("Login page");
	       // setTextField("Uname", "admin");
	       // setTextField("Password", "admin");
	      clickLink("register");
	        //submit();
	        assertTitleEquals("Registration Form");
		}*/
		
		@Test
		 public void testTwo(){
		   WebDriver driver = new FirefoxDriver();
		   driver.get("http://10.0.0.108:8080/job/JunitTest1/ws/WebContent/index1.jsp");
		   //driver.get("http://10.0.0.108:8080/job/JunitTest1/ws/WebContent/index1.jsp");
		  Assert.assertTrue(driver.getTitle().contains("Login Page"));
		 }
		
}


