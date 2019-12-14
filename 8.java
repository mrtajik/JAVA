/*
Write a method named showChar. The method should accept two arguments: 
a reference to a String object and an integer. The integer argument is a 
character position within the String, with the first character being at 
position 0. When the method executes, it should display the character at that 
character position in that string. Here is an example of a call to the method:
	showChar(“New York”, 2);
In this call, the method will display character w because it is in position 2. 
Demonstrate the method in a complete program. Read the string and the integer 
from the user.Your program should work for any string and any character position

*/
package assignment4;
import java.util.Scanner;
public class Method_showChar
{
    public static void main(String[] args)
    {
        String Text; //declairing string input word or text
        int position;//declairing wanted position of the letter in word or text
        
        Scanner stdin = new Scanner(System.in);
        
        //Getting text or word from user
        System.out.print("Enter your word(text):");
        Text = stdin.nextLine();
        
        //Getting position of the letter from user
        System.out.print("Enter your possition of the letter:");
        position = stdin.nextInt();
        
        //Passing values of Text and poistion to showchar method
        showChar(Text,position);
    }
    
    //Showchar method
    public static void showChar(String str, int position)
    {
        System.out.println("Your letter at position "+" is: "+
                str.charAt(position));
    }
}
