 /*
A bank charges a base fee of $10 per month, plus the following check fees for a 
commercial checking account:
		$0.10 each for less than 20 checks
		$0.08 each for 20-39 checks
  		$0.05 each for 40-59 checks
   		$0.04 each for 60 or more checks
Write a program that requests the number of checks written for the month, and 
computes and displays the bank’s service charges for the month.
 */
package ass3_p2;
import java.util.Scanner;
public class Ass3_P2 
{
    public static void main(String[] args) 
    {
        Scanner keyboard=new Scanner(System.in);
        int checks,Base_fee=10;
        double total;
        // Getting number of checks from user
        System.out.print("Enter number of checks:");
        checks=keyboard.nextInt();
        
        //Checking conditions for variable checks
        //$0.10 each for less than 20 checks
        if (checks<20)
        {
            total=Base_fee+0.1*checks;
        }    
        //$0.08 each for 20-39 checks
        else if (checks>=20 && checks<40)
        {
            total=Base_fee+0.08*checks;
        }    
        //$0.05 each for 40-59 checks
        else if (checks>=40 && checks<60)
        {
            total=Base_fee+0.05*checks;
        }
        //$0.04 each for 60 or more checks
        else
        {   
            total=Base_fee+0.04*checks;
        }
        //Formatting output which rounds float number
        System.out.format("Bank service charge is $%.2f%n",total);
    }
    
}
