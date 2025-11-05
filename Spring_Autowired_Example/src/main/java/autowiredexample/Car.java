package autowiredexample;

public class Car {

	 private Engine engine;

	    // Setter method for dependency injection
	    public void setEngine(Engine engine) {
	        this.engine = engine;
	    }

	    // Business logic method
	    public void drive() {
	        engine.start();
	        System.out.println("Car is now running smoothly!");
	    }

	    // Initialization method
	    public void init() {
	        System.out.println("Car bean is initialized.");
	    }

	    // Destroy method
	    public void destroy() {
	        System.out.println("Car bean is destroyed.");
	    }
	
}
