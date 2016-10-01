package aaa.comunication;

import static aaa.comunication.JsonUtil.*;
/**
 * Hello world!
 *
 */
import static spark.Spark.*;

import java.util.concurrent.atomic.AtomicLong;

import domain.LoginStatus;
import service.Service;

public class App {
    // members

	private static Service service;
    
    
    public static void main(String[] args) {
    	try{
    		startServer(7900);
    		
    		get("/login/:name/:pass", (req,res)->
    		{
    			String name = req.params(":name");
    			String pass = req.params(":pass");
    			LoginStatus status = service.login(name, pass);
    			return "the status is: " + status;
    		});
    		
    		get("/register/:name/:pass/:mail", (req,res)->
    		{
    			String name = req.params(":name");
    			String pass = req.params(":pass");
    			String mail = req.params(":mail"); 
    			LoginStatus status = service.register(name, pass, mail);
    			return "the status is: " + status;
    		});
        	

        
//            
//            get("/string", (req, res) -> {
//            	String string = "String!";
//            	return string;
//            });
//            
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
    	service = Service.getInstance();
    }
    
    //comment
    // other comment
}