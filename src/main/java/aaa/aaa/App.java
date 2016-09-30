package aaa.aaa;

/**
 * Hello world!
 *
 */
import static spark.Spark.*;
import static aaa.aaa.JsonUtil.*;

import java.util.concurrent.atomic.AtomicLong;

public class App {

    private static final String template = "Hello, %s!";
    private final static AtomicLong counter = new AtomicLong();
    private static GreetingService greetingService = new GreetingService();
    
    public static void main(String[] args) {
    	port(5000);
    	
    	get("/greetings", (req, res) -> greetingService.getAllUsers(), json());
        
        get("/string", (req, res) -> {
        	String string = "String!";
        	return string;
        });
        
        get("/greeting/:name", (req, res) -> {
        	String name = req.params(":name");
        	Greeting greeting = new Greeting(counter.incrementAndGet(),
                    String.format(template, name));
        	return greeting;
        }, json());
        // comment for push avichay
    }
}