
package clientApplications;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//comment added by Jagat
// for UAT & DEV
//Adding new Commnent...
// Function to print hello world
public class HelloWorld {

	public static void main(String[] args) {
		
		{
			
		}
		
		ApplicationContext hw = SpringApplication.run(HelloWorld.class, args);
		System.out.println("Hello Spring Boot....");
	
	}//End of the main method..

} //End of the Class.
