 /*
Write a program that computes and displays the charges for a patient’s hospital 
stay. First, the program should ask if the patient was admitted as an in-patient 
out-patient. 
If the patient was an in-patient, the following information should be requested:
 	number of days spent in the hospital
 	the daily rate
 	hospital medication charges
 	charges for hospital services (lab test, etc.)

If the was an out-patient, the following information should be requested:
 	charges for hospital services (lab test, etc.)
 	hospital medication charges

The program should use two methods to calculate the total charges. One of the 
methods should accept arguments for the in-patient information, while other 
method accepts argument for out-patient information. Both methods should return 
the total charges. 
 */
package assignment4_part2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Assignment4_Part2 
{
    public static void main(String[] args) 
    {
        DecimalFormat formatter=new DecimalFormat("0.##");
        String patient;
        Scanner Key=new Scanner(System.in);
        System.out.print("For in-patient type in,for out-patient type out: ");
        patient=Key.nextLine();
       
        if (patient.length()==2)
            { System.out.println("Total charges for in-patient: "+
                    formatter.format(inTotal()));}
        else
              System.out.println("Total charges for out-patient: "+
                     formatter.format(outTotal()));
    }
       
    private static double inTotal()
            {
                int NumberDays;
                double Rate,medication,hospital_services;
                
                Scanner text=new Scanner(System.in);
                
                System.out.print("Number of Days spent in the hospital: ");
                NumberDays=text.nextInt();
                
                System.out.print("The Daily Rate: ");
                Rate=text.nextDouble();
                
                System.out.print("Hospital medical charges: ");
                medication=text.nextDouble();
                
                System.out.print("Charges for hospital Services: ");
                hospital_services=text.nextDouble();
                
                return (NumberDays*Rate+medication+hospital_services);
                
            }
    
    private static double outTotal()
            {
                double  medication,hospital_services;
                Scanner text=new Scanner(System.in);
                
                System.out.print("Hospital medical charges: ");
                medication=text.nextDouble();
                
                System.out.print("Charges for hospital Services: ");
                hospital_services=text.nextDouble();
                
                return  medication+hospital_services;
                
            }
}
    
