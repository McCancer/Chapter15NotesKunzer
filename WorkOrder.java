/**
   This class encapsulates a work order with a priority.
*/
public class WorkOrder implements Comparable  
{

   private char priority;
   private String description;

   /**
      Constructs a work order with a given priority and description.
      @param aPriority the priority of this work order
      @param aDescription the description of this work order
   */
   public WorkOrder(char priority, String adescription)
   {
      this.priority = priority;
      description = adescription;
      
    }
    
    /**
     * when it is sent to a SOP statement this is called
     */
   public String toString()
   {
       String stuff ="Build a String";
       return "Priority =" + priority + ",description = " + description; 
   }
   /**
    Compares objects by priority
    @param Object other work order
    @return -1,0,1 comparing priority var
   */
   public int compareTo(Object otherObj){
      WorkOrder other =(WorkOrder)otherObj;
      
      if (this.priority == 100 && other.priority > 49){return 1;}//d
      
      else if (this.priority == '1' && other.priority == 100){return -1;}
      
      else if(this.priority == 119 && other.priority > 50){return 1;}//w
      
      else if ((this.priority == '1' || this .priority == '2') && other.priority == 119){return -1;}
      
      else if(this.priority == 77){return -1;} //m
      
      else if (this.priority < other.priority){return -1;}
      else if(this.priority > other.priority){return 1;}
      else {return 0;}
    }

}//End of Work order
