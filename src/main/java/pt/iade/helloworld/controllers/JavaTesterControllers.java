package pt.iade.helloworld.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import java.util.Scanner;

@RestController
@RequestMapping(path="/api/java/tester/")
public class JavaTesterControllers {
    private Logger logger = LoggerFactory.getLogger(GreeterController.class);
    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
    public String getGreeting() {
        logger.info("Saying Hello to the world");
        return "Hello World";
    }
    
    @GetMapping(path = "{name}",
    produces= MediaType.APPLICATION_JSON_VALUE)
    public String getGreeting(@PathVariable("name") String name) {
        logger.info("Saying Hello to "+name);
        return "Hello "+name;
    }

}

    
/*public class Myclass{
    String first_name;
    System.out.print("Enter your name: ");
    first_name=user_input.next();
    int id;
    System.out.print("Enter your number: ");
    id=user_input.next();
    double height;
    System.out.print("Enter your height: ");
    height=user_input.next();
    char answer;
    System.out.print("Are you a fan of footbal Y or N: ");
    answer=user_input.next();
        if answer=="N"  
        System.out.println("Done by "+ name +" with number"+ id )
        System.out.println("I am "+ height +" tall and not a fan of football.");
        } else {
        char color;
        System.out.print("Enter the first letter of the color of your favorite football club:")
        color=user_input.next()
        System.out.println("Done by "+ name +" with number"+ id )
        System.out.println("I am "+height +" tall and I am a fan of footbal.");
        if color=="R"
            System.out.print("My favorite club is Benfica")
        } else if color=="B" {
            System.out.print("My favorite club is Porto")
        } else color"G" {
            System.out.print("My favorite club is Sporting")
        }  
    }
  */  
