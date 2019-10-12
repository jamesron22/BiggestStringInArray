/**
 *
 * @author Ronald Coleman
 * October 2019
 */
import java.util.Scanner;
public class BiggestString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lArray[] = new String[10];
        Scanner  input = new Scanner(System.in);
        
         for (int counter = 0;  counter <= 9;  counter ++)
         {
             System.out.println("Enter string number " +  (counter + 1) + ": ");
             lArray[counter]=input.next(); 
         }
       
         String shortest = minLength(lArray);
         System.out.println("The shortest string is " + shortest);
         /*for (int counter = 0; counter <= 9; counter ++)
         {
             System.out.print(array[counter] + " ");
         }*/
    }
    public static String minLength(String[] array)
    {
         int length = 0;
         String longest = null;
         for (String s : array) {
          if (s.length() > length) {
              length = s.length();
              longest = s;
          }
      }
        return longest;
    }
}
            
        

