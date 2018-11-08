
/**
 * Write a description of class Zippy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zippy
{
    public static void main(String[] args)
    {
        System.out.println(zipZap("zipXzap")); //--> "zpXzp"
        System.out.println(zipZap("zopzop")); //--> "zpzp"
        System.out.println(zipZap("zzopzop")); //--> "zzzpzp"
    }
    
    private static String zipZap(String str)
    {
        int i = 0;
        //if a z is found, check if the character 2 indexes away is a p
        while(str.indexOf("z", i) != -1)
        {
            if(str.substring(i + , i + 1).compareTo())
            {
                
            }
            
            i = str.indexOf("z", i);
        }
        
        //if so, remove the character between
    }
}
