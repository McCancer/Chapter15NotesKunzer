import java.util.Stack;
import java.util.Scanner;

/**
   Class for simulating a driveway and a street, using stacks
   of cars with license plate numbers as representation.
*/
public class Driveway
{
   /**
      Stack representing the cars in the driveway.
   */
   private Stack<Integer> driveway;
   /**
      Stack representing the cars in the street.
   */
   private Stack<Integer> street;

   /**
      Constructor.
   */
   public Driveway()
   {
      // Complete the constructor
      driveway = new Stack<>();//LIFO
      street = new Stack<>();//LIFO
   }

   /**
      Add the given license plate to the driveway.
      @param licencePlate number of license plate.
   */
   public void add(int licensePlate)
   {
      // Complete this method
      Integer plate = licensePlate;
      
      driveway.push(plate);


   }

   /**
      Remove the given license plate from the driveway.
      @param licencePlate number of license plate.
   */
   public void remove(int licensePlate)
   {
      // Complete this method
      Integer x = 0;
      Integer Plate = licensePlate;
      while(x != Plate){
          x = driveway.pop();
           if (x != Plate){
               street.push(x);
            }
        }
      while(street.size() > 0){
          driveway.push(street.pop());
        }

   }

   /**
      Prints the driveway and street details to the screen.
   */
   public void print()
   {
      System.out.println("In Driveway, starting at first in (one license plate per line):");
      // Print the cars in the driveway here
      while(driveway.size() > 0){
          System.out.print(driveway);
        }

      System.out.println("In Street, starting at first in (one license plate per line):");
      // Print the cars in the street here
      while(street.size() > 0){
          System.out.print(street);
        }

   }
}
