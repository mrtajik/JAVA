/*
Write a java program that inputs three double numbers from the keyboard and 
computes and display their sum, product, and average. . The following a sample 
output that shows the screen output. (save the project as Ass1_P1)
Enter first number: 2.5 
Enter second number: 4.5
Enter third number:  2.6
Sum is 9.6
Product is  29.25
Average is 3.2  
*/
 package ass1_p1;

 import java.util.Scanner;

 public class Ass1_P1 
 {
    public static void main(String[] args) 
    {
      Scanner keyboard = new Scanner(System.in);
      double first,second,third,Sum,Product,Avarage;
      // Getting first number from user
      System.out.print("Enter First number: ");
      first = keyboard.nextDouble();
      
      // Getting second number from user
      System.out.print("Enter Second number: ");
      second = keyboard.nextDouble();
      
       // Getting third number from user
      System.out.print("Enter Third number: ");
      third = keyboard.nextDouble();
      
      Sum=first+second+third;
      
      Product=first*second*third;
      
      Avarage=(first+second+third)/3;
      
      // Displaying calculation to the user
      System.out.println("Sum is "+Sum+"\nProduct is " + Product);
      
      //Formatting output which rounds float number
      System.out.format("Avarage is %.1f%n ", Avarage);
        
    }
    
 }
