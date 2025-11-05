package one.myproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	// Load Spring XML Configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml"); 
        
        // Get the Welcome bean from Spring Container
        Welcome obj = (Welcome) context.getBean("welcome");
        
        // Display the injected message
        System.out.println(obj.getMessage());  // Output: Hello, Welcome to Spring!
    }
    
}
