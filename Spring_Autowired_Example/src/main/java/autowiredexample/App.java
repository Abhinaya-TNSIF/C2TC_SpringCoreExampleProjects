package autowiredexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        // Step 1: Load Spring container using XML
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        // Step 2: Retrieve bean
        Car car = context.getBean("car", Car.class);

        // Step 3: Use the bean
        car.drive();

        // Step 4: Close context to trigger destroy method
        context.close();
    }
  }

