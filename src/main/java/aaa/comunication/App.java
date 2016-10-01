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

	private static Service dataService;

    
    
    public static void main(String[] args) {
    	try{
    		startServer(7300);  
//    		runDemoStuff();
    		runUserApi();
        	
    	}
    	catch (Exception e)
    	{
    		stop();
    	}
    }
    
    private static void runDemoStuff() {
		dataService.createDemoProduct("banana");
		dataService.createDemoProduct("milk");
	}

	public static void startServer(int nPort)
    {
    	port(nPort);
    	dataService = Service.getInstance();
    	get("/health-check",(req,res)->{return "all is ok";});
    }
    
    public static void runUserApi()
    {
		post("/users/login/:name/:pass", (req,res)->
		{
			String name = req.params(":name");
			String pass = req.params(":pass");
			LoginStatus status = dataService.login(name, pass);
			return status.getValue();
		});
		
		post("/users/register/:name/:pass/:mail/:restMail", (req,res)->
		{
			String name = req.params(":name");
			String pass = req.params(":pass");
			String mail = req.params(":mail") +"@" +req.params(":restMail"); 
			LoginStatus status = dataService.register(name, pass, mail);
			return status.getValue();
		});
		
		post("/users/addProduct/:userName/:productName", (req,res)->
		{
			String userName = req.params(":userName");
			String productName = req.params(":productName"); 
			dataService.addProductToUser(productName, userName);
			return 1;
		});
		
		get("/users/getProduct/:userName", (req,res)->
		{
			String uName = req.params(":userName");
			return dataService.getUserProductsList(uName);
					});

		get("/products/getall", (req, res) -> {
			return dataService.getAllProducts();
		});
    }


    
}