package bean;
import static net.sourceforge.jwebunit.junit.JWebUnit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
//import org.testng.annotations.Test;
import org.testng.Assert;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import org.junit.Test;

public class JunitTest {
    private WebDriver driver = null;
    @Test
         public void testTwo(){

FirefoxBinary binary = new FirefoxBinary(new File(“C:/Program Files/Mozilla Firefox/firefox.exe”)); // Change actual firefox path
    binary.setEnvironmentProperty(“DISPLAY”,System.getProperty(“lmportal.xvfb.id”,“:99"));
    driver = new FirefoxDriver(binary,null);
          driver.get(“http://localhost:8081/CustomerOnBoard/index1.jsp“);
          Assert.assertTrue(driver.getTitle().contains(“Login Page”));
            }
		
		     }


