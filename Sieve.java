import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
   A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Compute primes up to which integer?");
      int n = in.nextInt();

      // Your work goes here
      
      Set<Integer> numbers = new TreeSet<>();
      for( int i = 2; i <= n; i++){
          numbers.add(new Integer(i));
      }
      
      for( int i  = 2; i<= (int)Math.sqrt(n);i++){
          if(i != 2 && i !=3 && i != 5 && i!=7){
              if(){
                }
            }
        }
      System.out.println(numbers);



   }
}
