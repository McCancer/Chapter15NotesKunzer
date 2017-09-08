import java.util.PriorityQueue;

/**
   This program demonstrates a priority queue of work orders. The
   most important work orders are removed first.
*/
public class PriorityQueueDemo
{
   public static void main(String[] args)
   {
      //create PriorityQueue of WorkOrd er
      PriorityQueue <WorkOrder> work = new PriorityQueue<>();
      //add several WorkOrder
      work.add(new WorkOrder(7,"Tile Floor Fib"));
      work.add(new WorkOrder(1,"Thomas a Fan"));
      work.add(new WorkOrder(2,"Close the Pool"));
      work.add(new WorkOrder(1,"Call for Drain augering"));
      work.add(new WorkOrder(4,"Buy a new Leather notebook"));
      //display WrokOrder and you "finish"/remove from the list
      while (work.size() > 0)
      {

      }
   }
}
