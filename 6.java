 /*
Create the equivalent of a four – function calculator.The program should request 
the user to enter a number, an operator, and another number (Use floating-point 
numbers). It should then carry out the specific arithmetic operation: addition, 
subtraction, multiplication or division of two numbers. As you know, division by 
zero is not defined. So program must display an error message if division by 
zero occurs. You may use a switch statement to select the operation. Finally 
display the result. When it finishes the calculation, the program should ask if 
the user wants to do another calculation. The answer can be ‘y’ or ‘n’ (may use 
uppercase y or n also).The following output shows the results of two operations.

		Enter first number: 15
              Enter an operator: /
              Enter second number: 2
		15/2  = 7.50
		Do another (Enter y or Y for yes or n or N for no)? y
	           Enter first number: 12
              Enter an operator: +
              Enter second number: 125
		12 + 125  = 137
		Do another (Enter y or Y for yes or n or N for no)? n	

 */
package ass3_p3;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ass3_P3 
{
    public static void main(String[] args) 
    {
        Scanner keyboard=new Scanner(System.in);
        double x,y,ans;
        char operator,rep;
        DecimalFormat formatter = new DecimalFormat("0.#");
        do {
        System.out.print("Enter First number:");//Getting First number
        x=keyboard.nextInt();
        System.out.print("Enter an operator:");// Getting Operator
        operator=keyboard.next().charAt(0);
        System.out.print("Enter Second number:");//Getting Second number 
        y=keyboard.nextInt();
        compare://Checking condition for Operator 
        {
        if (operator=='+')
            ans=x+y;
        else if (operator=='-')
            ans=x-y;
        else if (operator=='/')
            if (y==0) {
                System.out.println("Division by Zero not allowed");
                break compare; }
            else 
                ans=x/y;
        else
            ans=x*y;
        System.out.println(formatter.format(x)+""+operator+""+
                formatter.format(y)+""+"="+formatter.format(ans));}               
        
        System.out.print("Do another (Enter y or Y for yes or n or N for no)?");
        rep=keyboard.next().charAt(0); }
        //if Y or y pressed it will continue calculation 
        while(rep=='Y' || rep=='y');   } }
