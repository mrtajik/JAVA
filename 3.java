 /*
Write a Java program that asks the user to enter the name of his or her favorite 
city. Use a string variable to store the input. The program should display the 
following: (save the project as Ass1_P3)
a) The number of characters in the city name.
b) The name of the city in all uppercase letters.
c) The name of the city in all lowercase letters.
d) The third character in the name of the city
 */
 package ass1_p3;

 import java.util.Scanner;

 public class Ass1_P3 
 {

    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        String name;
        
        // Getting the name of the city from user
        System.out.print("What is the Your favorite city? ");
        name = keyboard.next();
        
        //The number of characters in the city name
        System.out.println("\nYour city name contains "+name.length()+
                " characters");
        
        //The name of the city in all UPPERCASE letters
        System.out.println(name.toUpperCase());
        
        //The name of the city in all lowercase letters
        System.out.println(name.toLowerCase());
        
        //The third character in the name of the city
        System.out.println(name.charAt(2));

    }
    
 }
