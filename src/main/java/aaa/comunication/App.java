package aaa.comunication;

import static aaa.comunication.JsonUtil.*;
/**
 * Hello world!
 *
 */
import static spark.Spark.*;

import java.util.concurrent.atomic.AtomicLong;

import service.Service;

public class App {
    // members

	private Service service;
    
    
    public static void main(String[] args) {
    	try{
    		startServer(7800);
        	
        	get("/lala", (req, res) -> {return "moshe";}, json());
        	

            
            get("/string", (req, res) -> {
            	String string = "String!";
            	return string;
            });
            
//            get("/greeting/:name", (req, res) -> {
//            	String name = req.params(":name");
//            	Greeting greeting = new Greeting(counter.incrementAndGet(),
//                        String.format(template, name));
//            	return greeting;
//            }, json());
    	}
    	catch (Exception e)
    	{
    		stop();
    	}
        // comment for push avichay local
    }
    
    public static void startServer(int nPort)
    {
    	port(nPort);
    }
    
    //comment
    // other comment
}