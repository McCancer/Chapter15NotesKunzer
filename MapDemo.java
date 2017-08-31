import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
   This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
   public static void main(String[] args)
   {
       //create Map: favoriteColors
       Map<String , Color> favoriteColors = new HashMap<>();
       favoriteColors.put("Juliet", Color.BLUE);
       favoriteColors.put("Romeo", Color.GREEN);
       favoriteColors.put("Adam", Color.RED);
       favoriteColors.put("Eve", Color.BLUE);
      //create Set<String> keySet
      Set<String> keySet = favoriteColors.keySet();
      // Print all keys and values in the map
      

      for (String key: keySet)
      {
          if (key.equals("Romeo")){
              favoriteColors.remove(key);
            }
          
          Color value = favoriteColors.get(key);
          if(value == Color.BLUE){
              favoriteColors.remove(key);
            }
          System.out.println(key + " : " + value);
      }
      
      
   }
}
