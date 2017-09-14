
import java.util.*;
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
   public static void main(String args[]){
       LinkedList<String> names = new LinkedList();
       E15_2 backwards = new E15_2();
       names.add("John");
       names.add("Harry");
       names.add("Susan");
       names.add("Kunzer");
       System.out.println(names);
       
       backwards.reverse(names);
       System.out.println(names);
       
    }

}
