 /*
Write a program that reads in a code (C for circumference and A for area) and 
the radius of a circular pool, computes and displays the circumference or the 
area depending on the code entered. Use a switch statement for the selection. 
If the user enters any other character (other than C or A), the program should 
display that it is an invalid choice. (Formulas: Area = ?r2,Circumference = 2?r, 
where  pi= 3.14159, and r is the radius).
 */
package ass3_p1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ass3_P1 
{
    public static void main(String[] args) 
    {
    Scanner keyboard=new Scanner(System.in);
    double r,circ,area;
    char opr;
    DecimalFormat formatter = new DecimalFormat("0.##");
    //Getting letter A or C from User
    do 
        {
        System.out.print("Press C for Circumferencce and A for Area:");
        opr=keyboard.next().charAt(0);
        if (opr!='A' && opr!='C')
            System.out.println("Wrong choice, try again");
        } 
    while ((opr!='A') && (opr!='C')); 
         
    //Getting the radius of the Pool
    System.out.print("Enter the radius of the pool:");
    r=keyboard.nextDouble();
    switch (opr)
    {
        case 'C':
            circ=2*Math.PI*r;
            System.out.println("Circumference of the pool: "+
                    formatter.format(circ));
            break;
        case 'A':
            area=Math.PI*(r*r);
            System.out.println("Area of the pool: "+
                    formatter.format(area));
            break;
    }
           
    }
    
}
