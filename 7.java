 /*
Write a program that reads daily sales for 30 days until -1 is entered and find 
and display the following:
a) average sales for 30 days. 
b) number of days that daily sales over $5000.00

 */
package ass3_p4;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ass3_P4 
{
    public static void main(String[] args) 
    {
        Scanner keyboard=new Scanner(System.in);
        int days=0,ave=0;
        double sales=0,sum=0;
        //formatting the output
        DecimalFormat formatter = new DecimalFormat("0.##");
 
        while(days<30)
        {   // Getting Daily Sales from user
            System.out.print("Enter Today's Sales:");
            sales=keyboard.nextInt();
            if (sales>0)
            {
                if (sales>5000)
                {   sum=sum+sales;
                    ave++;
                }
                else
                    sum=sum+sales;
                
            }
            else if (sales==-1)
                break;
            days++;
        }
        //Printing Average Sales in 30 days
        System.out.println("Average sales for 30 days "+
                formatter.format(sum/30));
        
        //Printing Number of days that daily sales over 5000
        System.out.println("Number of days that daily sales over: "+
                formatter.format(ave));
        }
}
