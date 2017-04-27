import static net.sourceforge.jwebunit.junit.JWebUnit.*;

import org.junit.Before;
import org.junit.Test;

public class JunitTest {

		@Before
		public void setup(){
			setBaseUrl("https://localhost:8081/CustomerOnBoard/");
			
		}
		@Test
		public void test(){
			beginAt("index1.jsp"); 
	        //clickLink("login");
	        assertTitleEquals("Login page");
	        setTextField("Uname", "admin");
	        setTextField("Password", "admin");
	        submit();
	        assertTitleEquals("Registration Form");
		}
		
}
