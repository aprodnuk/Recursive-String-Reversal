import chn.util.*;
/**
 * Takes in a string from the user and displays the recursively reversed version
 *
 * @author Annabel Prodnuk
 * @version 11/7/18
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
            //get user input
            System.out.print("\nEnter the string you would like to reverse: ");
            input = key.readLine();
            
            //display results
            System.out.println(reverse(input) + "\n\n");
            
            //check if user wants to continue
            System.out.print("Would you like to continue? [true/false]: ");
            flag = key.readBoolean();
        }
        while(flag);
        
    }
    
    private static String reverse(String str)
    {
        if(str.length() == 1)
        {
            //nothing left to process
            return str;
        }
        else
        {
            //take the last letter and process the rest of the string
            return str.substring(str.length() - 1)
                + reverse(str.substring(0, str.length() - 1));
        }
    }
}
