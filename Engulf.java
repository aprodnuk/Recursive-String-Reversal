import chn.util.*;
/**
 * Write a description of class Engulf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Engulf
{
    public static void main(String[] args)
    {
        ConsoleIO key = new ConsoleIO();
        String outInput, wordInput;
        boolean flag = false;
        
        do
        {
            //get user input
            System.out.print("\nEnter the four characters to surround with: ");
            outInput = key.readLine();
            System.out.print("Enter the word to be surrounded: ");
            wordInput = key.readLine();
            
            //display results
            System.out.println(makeOutWord(outInput, wordInput));
            
            //check if user wants to continue
            System.out.print("Continue? [true/false]: ");
            flag = key.readBoolean();
        }
        while(flag);
    }
    
    private static String makeOutWord(String out, String word)
    {
        //first half + word + second half
        return out.substring(0, 2) + word + out.substring(2);
    }
}
