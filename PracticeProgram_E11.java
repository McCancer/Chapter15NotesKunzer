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
     //Creates Priority Queue
     PriorityQueue<WorkOrder>TODOLIST = new PriorityQueue<>();
     //adds five things to the list
     TODOLIST.add(new WorkOrder('6',"Do Homework"));
     TODOLIST.add(new WorkOrder('3',"Eat Dinner"));
     TODOLIST.add(new WorkOrder('w',"Call Grandmother"));
     TODOLIST.add(new WorkOrder('1',"Update Computer System"));
     TODOLIST.add(new WorkOrder('4',"Help Dad"));
     TODOLIST.add(new WorkOrder('9',"Play Magic the Gathering"));
     
     
     //Creatse two Scanners
     Scanner input = new Scanner(System.in);
     //Init some vari
     String Choice = "sadness";
     String desc = ""; 
     char Pri = '0';
     //Creates a loop
     while(Choice.equals("quit")!= true){
         System.out.println("Enter input");
         Choice = input.next(); // Enter in your input
         if(Choice.toLowerCase().equals("add")){ // sees if you want to add
             System.out.println("Enter in the priority of the task");
             Pri = input.next().toLowerCase().charAt(0); // takes the priority 
             System.out.println("enter the task");
             desc = input.next(); // takes in what task it is
             TODOLIST.add(new WorkOrder(Pri,desc)); // adds it the queue
            }// end of if one
         else if(Choice.toLowerCase().equals("next")){ // sees if you want to move on to the next task
             TODOLIST.remove();// removes the first task
             System.out.println("New task is" + TODOLIST.peek()); // Shows you the next task
            }//end of if 2
         else if(Choice.toLowerCase().equals("look")){ //sees if you want to see the current task
              System.out.println("current task is" + TODOLIST.peek()); // Shows you the current task
            } // end of if 3
         else if(Choice.toLowerCase().equals("quit")){ // sees if you want to quit
             System.out.println("Exiting the Program");// exiting message
            }//end of if 4
         else{}//catch
        }// end of while loop
    }//end of main 
}//end of the program
