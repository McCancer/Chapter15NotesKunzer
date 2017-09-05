import java.util.Scanner;
import java.util.Stack;
/**
   Class for splitting an integer into its individual digits.
*/
public class IntegerSplitter
{
   /**
      Splits the given integer into its individual digits
      and prints them to the screen.
      @param number Integer to be split.
   */
   public static void split(int number)
   {
      // Complete this method. Use a Stack
      Stack<Integer> sendhelp = new Stack<>();//LIFO
      Integer fullnumber = number;  
      while(fullnumber != 0){ 
          sendhelp.push(fullnumber %10);
          fullnumber /= 10; 
          if(fullnumber / 10 < 0)
          {
              fullnumber = 0;
            }
        }
      
      while(sendhelp.size() > 0){
          System.out.print(sendhelp.pop() + " " );
        }
   }
}
