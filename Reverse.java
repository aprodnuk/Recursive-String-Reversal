import chn.util.*;
/**
 * Write a description of class Reverse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Reverse
{
    public static void main(String[] args)
    {
        ConsoleIO key = new ConsoleIO();
        String input;
        boolean flag = false;
        
        System.out.println("Welcome to the recursive string revsersinator!\n");
        do
        {
            System.out.print("\nEnter the string you would like to reverse: ");
            input = key.readLine();
            
            System.out.println(reverse(input) + "\n\n");
            
            System.out.print("Would you like to continue? [true/false]: ");
            flag = key.readBoolean();
        }
        while(flag);
        
    }
    
    private static String reverse(String str)
    {
        if(str.length() == 1)
        {
            return str;
        }
        else
        {
            return str.substring(str.length() - 1)
                + reverse(str.substring(0, str.length() - 1));
        }
    }
}
