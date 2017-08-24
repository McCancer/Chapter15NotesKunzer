import java.util.LinkedList;
import java.util.ListIterator;


/**
 * Write a description of class LLreview15_10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LLreview15_10
{
     public static void main(String[] args)
   {
       LinkedList<String> staff = new LinkedList<>();
       ListIterator<String> iterator = staff.listIterator(); 
       iterator.add("Thomas");
       iterator.add("Ed");
       iterator.add("Charlie");
       iterator.add("Andrew");
       iterator.add("Sue");
       iterator.add("Si");
       
       
      // | in the comments indicates the iterator position

      
      for(String name: staff){
          if(name.length() <= 3){
              staff.remove(name);
            }
        }
      
      for(String name : staff){
          System.out.println(name);
        }
   }
}
