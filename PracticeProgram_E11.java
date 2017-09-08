import java.util.*;
/**
Matthew Kunzer
9/7/17
Practice Program e_11
it is a to do list
 */
public class PracticeProgram_E11
{
    public static void main( String args[]){
     PriorityQueue<WorkOrder>TODOLIST = new PriorityQueue<>();
     Scanner input = new Scanner(System.in);
     Scanner tryfix = new Scanner(System.in);
     String Choice = "sadness";
     String desc; 
     char Pri = 0;
     while(Choice.equals("exit")!= true){
         System.out.println("Enter input");
         Choice = input.next();
         if(Choice.toLowerCase().equals("add")){
             System.out.println("Enter in the priority of the task");
             Pri = tryfix.next().charAt(0); 
             System.out.println("enter the task");
             desc = tryfix.next();
             TODOLIST.add(new WorkOrder(Pri,desc));
            }
         else if(Choice.toLowerCase().equals("next")){
             TODOLIST.remove();
             System.out.println("New task is" + TODOLIST.peek());
            }
         else if(Choice.toLowerCase().equals("look")){
              System.out.println("current task is" + TODOLIST.peek());
            }
         else if(Choice.toLowerCase().equals("quit")){
             System.out.println("Exiting the Program");
            }
         else{}
        }
    }
}
