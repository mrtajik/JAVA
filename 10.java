 /*
Write a program that calculates the average number of days a company employee is 
absent. The program should have the following three methods:

	A method that asks the user for number of employees in the company. 
        This value should be returned as an int type value. 
        The method accepts no arguments.

        A method that accepts one argument: the number of employees in 
        the company. The method should ask the user to enter the number of 
        days each employee missed during the past year. The total of these 
        days should be returned as int type. (you need to use a loop to find 
        this total)

        A method that accepts two arguments: The number of employees in the 
        company and the total number of days absent for all employees during 
        the past year. The method should return, as double type, the average 
        number of days absent. (This method does not perform screen output and 
        does not ask the user for input).
        Use appropriate description phrases with the output. 

 */
package assignment4_part3;
import java.util.Scanner;
public class Assignment4_Part3 
{
    public static int empNumber() 
    {
        int empNumber;
        Scanner Key=new Scanner(System.in);
        
        //Getting number number of employees in the company
        System.out.print("Enter number of employees in the company: ");
        empNumber=Key.nextInt();
        
        //Passing argument to missedDays method
        return(empNumber);
    }
    
    public static int missedDays(int empNumber)
      {
          int total;
          int days=0;
          Scanner Key=new Scanner(System.in);
          for (int i = 1; i<=empNumber; i++)
          {
             System.out.print("How many days this "+i+" employee missed? ");
             total=Key.nextInt();
             days=total+days;
             
          }
          return (days);
      }
    
    public static double avarage(int empNumber, int missedDays)
    {
        return (empNumber/missedDays);
    }
    
}

     


