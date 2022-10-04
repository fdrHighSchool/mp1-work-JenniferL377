
/**
 * Write a description of class Class092822 here.
 *
 * @author (jennifer liu)
 * @version (092822)
 */

import java.util.Scanner;
// imports scanner

public class Date
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the day of the week:");
        String weekday = s.nextLine();
        
        System.out.print("Enter the day:");
        String day = s.nextLine();
        
        System.out.print("Enter the month:");
        String month = s.nextLine();
        
        System.out.print("Enter the year:");
        String year = s.nextLine();
        
        System.out.println("American Format:"+weekday+", "+month+" "+day+", "+year);
        System.out.println("European Format:"+weekday+" "+day+" "+month+" "+year);
    } //end main method 
} //end class