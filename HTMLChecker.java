import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
/**
   Write a program that checks whether a sequence of HTML tags
   is properly nested. For each opening tag, such as <p>, there
   must be a closing tag </p>. A tag such as <p> may have other
   tags inside, for example <p> <ul> <li> </li> </ul> <a> </a> </p>

   The inner tags must be closed before the outer ones.
   Your program should process a file containing tags.
   For simplicity, assume that the tags are separated by
   spaces, and that there is no text inside the tags.
   
   Ethan and Matthew 
   9/15/17
*/
public class HTMLChecker
{
   public static void main(String[] args)
   {
       //Creates the variables
      String filename = "TagSample3.html";
      Stack<String> tags = new Stack<>(); // makes a stack
      String transit;
      int fail = 0;
      try (Scanner in = new Scanner(new File(filename)))
      {
         
         //while loop that goes around as long as the file has somthing else
         while(in.hasNext()){ 
             transit = in.next();   //puts the first tag in the transit vari
             if(transit.charAt(1) != '/'){  // sees if the tag is not a end tag and if it isn't it is added
                 tags.push(transit);        //adds the tag to the stack
                }//end of if statement
             else if(transit.charAt(1) == '/'){      // checks to the if it is an end tag
                 transit = transit.replace("/","");  //formats the end tag for comparison 
                 if(tags.peek().equals(transit)){       // checks that the most recent tag on the stack is equal to the end tag
                     tags.pop();                        // takes of the top most tag
                    }// end of if statement
                 else{                               // tells you an error has happend and which tag caused it 
                    System.out.println("There is an issue with the tag " + transit);    
                    fail = 1;         //triggers the fail vari
                  }// end of else
                }// end of if statement 2
             else
                System.out.println("hey man something is wrong with this tag " + transit) ;     // if it is not a tag this triggers
            }// end of while loop 
         if(tags.size() == 0 && fail == 0){                //sees if the stack is empty and that the fail vari was not changed
             System.out.println("the tags are good");
            }
         else                                              //tell you somthing is wrong 
            System.out.println("there is something wrong with the tags");
      }
      catch (FileNotFoundException e)
      {
         System.out.println("Cannot open: " + filename);
      }

   }
}
