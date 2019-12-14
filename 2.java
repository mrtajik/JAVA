 /*
Write a program that computes the tax and tip on a restaurant bill. The program 
should ask the user to enter the charge for the meal. The tax should be 6.75 
percent of the meal charge. The tip should be 15 percent of the total after 
adding the tax. Program should display the meal charge, tax amount, tip amount, 
and the total bill on the screen. The following a sample output:  
(save the project as Ass1_P2)

What is the meal charge?  $45.50
Final bill:
Meal charge: $45.50
Tax amount:  $3.07
Tip amount:  $7.29
Total bill:       $55.86
 */
 package ass1_p2;
 
 import java.util.Scanner;
 
 public class Ass1_P2 
 {
    public static void main(String[] args) 
    {
      Scanner keyboard = new Scanner(System.in);
      double Meal,Tax,Tip,Total;
      
      // Getting price of the meal from user
      System.out.print("What is the meal charge? $");
      Meal = keyboard.nextDouble();
      
      //Calculating Tax
      Tax=Meal*0.0675;
      
      //Calculating Tip
      Tip=(Meal+Tax)*0.15;
      
      //Calculating Total amount
      Total=Meal+Tax+Tip;
      
      // Displaying total bill
      System.out.println("\nFinal bill:");
      System.out.format("Meal charge:$%.2f%n",Meal);
      System.out.format("Tax amount: $%.2f%n",Tax);
      System.out.format("Tip amount: $%.2f%n",Tip);
      System.out.format("Total bill: $%.2f%n",Total);
    }    
    
 }
