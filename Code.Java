
package clientApplications;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//Comment
//Adding new Commnent...
public class HelloWorld {

	public static void main(String[] args) {
		
		ApplicationContext hw = SpringApplication.run(HelloWorld.class, args);
		System.out.println("Hello Spring Boot....");
	
	}//End of the main method..

} //End of the Class.