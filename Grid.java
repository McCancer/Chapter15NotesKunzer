import java.util.*;
public class Grid
{
   private static final int SIZE = 10; // sets a size to 10 
   int[][] pixels = new int[SIZE][SIZE]; // creates a 2D array
   static int number = 1; // number that starts at one.
   public Queue<cords> pairs = new LinkedList<>(); // creates a queue
   cords transfer = new cords(0,0); //sets a transfer/cords object
   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row, int column)
   {
      if(pixels[row][column] == 0){ //Checks the point itself
          this.pixels[row][column] = number;//sets point to number
          number++;//number goes up
      }
      if(column + 1 < 10 && pixels[row][column+1] == 0){ //checks right point 
          this.pixels[row][column+1] = number;//sets point to number
          number++;//number goes up
          pairs.add(new cords(row,column+1));//adds point to queue
        }
      if(row + 1 < 10 && pixels[row+1][column] == 0){//checks down point 
          this.pixels[row+1][column] = number;//sets point to number
          number++;//number goes up
          pairs.add(new cords(row+1,column));//adds point to queue
        }
      if(column - 1 > -1 && pixels[row][column-1] == 0){//Checks left point
          this.pixels[row][column-1] = number;//sets point to number
          number++;//number goes up
          pairs.add(new cords(row,column-1));//adds point to queue
        }
      if(row -1 > -1 && pixels[row-1][column] == 0) { //checks top point
          this.pixels[row-1][column] = number;//sets point to number
          number++;//number goes up
          pairs.add(new cords(row-1,column));//adds point to queue
        }
      
      while(pairs.size() > 0){ // will go though as something is in queue
          transfer = pairs.remove();// takes next point FIFO order
          floodfill(transfer.x,transfer.y); // do floodfill with new point. 
        }
   }

   @Override
   public String toString()
   {
      String r = "";
      for (int i = 0; i < SIZE; i++)
      {
         for (int j = 0; j < SIZE; j++)
            r = r + String.format("%4d", pixels[i][j]);
         r = r + "\n";
      }
      return r;
   }
}
