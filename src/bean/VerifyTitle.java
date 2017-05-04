package bean;
import org.openqa.selenium.WebDriver;

import org.junit.Test;

public class VerifyTitle{
  @Test
  public void test(){
    WebDriver driver = new FirefoxDriver();
    driver.get("http://10.0.0.116:8080/job/JunitTest1/ws/WebContent/index1.jsp");
    Assert.assertTrue(driver.getTitle().contains("Login Page"));
    }
 }
