import java.util.*;

/**
Matthew Kunzer
08/31/17
Stack notes
Notes about how stacks work
 */
public class Stacksnotes
{
    public static void main(String[] args){
        Stack<String> words = new Stack<>();//LIFO order
    
        words.push("Aisle"); //A
        words.push("Bdellium"); //BA
        words.push("Czar"); //CBA
    
        System.out.println(words.pop()); //SOP C : BC
        System.out.println(words.peek()); //Top is :B
    
    
        //FIFO order
        Queue<String> Words = new LinkedList<>(); //What LL?
        //LL implements Queue interface, need Q initialize a Queue variable 
        //Only use Queue methods
        
        Words.add("Djinn");  //D
        Words.add("Euphrates"); //DE
        Words.add("Fohn"); //DEF
        
        System.out.println(Words.remove()); //SOP D : EF
        System.out.println(Words.peek()); // Top is : E
        /**/
    }
}
