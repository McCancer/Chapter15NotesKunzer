import java.util.*;

/**
Matthew Kunzer
9/4/17
E15_2 practice program
Reverses the entries in a linked list
 */
public class E15_2
{
    public static void reverse(LinkedList<String>strings){
        String transit; //creates holding vari
        for(int i = strings.size()- 1; i > 0 ; i-- ){ // goes though the whole linked list
            transit = strings.removeFirst();// removes the last
            strings.add(i ,transit);
        }
        
        /*
         * You can use recursion for this problem
         * if(strings.size() > 1){
         *     String s = strings.removeFirst();
         *     reverse(strings);
         *     strings.addLast(s);
         *     }
         */
    }
}
