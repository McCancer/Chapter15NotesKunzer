import java.util.*;
public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE];
   static int number = 1;
   public Queue<cords> pairs = new LinkedList<>();
   cords transfer = new cords(0,0);
   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row, int column)
   {
      this.pixels[row][column] = number;
      number++;
      if(column + 1 < 10 && pixels[row][column+1] == 0){
          this.pixels[row][column+1] = number;
          number++;
          pairs.add(new cords(row,column+1));
        }
      if(row + 1 < 10 && pixels[row+1][column] == 0){
          this.pixels[row+1][column] = number;
          number++;
          pairs.add(new cords(row+1,column));
        }
      if(column - 1 > -1 && pixels[row][column-1] == 0){
          this.pixels[row][column-1] = number;
          number++;
          pairs.add(new cords(row,column-1));
        }
      if(row -1 > -1 && pixels[row-1][column] == 0) {
          this.pixels[row-1][column] = number;
          number++;
          pairs.add(new cords(row-1,column));
        }
      
      while(pairs.size() > 0){
          transfer = pairs.remove();
          floodfill(transfer.x,transfer.y);
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
