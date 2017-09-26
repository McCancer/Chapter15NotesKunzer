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
      
      if (this.priority == 'd' || other.priority == 'd' ){ // sees if it is or other is d
          if(this.priority =='d' && other.priority == '1'   ){ //if this point is d and other is 1 returns 1
              return 1;
            }
          else if(other.priority =='d' && this.priority == '1'){//if other point is d and this is 1 returns -1
              return -1;
            }
          else if(this.priority != '1' && other.priority =='d'){ //if this is not 1 and other is d return 1
              return 1;
            }
          else //if this is d and other is not 1 returns -1
             return -1; 
        } 
      else if(this.priority == 'w' || other.priority == 'w'){ //sees if it or other is w
          if((this.priority == 'w') && other.priority < '3' || other.priority == 'd'){ // if point is w and other is less that three or d return 1
              return 1;}
          else if ((other.priority =='w') && this.priority < '3' || this.priority == 'd'){// if other point is w and other is less that three or d return -1
              return -1;
            }
          else if ((other.priority =='w') && this.priority > '3' ){ // if other point is w and this point is greater than 3 return 1
              return 1;
            }
          else // if this point is w and other point is greater than 3 return 1
             return -1;
        }
      else if(this.priority == 'm' || other.priority == 'm'){//sees if it or other is m
        if(this.priority =='m'){ // if the point is m then return 1
            return 1;
        }
        else if(other.priority =='m'){ //if the other point is m then return 1
            return -1;
        }
        else return 0; // catch
        } //if it is m it is smaller than everything
      //standard compare to method
      else if (this.priority < other.priority){return -1;}
      else if(this.priority > other.priority){return 1;}
      else {return 0;}
    }
}//End of Work order
