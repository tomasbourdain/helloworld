package pt.iade.helloworld.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
@RequestMapping(path="/api/java/tester/")
public class JavaTesterControllers {
    private Logger logger = LoggerFactory.getLogger(JavaTesterControllers.class);
    @GetMapping(path = "/author", produces= MediaType.APPLICATION_JSON_VALUE)
    public void getAuthor() {
              Scanner myObj = new Scanner(System.in);
          
              System.out.println("Enter name, age and salary:");
          
              // String input
              String name = myObj.nextLine();
          
              // Numerical input
              int age = myObj.nextInt();
              double salary = myObj.nextDouble();
          
              // Output input by user
              System.out.println("Name: " + name);
              System.out.println("Age: " + age);
              System.out.println("Salary: " + salary);
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
