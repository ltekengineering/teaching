/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Class14;

/**
 *
 * @author lkhan
 */
import java.util.Scanner;

public class Question18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan  = new Scanner(System.in);
    
    String name = "";
    String age= "";
    String city = "";
    String college = "";
    String profession = "";
    String pet = "";
    String petName = "";
    
    
    String questionText = "There once was a person named %s who lived in %s. \n"
            + "At the age of %s,%s went to college at %s. %s graduated and went to \n"
            + "work as a %s. Then, %s adopted a(n) %s named %s. They both lived \n"
            + "happily ever after!";
    
        
    System.out.println("What is your name?");
        name = scan.nextLine().toString();
    System.out.println("What is your age?");
        age = scan.nextLine().toString();
    System.out.println("Which city are you from?");
        city = scan.nextLine().toString();    
    System.out.println("Which college did you go to?");
        college = scan.nextLine().toString();
    System.out.println("What is your profession?");
        profession = scan.nextLine().toString();
    System.out.println("Do you have a pet?");
        pet = scan.nextLine().toString();
    System.out.println("What is your pet's name?");
        petName = scan.nextLine().toString();
        
    System.out.printf("There once was a person named %s who lived in %s . At the age of %s , %s went to college at %s . %s graduated and went to work as a %s . Then, %s adopted a(n) %s named %s. They both lived happily ever after!",name,city,age,name,college,name,profession,name,pet,petName);
            System.out.printf(questionText,name,city,age,name,college,name,profession,name,pet,petName);
            
    }
   
    
}
