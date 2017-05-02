import static net.sourceforge.jwebunit.junit.JWebUnit.*;

import org.junit.Before;
import org.junit.Test;

public class JunitTest {

		//@Before
		//public void setup(){
		//	setBaseUrl("http://10.0.0.116:8080/job/JunitTest1/ws/WebContent/index1.jsp");
			
		//}
		@Test
		public void test(){
			beginAt("http://10.0.0.116:8080/job/JunitTest1/ws/WebContent/index1.jsp"); 
	     
	        assertTitleEquals("Login page");
	       // setTextField("Uname", "admin");
	        ///setTextField("Password", "admin");
	        //submit();
			clickLink("Register Now");
	        assertTitleEquals("Registration Form");
		}
		
}
